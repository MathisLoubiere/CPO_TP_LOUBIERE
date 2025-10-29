/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_stats_loubiere;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mloub
 */
public class TP1_stats_LOUBIERE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random generateurAleat = new Random();

        int[] des = new int[6];

        System.out.print("Combien de fois voulez-vous lancer le dé ? ");
        int m = sc.nextInt();

        for (int i = 0; i < m; i++) {
            int face = generateurAleat.nextInt(6); 
            des[face]++; 
        }

        System.out.println("\nRésultats des lancers :");
        for (int i = 0; i < des.length; i++) {
            System.out.println("Face " + (i + 1) + " : " + des[i] + " fois");
        }

        System.out.println("\nRésultats en pourcentage :");
        for (int i = 0; i < des.length; i++) {
            double pourcentage = (des[i] * 100.0) / m;
            System.out.println("Face " + (i + 1) + " : " + String.format("%.2f", pourcentage) + " %");
        }

        sc.close();// TODO code application logic here
    }
    
}
