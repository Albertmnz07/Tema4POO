/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Teoria;

/**
 *
 * @author alberto
 */
public class Rectangulo {
    
    private double largo;
    private double ancho;
    
    public Rectangulo(double largo , double ancho){
        this.largo = largo;
        this.ancho = ancho;
    }
    
    public double getArea(){
        return largo * ancho;
    }
    
    public void dibujar(){
        int largo = (int) this.largo;
        int ancho = (int) this.ancho;
        
        for (int i = 0; i < largo; i++) {
            for (int j = 0; j < ancho; j++) {
                System.out.print("*");
            }
            System.out.println("*");
        }
    }
}
