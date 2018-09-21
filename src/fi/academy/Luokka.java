package fi.academy;

public class Luokka {
    private String sana;

    public String getIsoSana() {
        return sana.toUpperCase();
    }

    public String getSana() {
        return sana;
    }

    public void setSana(String sana) {
        this.sana = sana;
    }
}