/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_loubiere;

/**
 *
 * @author mloub
 */
public class TP2_Bieres_LOUBIERE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls", (float) 7.0,"Dubuisson") ;
        uneBiere.lireEtiquette();
        uneBiere.Decapsuler();
        BouteilleBiere autreBiere = new BouteilleBiere("Leffe", (float) 6.6,"Abbaye de Leffe") ;
        autreBiere.lireEtiquette();
        autreBiere.Decapsuler();
        BouteilleBiere deuxBiere = new BouteilleBiere("Heineken", (float) 5.0,"Heineken N.V") ;
        deuxBiere.lireEtiquette();
        deuxBiere.Decapsuler();
        BouteilleBiere troisBiere = new BouteilleBiere("Aflligem", (float) 6.8,"Brasserie Affligem") ;
        troisBiere.lireEtiquette();
        troisBiere.Decapsuler();
        BouteilleBiere quatreBiere = new BouteilleBiere("Amstel", (float) 4.1,"Amstel Brouweri") ;
        quatreBiere.lireEtiquette();
        quatreBiere.Decapsuler();
        System.out.println(uneBiere);
        
    }
}
