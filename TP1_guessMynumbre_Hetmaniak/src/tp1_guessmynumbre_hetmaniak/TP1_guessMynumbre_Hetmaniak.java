/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guessmynumbre_hetmaniak;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Titouan HETMANIAK
 */
public class TP1_guessMynumbre_Hetmaniak {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        Random generateurAleat = new Random();
        
        // Generer un nombre aleatoire entre 0 et 100
        int nombreMystere = generateurAleat.nextInt(101);
        
        System.out.println("Bienvenue dans le jeu : Guess my number !");
        System.out.println("J'ai choisi un nombre entre 0 et 100. À vous de le deviner !");
        
        int tentative = 0;  
        int proposition;
        
        
        // Boucle principale 
        do {
             System.out.print("Entrez un nombre entre 0 et 100 : ");
             proposition = clavier.nextInt();
             tentative++;
             
             if (proposition < nombreMystere) {
                 System.out.println("Trop petit !");
             } else if (proposition > nombreMystere) {
                 System.out.println("Trop grand !");
             } else {
                 System.out.println("Bravo ! Vous avez trouvé le nombre mystère !");
                 System.out.println("Nombre de tentatives : " + tentative);
             }
        } while (proposition != nombreMystere);
        
        
    }
    
}
