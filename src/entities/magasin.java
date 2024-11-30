package entities;

import java.util.ArrayList;
import java.util.List;

public class magasin {
    private int id ;
    private String adress;
    private int capacity;
    private static final int CAPATICY_MAX=50;
    private static final int EMPLOYEE_MAX=20;
    private List<produit> products ;
    private List<employee> employees ;
    public void addProductToMarket(produit product){
    if ( this.findProduct(product)){
        System.out.println("le produit existe deja !! veuiller verifier ");

    }else {
        if(capacity<50)
        {
            this.products.add(product);
            this.capacity++;
        }else {System.out.println("desolé il ne reste plus de place dans le stock");}
    }

    }

    public magasin() {
    }

    public int getCapacity() {
        return capacity;
    }

    public magasin(int id, String adress, int capacity, List<produit> products) {
        this.id = id;
        this.adress = adress;
        this.capacity = capacity;
        this.products = products;
    }

    public magasin(int id, String adress) {
        this.id = id;
        this.adress = adress;
    }

    public magasin(int id, String adress, List<employee> employees) {
        this.id = id;
        this.adress = adress;
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "magasin{" +
                "id=" + id +
                ", adress='" + adress + '\'' +
                ", capacity=" + capacity +
                ", products=" + products +
                ", employees=" + employees +
                '}';
    }

    public int productsCount(){
        return this.products.size();
    }
    public boolean findProduct(produit p){
        for ( int i = 0 ; i < this.products.size();i++)
        {
            if ( this.products.get(i).comparer(p)){return true;}else return false;
        }
        return false;
    }

    public magasin(int id, String adress, List<produit> products, List<employee> employees) {
        this.id = id;
        this.adress = adress;
        this.products = products;
        this.employees = employees;
    }

    public void deleteProduct(produit p)
    {   if(this.findProduct(p)){
        this.products.remove(p);
        System.out.println("produit supprimé avec succes");
    }else{
        System.out.println("le produit n'existe pas ");
    }


    }
    public static magasin moreMarketProducts(magasin m1 , magasin m2)
    {
        if(m1.productsCount()>m2.productsCount())
        {
            return m1;
        }
        else return m2;
    }
    public void assignEmployetoMarket(employee e){
       this.employees.add(e);

    }
}
