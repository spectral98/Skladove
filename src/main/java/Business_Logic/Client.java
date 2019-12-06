package Business_Logic;

public class Client extends Parametri{
    private int ID;
    Client(){}

    public Client(String ime, String familia, String address, String grad, int ID) {
        super(ime, familia, address, grad);
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}
