package Business_Logic;

public class Parametri {

    private String Ime;
    private String Familia;
    private String Address;
    private String Grad;

Parametri(){}

    public Parametri(String ime, String familia, String address, String grad) {
        this.Ime = ime;
        this.Familia = familia;
        this.Address = address;
        this.Grad = grad;
    }

    public String getIme() {
        return Ime;
    }

    public void setIme(String ime) {
        this.Ime = ime;
    }

    public String getFamilia() {
        return Familia;
    }

    public void setFamilia(String familia) {
        this.Familia = familia;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        this.Address = address;
    }

    public String getGrad() {
        return Grad;
    }

    public void setGrad(String grad) {
        this.Grad = grad;
    }
}
