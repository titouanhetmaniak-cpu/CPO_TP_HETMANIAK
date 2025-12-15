/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author Titouan HETMANIAK
 */
public class BouteillesBieres {

    /**x    
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des Trolls", 7.0, "Dubuisson");
        BouteilleBiere secondeBiere = new BouteilleBiere("Leffe", 6.6, "Abbaye de Leffe");
        BouteilleBiere troisiemeBiere = new BouteilleBiere("Chimay Bleue", 9.0, "Abbaye de Scourmont");
        BouteilleBiere quatriemeBiere = new BouteilleBiere("Heineken", 5.0, "Heineken");
        BouteilleBiere cinquiemeBiere = new BouteilleBiere("Kronenbourg", 4.2, "Kronenbourg");

        uneBiere.lireEtiquette();
        secondeBiere.lireEtiquette();

        uneBiere.Decapsuler();
        uneBiere.Decapsuler();

        System.out.println("\n--- État des bières ---");
        System.out.println(uneBiere);
        System.out.println(secondeBiere);
        System.out.println(troisiemeBiere);
        System.out.println(quatriemeBiere);
        System.out.println(cinquiemeBiere);
    }
}
