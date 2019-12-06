package Business_Logic;

public class Potrebitel extends Parametri{
    private String User_Name;
    private String Password;

    public Potrebitel() {
    }

    public Potrebitel(String ime, String familia, String address, String grad, String user_Name, String password) {
        super(ime, familia, address, grad);
        this.User_Name = user_Name;
        this.Password = password;
    }
}
