/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3armes;

/**
 *
 * @author Titouan HETMANIAK
 */
public class EPEE {
    
public class Epee extends ARMES {

    private int finesse;

    public Epee(String nom, int niveauAttaque, int finesse) {
        super(nom, niveauAttaque);
        this.finesse = finesse;
    }

    public int getFinesse() {
        return finesse;
    }

    public String toString() {
        return super.toString() + " | Finesse : " + finesse;
    }
}

    
}
