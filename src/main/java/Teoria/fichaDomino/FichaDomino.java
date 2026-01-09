/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Teoria.fichaDomino;

/**
 *
 * @author Usuario
 */
public class FichaDomino {
    
    private int numeroI;
    private int numeroD;

    public FichaDomino(int numeroI, int numeroD) {
        this.numeroI = numeroI;
        this.numeroD = numeroD;
    }
    
    
    
    public String voltea(){
        int aux = this.numeroI;
        this.numeroI = this.numeroD;
        this.numeroD = aux;
        return toString();
    }
    
    public String toString(){
        return "[" + numeroI + " | " + numeroD + "]";
    }
    
    public boolean encaja(FichaDomino ficha){
        if (this.numeroD == ficha.getNumeroI()) return true;
        return false;
    }

    public int getNumeroI() {
        return numeroI;
    }

    public int getNumeroD() {
        return numeroD;
    }
}
