package Business_Logic;

public class Formulqr extends Sklad{

    private String period;
    private Client client;

    public Formulqr(){}

    public Formulqr(String period, Client client) {
        super();
        this.period = period;
        this.client = client;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
