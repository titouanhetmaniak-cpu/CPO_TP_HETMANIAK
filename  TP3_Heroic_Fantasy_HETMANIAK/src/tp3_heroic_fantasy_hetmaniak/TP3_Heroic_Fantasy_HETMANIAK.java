/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_hetmaniak;

import tp3_heroic_fantasy_hetmaniak.ARMES.Arme;

/**
 *
 * @author emeri
 */
public class Epee extends Arme {
    int finesse;

    public Epee(int finesse, String nom, int attaque) {
        super(nom, attaque);
        this.finesse = Math.min(finesse, 100);
    }
    
    public int getFinesse() {
        return finesse;
    }
    
    public String toString() {
        return super.toString() + ", Finesse : " + finesse;
    }
}