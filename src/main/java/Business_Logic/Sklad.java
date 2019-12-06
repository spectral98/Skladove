package Business_Logic;

import java.util.List;

public class Sklad {
    private int ID;
    private String Description;
    private String Grad;
    private double Cena;
    private List<Items>items;

   public Sklad(){}

    public Sklad(int ID, String description, String grad, double cena, List<Items> items) {
        this.ID = ID;
        this.Description = description;
        this.Grad = grad;
        this.Cena = cena;
        this.items = items;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        this.Description = description;
    }

    public String getGrad() {
        return Grad;
    }

    public void setGrad(String grad) {
        this.Grad = grad;
    }

    public double getCena() {
        return Cena;
    }

    public void setCena(double cena) {
        this.Cena = cena;
    }

    public List<Items> getItems() {
        return items;
    }

    public void setItems(List<Items> items) {
        this.items = items;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}
