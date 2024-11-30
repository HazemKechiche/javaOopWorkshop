package entities;

import java.util.Date;
import java.util.Objects;


public class produit {
    private int id ;
    private String libelle;
    private String marque;
    private double prix;
    private Date dateExpiration;
    public produit(){

    }

    public produit(int id, String libelle, String marque) {
        this.id = id;
        this.libelle = libelle;
        this.marque = marque;
    }

    public produit(int id, String libelle, String marque, double prix) {
        this.id = id;
        this.libelle = libelle;
        this.marque = marque;
        this.prix = prix;
    }
    public void afficher(){
        System.out.println("Produit : "+ this.id + " nom Produit : " + this.libelle+" la marque du produit : "+ this.marque+" et le prix c a "+ this.prix+" date d'expiration : " + this.dateExpiration);

    }

    public produit(int id, String libelle, String marque, double prix, Date dateExpiration) {
        this.id = id;
        this.libelle = libelle;
        this.marque = marque;
        if(prix>=0){
            this.prix = prix;}
        else {System.out.println("dsl prix doit etre positive");}
        this.dateExpiration = dateExpiration;
    }

    @Override
    public String toString() {
        return "produit{" +
                "id=" + id +
                ", libelle='" + libelle + '\'' +
                ", marque='" + marque + '\'' +
                ", prix=" + prix +
                ", dateExpiration=" + dateExpiration +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        if(prix>=0){
        this.prix = prix;}
        else {System.out.println("dsl prix doit etre positive");}
    }

    public Date getDateExpiration() {
        return dateExpiration;
    }

    public void setDateExpiration(Date dateExpiration) {
        this.dateExpiration = dateExpiration;
    }

    public  boolean comparer(produit p)
    {
        if((this.id==p.id)&&(this.libelle==p.libelle)&&(this.prix==p.prix))
        {return true;}
        else return false;
    }
    public static boolean comparer2(produit p1,produit p2)
    {
        if((p1.id==p2.id)&&(p1.libelle==p2.libelle)&&(p1.prix==p2.prix))
        {return true;}
        else return false;
    }



}
