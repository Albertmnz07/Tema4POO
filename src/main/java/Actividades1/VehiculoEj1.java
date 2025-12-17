/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividades1;

/**
 *
 * @author alberto
 */
public class VehiculoEj1 {
    
    private String modelo;
    private double potencia;
    private boolean traccionTotal;
    
    public VehiculoEj1(String modelo){
        this.modelo = modelo;
    }
    
    public void setPotencia(double potencia){
        this.potencia = potencia;
    }
    
    public double getPotencia(){
        return this.potencia;
    }
    
    public void setTraccionTotal(boolean traccionTotal){
        this.traccionTotal = traccionTotal;
    }
    
    public boolean getTraccionTotal(){
        return this.traccionTotal;
    }
    
    @Override
    public String toString(){
        String datos = "";
        
        datos += "Modelo: " + modelo + "\nPotencia: " + potencia + "\n";
        datos += traccionTotal ? "Tiene traccion con las cuatro ruedas" : "NO tiene traccion con las cuatro ruedas";
        
        return datos;
    }
}
