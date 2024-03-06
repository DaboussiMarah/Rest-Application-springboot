package model;

public class produit {
    private int code;
    private String lib;
    private double prix;
    private int quantite;
    private int idcategorie;

    public produit() {
    }

    public produit(int code, String lib, double prix, int quantite, int idcategorie) {
        this.code = code;
        this.lib = lib;
        this.prix = prix;
        this.quantite = quantite;
        this.idcategorie = idcategorie;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getLib() {
        return lib;
    }

    public void setLib(String lib) {
        this.lib = lib;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public int getFkcategorie() {
        return idcategorie;
    }

    public void setFkcategorie(int idcategorie) {
        this.idcategorie = idcategorie;
    }
}