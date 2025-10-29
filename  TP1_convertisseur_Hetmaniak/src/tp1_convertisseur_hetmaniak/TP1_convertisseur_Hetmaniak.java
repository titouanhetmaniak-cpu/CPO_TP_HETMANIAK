/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_convertisseur_hetmaniak;

/**
 *
 * @author Titouan HETMANIAK
 */
public class TP1_convertisseur_Hetmaniak {
    
    public static double CelciusVersKelvin(double tCelcius) {
        return tCelcius + 273.15; 
    }
    public static double KelvinVersCelcius(double tKelvin) {
        return tKelvin - 273.15; 
    }
    public static double CelciusVersFarenheit(double tCelcius) {
        return (tCelcius * 9/5)+ 32; 
    }
     public static double FarenheitVersCelcius(double tFarenheit) {
         return (tFarenheit - 32)*5/9;
     }
    public static double KelvinVersFarenheit(double tKelvin) {
        return (tKelvin - 273.15) * 9 / 5 + 32;
    }
    public static double FarenheitVersKelvin(double tFarenheit) {
        return (tFarenheit - 32) * 5 / 9 + 273.15;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        
         System.out.print("Bonjour, saisissez une valeur : ");
         double valeur = clavier.nextDouble();
         
          System.out.println("Saisissez la conversion que vous souhaitez effectuer : ");
          System.out.println("1) De Celcius vers Kelvin");
          System.out.println("2) De Kelvin vers Celcius");
          System.out.println("3) De Celcius vers Farenheit");
          System.out.println("4) De Farenheit vers Celcius");
          System.out.println("5) De Kelvin vers Farenheit");
          System.out.println("6) De Farenheit vers Kelvin");
          System.out.print("Votre choix : ");
          int choix = clavier.nextInt();
          
          double resultat = 0;
          
          if (choix == 1) {
              resultat = CelciusVersKelvin(valeur);
              System.out.println(valeur + " degrés Celcius est égal à " + resultat + " degrés Kelvin");
          } else if (choix == 2) {
              resultat = KelvinVersCelcius(valeur);
              System.out.println(valeur + " degrés Kelvin est égal à " + resultat + " degrés Celcius");
          } else if (choix == 3) {
              resultat = CelciusVersFarenheit(valeur);
              System.out.println(valeur + " degrés Celcius est égal à " + resultat + " degrés Farenheit");
          } else if (choix == 4) {
              resultat = FarenheitVersCelcius(valeur);
              System.out.println(valeur + " degrés Farenheit est égal à " + resultat + " degrés Celcius");
          } else if (choix == 5) {
              resultat = KelvinVersFarenheit(valeur);
              System.out.println(valeur + " degrés Kelvin est égal à " + resultat + " degrés Farenheit");
          } else if (choix == 6) {
              resultat = FarenheitVersKelvin(valeur);
              System.out.println(valeur + " degrés Farenheit est égal à " + resultat + " degrés Kelvin");
         
          }
          
          clavier.close();
        

    }
    
}
