package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import util.ConnectionUtil;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;

public class FXMLDocumentController implements Initializable {
    private static Logger logger = LogManager.getLogger(LoginApplication.class);

    @FXML
    private TextField textUsername;

    @FXML
    private PasswordField textPassword;

    private Connection connection = null;

    public FXMLDocumentController() {
        connection = ConnectionUtil.connectdb();
    }



    public void loginAction(ActionEvent event){
        String username = textUsername.getText().toString();
        String password = textPassword.getText().toString();

        String sql = "SELECT * FROM potrebitel WHERE username = ? and password = ?";

        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            ResultSet resultSet = preparedStatement.executeQuery();
            if(!resultSet.next()){
                infoBox("Моля въведете коректни данни", "Грешка");
            }else{
                infoBox("Успешно влизане", "Логнат" );
                Node node = (Node)event.getSource();
                Stage dialogStage = (Stage) node.getScene().getWindow();
                dialogStage.close();

                Scene scene = new Scene(FXMLLoader.load(getClass().getResource("/AdminLogin.fxml")));
                dialogStage.setScene(scene);
                dialogStage.show();
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }


    private static void infoBox(String infoMessage, String title){
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setContentText(infoMessage);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.showAndWait();
    }



    @Override
    public void initialize(URL url, ResourceBundle rb) {


    }

}