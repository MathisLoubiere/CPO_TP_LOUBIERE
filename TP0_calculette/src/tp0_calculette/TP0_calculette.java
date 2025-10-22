/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp0_calculette;

import java.util.Scanner;

/**
 *
 * @author mloub
 */
public class TP0_calculette {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // initialisation 
    System.out.println("""
                       Please enter the operator: 
                       1) add 
                       2) substract 
                       3) multiply 
                       4) divide 
                       5) modulo """);
    int operateur;
    int operande1;
    int operande2;
    Scanner sc = new Scanner(System.in); 
    System.out.println("Entrer le nombre :");
    operateur = sc.nextInt();
    
    Scanner sb ;
    sb = new Scanner(System.in);
    System.out.println("Entrer le nombre :");
    operande1 = sc.nextInt();
    
    Scanner sa ;
    sa = new Scanner(System.in);
    System.out.println("Entrer le nombre :");
    operande2 = sc.nextInt();

    }
    
}
