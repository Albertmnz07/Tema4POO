/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Teoria;

/**
 *
 * @author alberto
 */
public class Alumno {
    
    private String nombre;
    private String apellidos;
    private int edad;
    private int[] notas;

    public Alumno(String nombre, String apellidos, int edad, int[] notas) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.notas = notas;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public double media(){
        int acumulador = 0;
        for (int i = 0; i < notas.length; i++) {
            acumulador += notas[i];
        }
        
        return acumulador / notas.length;
    }
    
    public boolean aprobado(){
        return media() >= 5;
    }
    
    
    
    
}
