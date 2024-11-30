import entities.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

  produit produit = new produit();
  produit p1 = new produit(1021, "Lait" ," Delice",-0.700,new  Date("12/5/2020"));
  produit p2 = new produit(2510, "Yaourt" ," Vitalait",0.5,new Date("12/1/2020"));
  produit p3 = new produit(3250, "Tomate," ," Sicam",1.200,new Date("12/4/2020"));
  p1.afficher();
  p2.afficher();
  p3.afficher();
        System.out.println(p2);
        magasin m = new magasin();
        magasin mg= new magasin(1,"sousse",48,new ArrayList<>());
        mg.addProductToMarket(p1);
        mg.addProductToMarket(p2);
        mg.addProductToMarket(p3);
//System.out.println(mg.productsCount());
//
//        System.out.println(p1.comparer(p2));
//        System.out.println(produit.comparer2(p1,p2));
//        System.out.println(mg);
//        System.out.println(mg.findProduct(p1));
//        mg.deleteProduct(p1);
//        System.out.println(mg.productsCount());
//        magasin m2= new magasin(1,"sousse",48,new ArrayList<>());
//        m.moreMarketProducts(mg,m2);
//        System.out.println(m.moreMarketProducts(mg,m2));

        magasin Carrefour = new magasin(11,"Centre-ville",new ArrayList<>(),new ArrayList<>());
        magasin Monoprix = new magasin(12,"Menzah 6");
        employee caissier1 =new Caissier(1,"ahmed","centre-ville",182,1);
        employee caissier2 = new Caissier(2,"houssem","centre ville",205,2)  ;
        employee vendeur1= new Vendeur(1,"aziz","centre-ville",120,2);
        employee responsable1 = new Responsable(1,"Hazem","centre-ville",163,250.0);
        Carrefour.assignEmployetoMarket(caissier1);
        Carrefour.assignEmployetoMarket(caissier2);
        Carrefour.assignEmployetoMarket(vendeur1);
        Carrefour.assignEmployetoMarket(responsable1);
        Carrefour.addProductToMarket(p1);
        Carrefour.addProductToMarket(p2);
        System.out.println(Carrefour);
        responsable1.calculateSalary();
        caissier2.calculateSalary();
        caissier1.calculateSalary();
        vendeur1.calculateSalary();




    }

}