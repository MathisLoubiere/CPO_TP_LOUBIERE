/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_convertisseur_.loubiere;

import java.util.Scanner;

/**
 *
 * @author mloub
 */
public class TP1_Convertisseur_LOUBIERE {

    /**
     */


       

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valeur;
        int choix;

        System.out.println("Bonjour, saisissez une valeur : ");
        valeur = sc.nextDouble();

        System.out.println("Saisissez la conversion que vous souhaitez effectuer :");
        System.out.println("1) De Celsius vers Kelvin");
        System.out.println("2) De Kelvin vers Celsius");
        System.out.println("3) De Fahrenheit vers Celsius");
        System.out.println("4) De Celsius vers Fahrenheit");
        System.out.println("5) De Kelvin vers Fahrenheit");
        System.out.println("6) De Fahrenheit vers Kelvin");
        choix = sc.nextInt();

        double resultat = 0;

        switch (choix) {
            case 1 -> {
                resultat = CelciusVersKelvin(valeur);
                System.out.println(valeur + " °C = " + resultat + " K");
            }
            case 2 -> {
                resultat = KelvinVersCelcius(valeur);
                System.out.println(valeur + " K = " + resultat + " °C");
            }
            case 3 -> {
                resultat = FarenheitVersCelcius(valeur);
                System.out.println(valeur + " °F = " + resultat + " °C");
            }
            case 4 -> {
                resultat = CelciusVersFarenheit(valeur);
                System.out.println(valeur + " °C = " + resultat + " °F");
            }
            case 5 -> {
                resultat = KelvinVersFarenheit(valeur);
                System.out.println(valeur + " K = " + resultat + " °F");
            }
            case 6 -> {
                resultat = FarenheitVersKelvin(valeur);
                System.out.println(valeur + " °F = " + resultat + " K");
            }
            default -> System.out.println("Choix invalide !");
        }

        sc.close();
    }


    public static double CelciusVersKelvin(double tCelcius) {
        return tCelcius + 273.15;
    }

    public static double KelvinVersCelcius(double tKelvin) {
        return tKelvin - 273.15;
    }

    public static double FarenheitVersCelcius(double tFarenheit) {
        return (tFarenheit - 32) * 5 / 9;
    }

    public static double CelciusVersFarenheit(double tCelcius) {
        return (tCelcius * 9 / 5) + 32;
    }

    public static double KelvinVersFarenheit(double tKelvin) {
        return CelciusVersFarenheit(KelvinVersCelcius(tKelvin));
    }

    public static double FarenheitVersKelvin(double tFarenheit) {
        return CelciusVersKelvin(FarenheitVersCelcius(tFarenheit));
    }
}
    }
    

