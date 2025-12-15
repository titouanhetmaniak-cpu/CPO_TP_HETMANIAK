/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2.grand.pkg2;

import java.util.Scanner;

/**
 *
 * @author Titouan HETMANIAK
 */
public class TP2Grand2 {
    public class Convertisseur {

    int nbConversions;

    public Convertisseur() {
        nbConversions = 0;
    }

    public double CelciusVersKelvin(double tCelcius) {
        nbConversions++;
        return tCelcius + 273.15;
    }

    public double KelvinVersCelcius(double tKelvin) {
        nbConversions++;
        return tKelvin - 273.15;
    }

    public double FarenheitVersCelcius(double tFarenheit) {
        nbConversions++;
        return (tFarenheit - 32) * 5.0/9.0;
    }

    public double CelciusVersFarenheit(double tCelcius) {
        nbConversions++;
        return (tCelcius * 9.0/5.0) + 32;
    }

    public double KelvinVersFarenheit(double tKelvin) {
        nbConversions++;
        return CelciusVersFarenheit(KelvinVersCelcius(tKelvin));
    }

    public double FarenheitVersKelvin(double tFarenheit) {
        nbConversions++;
        return CelciusVersKelvin(FarenheitVersCelcius(tFarenheit));
    }

    @Override
    public String toString() {
        return "nb de conversions " + nbConversions;
    }
}


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);

        Convertisseur conv1 = new Convertisseur();
        Convertisseur conv2 = new Convertisseur();

        System.out.println("=== MENU CONVERSIONS ===");
        System.out.println("1 : Celcius → Kelvin");
        System.out.println("2 : Kelvin → Celcius");
        System.out.println("3 : Farenheit → Celcius");
        System.out.println("4 : Celcius → Farenheit");
        System.out.println("5 : Kelvin → Farenheit");
        System.out.println("6 : Farenheit → Kelvin");
        System.out.print("Choix : ");
        int choix = sc.nextInt();

        System.out.print("Température à convertir : ");
        double t = sc.nextDouble();

        double resultat = 0;

        switch (choix) {
            case 1 -> resultat = conv1.CelciusVersKelvin(t);
            case 2 -> resultat = conv1.KelvinVersCelcius(t);
            case 3 -> resultat = conv1.FarenheitVersCelcius(t);
            case 4 -> resultat = conv1.CelciusVersFarenheit(t);
            case 5 -> resultat = conv1.KelvinVersFarenheit(t);
            case 6 -> resultat = conv1.FarenheitVersKelvin(t);
            default -> System.out.println("Erreur de choix !");
        }

        System.out.println("Résultat = " + resultat);

        // Utilisation du second convertisseur
        conv2.CelciusVersKelvin(10);
        conv2.CelciusVersKelvin(25);

        System.out.println("\nÉtat convertisseur 1 : " + conv1);
        System.out.println("État convertisseur 2 : " + conv2);
    }
}

    
    
    

