package Business_Logic;

public class Agent extends Potrebitel{
    private int ID;
    private double Honorar;

  public Agent(){}


    public Agent(String ime, String familia, String address, String grad, String user_Name, String password, int ID, double honorar) {
        super(ime, familia, address, grad, user_Name, password);
        this.ID = ID;
        this.Honorar = honorar;
    }

    public double getHonorar() {
        return Honorar;
    }

    public void setHonorar(double honorar) {
        this.Honorar = honorar;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}
