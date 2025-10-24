/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_manipnombresint_loubiere;

import java.util.Scanner;

/**
 *
 * @author mloub
 */
public class TP1_manipNombresInt_LOUBIERE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nombre1;
        int nombre2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer le nombre :");
        nombre1 = sc.nextInt();
        Scanner sb;
        System.out.println("Entrer le nombre :");
        nombre2 = sc.nextInt();
        int S = nombre1 + nombre2;
        System.out.println("La somme des deux nombres est " +S);
        int D = nombre1-nombre2;
        System.out.println("La différence des deux nombres est " +D);
        int P = nombre1*nombre2;
        System.out.println("La différence des deux nombres est " +P);
        if (nombre2!=0){
            int e = nombre1/ nombre2;
            System.out.println("La division des deux nombres est " +e);
            int r = nombre1% nombre2;
            System.out.println("Le reste de la division des deux nombres est " +r);
    }   else {
            System.out.println("Division impossible car le denominateur est egale à 0");
        
        
    }    
    }
    
}
