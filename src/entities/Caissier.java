package entities;

public class Caissier extends employee {
    protected int num_caisse;
    protected Caissier(){}

    public Caissier(int id, String nom, String adresse, int nbr_heures, int num_caisse) {
        super(id, nom, adresse, nbr_heures);
        this.num_caisse = num_caisse;
    }

    @Override
    public String toString() {
        return super.toString() +"Caissier{" +
                "num_caisse=" + num_caisse +
                '}';
    }

    @Override
    public void calculateSalary() {
        int heurePlus = this.getNbr_heures() - 180;
        double prixHeurePlus =((15*5)/100);
        System.out.println(heurePlus);
        System.out.println("le salaire du caissier "+ this.getNom()+ " est " + ((heurePlus*prixHeurePlus)+(5*this.getNbr_heures())));
    }
}
