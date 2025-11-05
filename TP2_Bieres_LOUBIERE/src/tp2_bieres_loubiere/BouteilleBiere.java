/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_loubiere;

/**
 *
 * @author mloub
 */
public class BouteilleBiere {
    String nom;
    float degreAlcool;
    String  brasserie;
    boolean ouverte;
    
    public void lireEtiquette() { 
        System.out.println("Bouteille de " + nom +" (" + degreAlcool + " degres) \nBrasserie : " + brasserie ) ; 
}   
    public BouteilleBiere(String unNom, float unDegre, String uneBrasserie) { 
    nom = unNom; 
    degreAlcool =  unDegre; 
    brasserie = uneBrasserie; 
    ouverte = false; 
    }
    public boolean Decapsuler() {
        if (!ouverte) {
            ouverte = true;
            System.out.println("La bière " + nom + " est maintenant ouverte "+"\n");
            return true;
        } else {
            System.out.println("Erreur : la bière " + nom + " est deja ouverte "+"\n");
            return false;
        }
 
}
         
}  


