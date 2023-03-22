package org.example;

public class Vartotojas {
    private int vartotojoId;
    private String vardas;
    private String pavarde;
    private String elPastoAdresas;
    private int role;
    private String pseudonimas;
    private String slaptazodis;

    public Vartotojas() {
    }

    public Vartotojas(int vartotojoId, String vardas, String pavarde, String elPastoAdresas, int role, String pseudonimas, String slaptazodis) {
        this.vartotojoId = vartotojoId;
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.elPastoAdresas = elPastoAdresas;
        this.role = role;
        this.pseudonimas = pseudonimas;
        this.slaptazodis = slaptazodis;
    }

    public Vartotojas(String vardas, String pavarde, String elPastoAdresas, int role, String pseudonimas, String slaptazodis) {
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.elPastoAdresas = elPastoAdresas;
        this.role = role;
        this.pseudonimas = pseudonimas;
        this.slaptazodis = slaptazodis;
    }

    public int getVartotojoId() {
        return vartotojoId;
    }


    public String getVardas() {
        return vardas;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public String getPavarde() {
        return pavarde;
    }

    public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }

    public String getElPastoAdresas() {
        return elPastoAdresas;
    }

    public void setElPastoAdresas(String elPastoAdresas) {
        this.elPastoAdresas = elPastoAdresas;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public String getPseudonimas() {
        return pseudonimas;
    }

    public void setPseudonimas(String pseudonimas) {
        this.pseudonimas = pseudonimas;
    }

    public String getSlaptazodis() {
        return slaptazodis;
    }

    public void setSlaptazodis(String slaptazodis) {
        this.slaptazodis = slaptazodis;
    }

    @Override
    public String toString() {
        return "Vartotojas{" +
                "vartotojoId=" + vartotojoId +
                ", vardas='" + vardas + '\'' +
                ", pavarde='" + pavarde + '\'' +
                ", elPastoAdresas='" + elPastoAdresas + '\'' +
                ", role=" + role +
                ", pseudonimas='" + pseudonimas + '\'' +
                ", slaptazodis='" + slaptazodis + '\'' +
                '}';
    }
}

