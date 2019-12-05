package Business_Logic;

public class Sobstvenik {


    private String Ime;
    private String Familia;
    private String User_Name;
    private String Password;
    private String Address;
    private String Grad;


public Sobstvenik(){}

    public Sobstvenik(String ime, String familia, String user_Name, String password, String address, String grad) {
        Ime = ime;
        Familia = familia;
        User_Name = user_Name;
        Password = password;
        Address = address;
        Grad = grad;
    }

    public String getIme() {
        return Ime;
    }

    public void setIme(String ime) {
        Ime = ime;
    }

    public String getFamilia() {
        return Familia;
    }

    public void setFamilia(String familia) {
        Familia = familia;
    }

    public String getUser_Name() {
        return User_Name;
    }

    public void setUser_Name(String user_Name) {
        User_Name = user_Name;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getGrad() {
        return Grad;
    }

    public void setGrad(String grad) {
        Grad = grad;
    }
}
