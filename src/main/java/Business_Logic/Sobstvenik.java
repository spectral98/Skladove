package Business_Logic;

public class Sobstvenik extends Potrebitel{
    private int ID;
public Sobstvenik(){}

    public Sobstvenik(String ime, String familia, String address, String grad, String user_Name, String password, int ID) {
        super(ime, familia, address, grad, user_Name, password);
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}
