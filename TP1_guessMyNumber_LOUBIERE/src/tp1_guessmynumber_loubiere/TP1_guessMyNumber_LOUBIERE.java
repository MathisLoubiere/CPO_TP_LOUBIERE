/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guessmynumber_loubiere;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mloub
 */
public class TP1_guessMyNumber_LOUBIERE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random generateurAleat = new Random();

        System.out.println("Choisissez un niveau de difficulté :");
        System.out.println("1) Facile (0 à 50)");
        System.out.println("2) Normal (0 à 100)");
        System.out.println("3) Difficile (0 à 500)");
        System.out.println("4) Cauchemar (0 à 100 avec erreurs possibles)");
        int niveau = sc.nextInt();

        int max = 100;
        boolean modeCauchemar = false;

        switch (niveau) {
            case 1 -> max = 50;
            case 2 -> max = 100;
            case 3 -> max = 500;
            case 4 -> {
                max = 100;
                modeCauchemar = true;
            }
            default -> System.out.println("Niveau invalide, mode normal choisi.");
        }
        int nombreMystere = generateurAleat.nextInt(max + 1);

        int tentative = 0;
        int nombreUtilisateur;

        System.out.println("Devinez le nombre entre 0 et " + max + " !");

        do {
            System.out.print("Votre proposition : ");
            nombreUtilisateur = sc.nextInt();
            tentative++;

            String resultat = "";

            boolean mentir = modeCauchemar && generateurAleat.nextInt(100) < 30;

            if (nombreUtilisateur < nombreMystere) {
                resultat = mentir ? "Trop grand !" : "Trop petit !";
            } else if (nombreUtilisateur > nombreMystere) {
                resultat = mentir ? "Trop petit !" : "Trop grand !";
            } else {
                resultat = "Gagné !";
            }

            System.out.println(resultat);

        } while (nombreUtilisateur != nombreMystere);

        System.out.println("Bravo ! Vous avez trouvé le nombre " + nombreMystere +
                " en " + tentative + " tentative(s).");

        sc.close();
    }
}// TODO code application logic here
    
    

