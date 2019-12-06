package Business_Logic;

public class Admin extends Potrebitel{

    private int ID;

    public Admin() {}

    public Admin(String ime, String familia, String address, String grad, String user_Name, String password, int ID) {
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
