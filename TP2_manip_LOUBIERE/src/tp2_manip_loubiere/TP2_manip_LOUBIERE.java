/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_loubiere;

/**
 *
 * @author mloub
 */
public class TP2_manip_LOUBIERE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tartiflette assiette1 = new Tartiflette(500);
        Tartiflette assiette2 = new Tartiflette(600);
        Tartiflette assiette3 = assiette2;

        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories);
        System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories);

        assiette3.nbCalories += 100;

        System.out.println("\nApres modification : ");
        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories);
        System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories);

       
        Tartiflette temp = assiette1;
        assiette1 = assiette2;
        assiette2 = temp;

        System.out.println("\nechange effectue !");
        System.out.println("Assiette1 = " + assiette1.nbCalories + " calories");
        System.out.println("Assiette2 = " + assiette2.nbCalories + " calories");

        
        Moussaka[] tab = new Moussaka[10];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = new Moussaka(200 + 10 * i);
        }
        System.out.println("\nCreation de 10 Moussaka reussie !");
    }
   
}
    
    

