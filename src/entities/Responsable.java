package entities;

public class Responsable  extends employee{
    private double prime;

    public Responsable(){

    }
    public Responsable(int id, String nom, String adresse, int nbr_heures,double prime) {
       super(id, nom, adresse, nbr_heures);
        this.prime=prime;
    }

    @Override
    public String toString() {
        return super.toString()+ "Responsable{" +
                "prime=" + prime +
                '}';
    }

    @Override
    public void calculateSalary() {
        int heurePlus = this.getNbr_heures() - 160;
        double prixHeurePlus =((20*10)/100);
        System.out.println(prixHeurePlus);
        System.out.println(heurePlus);
        System.out.println("le salaire du responsable est " + ((heurePlus*prixHeurePlus)+(10*this.getNbr_heures())));
    }
}
