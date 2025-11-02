/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_stats_hetmaniak;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Titouan HETMANIAK
 */
public class TP1_stats_Hetmaniak {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        Random generateurAleat = new Random();
        
        // creation d'un tableau de 6 entiers
        int[] tableau = new int[6];
        
        // on va demander a l'utlisateur de saisir un nombre entier m
        System.out.print("Combien de lancers de dé souhaitez-vous effectuer ? ");
        int m = clavier.nextInt();
        
        
        // boucle des lancers 
        for (int i = 0; i < m; i++) {
            int tirage = generateurAleat.nextInt(6);
             tableau[tirage]++;
        }
        
        // resultats sous forme de tableau
        System.out.println("\nRésultats des lancers :");
         for (int i = 0; i < 6; i++) {
             System.out.println("Face " + (i + 1) + " : " + tableau[i] + " fois");
             
        }
         
         System.out.println("\nPourcentages :");
         for (int i = 0; i < 6; i++) {
             double pourcentage = (tableau[i] * 100.0) / m;
             System.out.println("Face " + (i + 1) + " : " + pourcentage + " %");
         }
         
          clavier.close();
       
    }
    
}
