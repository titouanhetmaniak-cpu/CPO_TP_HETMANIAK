/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_hetmaniak;

import tp3_heroic_fantasy_hetmaniak.ARMES.Arme;

/**
 *
 * @author Titouan HETMANIAK
 */
public class BATON {
    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author emeri
 */
public class Baton extends Arme {
    // Attribut spécifique à Baton
    private int age;

    // Constructeur pour initialiser nom, niveau d'attaque, et age
    public Baton(String nom, int niveauAttaque, int age) {
        super(nom, niveauAttaque);  // Appel du constructeur de Arme
        this.age = Math.min(age, 100);  // Limite l'âge à 100
    }

    // Méthode pour obtenir l'âge
    public int getAge() {
        return age;
    }

    // Redéfinition de toString pour inclure l'âge
    @Override
    public String toString() {
        return super.toString() + ", Âge : " + age;
    }
}

    
}
