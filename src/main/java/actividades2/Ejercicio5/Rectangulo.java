/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividades2.Ejercicio5;

/**
 *
 * @author Usuario
 */
public class Rectangulo {
    
    private double alto = 1 , ancho = 1;

    public Rectangulo(double alto , double ancho) {
        this.alto = alto;
        this.ancho = ancho;
    }
    
    public Rectangulo(){
        
    }
    
    public double calcularPerimetro(){
        return alto * 2 + ancho * 2;
    }
    
    public double calcularArea(){
        return alto * ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        if (alto > 0 && alto < 20){
            this.alto = alto;
        }
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        if (alto > 0 && alto < 20){
            this.ancho = ancho;
        }
    }
    
    public String toString(){
        int alto = (int) this.alto;
        int ancho = (int) this.ancho;
        
        String resultado = "";
        
        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < ancho; j++) {
                if (i == 0 || j == 0 || i == alto-1 || j == ancho-1){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        
        return resultado;
    }

    
    
    
}
