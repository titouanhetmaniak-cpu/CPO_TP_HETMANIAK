/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp0_calculette;

import java.util.Scanner;

/**
 *
 * @author Titouan HETMANIAK
 */
public class TP0_calculette {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int operateur;
        int operande1;
        int operande2;
        int resultat = 0; 
        
        System.out.println("Please enter the operator:");
        System.out.println("1) add");
        System.out.println("2) substract");
        System.out.println("3) multiply");
        System.out.println("4) divide");
        System.out.println("5) modulo");
        
        operateur = sc.nextInt(); 
        
         if (operateur < 1 || operateur > 5) {
            System.out.println("Erreur : opérateur invalide !");
         } else {
             
              System.out.print("Please enter the first number: ");
              operande1 = sc.nextInt();
         
              System.out.print("Please enter the second number: ");
              operande2 = sc.nextInt();
              
              if (operateur == 1) {
                  resultat = operande1 + operande2;
              } else if (operateur == 2) {
                   resultat = operande1 - operande2;
              } else if (operateur == 3){ 
                  resultat = operande1 * operande2; 
              } else if (operateur == 4) { 
                  resultat = operande1 / operande2;  
              } else if (operateur == 5) { 
                  resultat = operande1 % operande2;  
              }
                
              System.out.println("The result is : " + resultat);
         }
    
         sc.close();
    
        }
}