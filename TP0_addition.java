/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp0_addition;

import java.util.Scanner;

/**
 *
 * @author Titouan HETMANIAK
 */
public class TP0_addition {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        int nb;
        int result;
        int ind;
        
        Scanner sc = new Scanner(System.in); 
        System.out.println("Entrer le nombre d'entiers à additionner :");
        nb=sc.nextInt(); 
        
        result = 0; 
        ind = 1;
        while (ind<=nb){
            result = result + ind;
            ind++;
        }
        System.out.println("La Somme" + nb + "entiers est :" + result);
        sc.close();
    }
    
}
      
      
    

