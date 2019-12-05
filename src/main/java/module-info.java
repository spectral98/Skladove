module org.example {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires java.desktop;
    requires log4j.api;
    requires mysql.connector.java;

    opens org.example to javafx.fxml;
    exports org.example;
}