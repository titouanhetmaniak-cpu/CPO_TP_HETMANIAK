
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Titouan HETMANIAK
 */
public class CadenasGame extends javax.swing.JFrame {
    

    private int[] codeSecret;   // les 4 chiffres à deviner
    private int[] proposition;  // la proposition courante du joueur (4 chiffres)
    private int nbTentatives;   // nombre d'essais déjà effectués
    private int maxTentatives;  // nombre d'essais max autorisés

    public CadenasGame(int nbChiffres, int maxTentatives) {
        this.codeSecret = new int[nbChiffres];
        this.proposition = new int[nbChiffres];
        this.maxTentatives = maxTentatives;
        this.nbTentatives = 0;
        genererCodeSecret();
    }
    
    


    // ...

   public int[] evaluerProposition() {

    int nbExact = 0;
    int nbTropHaut = 0;
    int nbTropBas = 0;

    for (int i = 0; i < codeSecret.length; i++) {

        if (proposition[i] == codeSecret[i]) {
            nbExact++;
        }
        else if (proposition[i] > codeSecret[i]) {
            nbTropHaut++;
        }
        else { 
            nbTropBas++;
        }
    }

    nbTentatives++;   // on augmente le nombre d’essais

    return new int[]{nbExact, nbTropHaut, nbTropBas};}
   
   
public void setProposition(int[] prop) {
    this.proposition = prop.clone();
}

public String getMaxTentatives() {
    return Integer.toString(this.maxTentatives);
}

public int getNbTentatives() {
    return this.nbTentatives;
}

private void genererCodeSecret() {
    Random r = new Random();

    for (int i = 0; i < codeSecret.length; i++) {
        codeSecret[i] = r.nextInt(10);  // génère un chiffre entre 0 et 9
    }

    nbTentatives = 0;  // on remet le compteur d'essais à zéro
}

public boolean isGameOver() {
    return (nbTentatives >= maxTentatives);
}

public void reset() {
    genererCodeSecret();   // génère un nouveau code + remet nbTentatives à 0
    proposition = new int[codeSecret.length]; // remet la proposition à zéro
}

public String getIndiceSomme() {
    int somme = 0;
    for (int v : codeSecret) somme += v;
    return "Comme t'es nul voici un petit indice, la somme des chiffres vaut " + somme;
}
}


