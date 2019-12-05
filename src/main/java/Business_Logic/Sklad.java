package Business_Logic;

import java.util.List;

public class Sklad {

    private String Description;
    private String Grad;
    private double Cena;
    private List<Items>items;

   public Sklad(){}

    public Sklad(String description, String grad, double cena, List<Items> items) {
        this.Description = description;
        this.Grad = grad;
        this.Cena = cena;
        this.items = items;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getGrad() {
        return Grad;
    }

    public void setGrad(String grad) {
        Grad = grad;
    }

    public double getCena() {
        return Cena;
    }

    public void setCena(double cena) {
        Cena = cena;
    }

    public List<Items> getItems() {
        return items;
    }

    public void setItems(List<Items> items) {
        this.items = items;
    }
}
