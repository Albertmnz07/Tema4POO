/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Teoria.fichaDomino;

/**
 *
 * @author Usuario
 */
public class MainFichaDomino {

    public static void main(String[] args) {
        FichaDomino f1 = new FichaDomino(6, 1);
        FichaDomino f2 = new FichaDomino(0, 4);
        FichaDomino f3 = new FichaDomino(3, 3);
        FichaDomino f4 = new FichaDomino(1, 0);
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
        System.out.println(f4);
        System.out.println(f2.voltea());
        System.out.println(f2.encaja(f4)); 
        System.out.println(f1.encaja(f4)); 
        System.out.println(f1.encaja(f3));
        System.out.println(f1.encaja(f2));
//Salida:
//[6|1]
//[ |4]
//[3|3]
//[ |1]
//[4| ]
//false
//true
//false
//false
    }

}
