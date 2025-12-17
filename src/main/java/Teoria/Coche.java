/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Teoria;

/**
 *
 * @author alberto
 */
public class Coche {
    
    private String marca;
    private String modelo;
    private String fechaFabricacion;
    private String numeroBastidor;
    private int numeroPuertas;
    private String[] fechasRevisiones;
    
    public void Coche(String marca){
        setFechasRevisiones(new String[10]);
        this.marca = marca;
    }
    
    public void acelerar(){
        System.out.println("Acelerando...");
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public String getMarca(){
        return this.marca;
    }

    public String getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setFechaFabricacion(String fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

    public String getNumeroBastidor() {
        return numeroBastidor;
    }

    public void setNumeroBastidor(String numeroBastidor) {
        this.numeroBastidor = numeroBastidor;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public String[] getFechasRevisiones() {
        return fechasRevisiones;
    }

    public void setFechasRevisiones(String[] fechasRevisiones) {
        this.fechasRevisiones = fechasRevisiones;
    }
    
    @Override
    public String toString(){
        String datos = "";
        
        datos += "Marca " + this.marca + "\n";
        datos += "Modelo " + this.modelo + "\n";
        
        
        
        return datos;
    }
}
