/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_manipnombresint_hetmaniak;

import java.util.Scanner;

/**
 *
 * @author Titouan HETMANIAK
 */
public class TP1_manipNombresInt_Hetmaniak {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        
        // on va demander aux utilisateurs de choisir 2 entiers 
        System.out.print("Entrez le premier entier :");
        int nb1 = clavier.nextInt();
        
        System.out.print("Entrez le second entier :");
        int nb2 = clavier.nextInt();
        
        // on va paramétrer les opérations de base 
        System.out.println("Somme : " + (nb1 + nb2));
        System.out.println("Différence : " + (nb1 - nb2));
        System.out.println("Produit : " + (nb1 * nb2));
          
        //Maintenant le quotient et le reste 
        System.out.println("Quotient entier de " + nb1 + " / " + nb2 + " = " + (nb1 / nb2));
        System.out.println("Reste de la division euclidienne = " + (nb1 % nb2));
        
        // Division exacte 
        double divisionExacte = nb1 / (nb2 * 1.0);
        System.out.println("Division exacte (avec décimales) = " + divisionExacte);
        
        clavier.close();


    }
    
}
