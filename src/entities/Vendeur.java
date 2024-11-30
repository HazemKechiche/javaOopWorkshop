package entities;

public class Vendeur extends employee {
    protected int tauxDeVente;
    protected  Vendeur(){}

    public Vendeur(int id, String nom, String adresse, int nbr_heures, int tauxDeVente) {
        super(id, nom, adresse, nbr_heures);
        this.tauxDeVente = tauxDeVente;
    }

    @Override
    public String toString() {
        return "Vendeur{" +
                "tauxDeVente=" + tauxDeVente +
                '}';
    }

    @Override
    public void calculateSalary() {
        double primeForTaux;
        primeForTaux =  ((this.tauxDeVente * 450) /100);
        System.out.println(" le salaire du vendeur est :"+ this.tauxDeVente*450);

    }
}
