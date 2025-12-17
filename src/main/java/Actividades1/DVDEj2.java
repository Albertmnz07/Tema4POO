/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividades1;

import java.util.Scanner;

enum Generos{
    THRILLER, AVENTURAS, COMEDIA, DRAMA, ANIMACION;
}

public class DVDEj2 {
    
    public static void main(String[] args){
        Scanner entry = new Scanner(System.in);
        
        System.out.print("Indique el titulo: ");
        String titulo = entry.nextLine();
        
        System.out.print("Indique el director: ");
        String director = entry.nextLine();

        System.out.print("Indique el resumen: ");
        String resumen = entry.nextLine();
        
        System.out.print("Indique los actores principales: ");
        String actores = entry.nextLine();
        
        System.out.print("Indique la duracion en minutos: ");
        int duracion = entry.nextInt();
        
        DVDEj2 dvd = new DVDEj2(titulo , director , resumen , Generos.ANIMACION , actores , duracion);
    }
    
    
    
    
    private String titulo , director , resumen , actoresPrincipales;
    Generos genero;
    private int duracion;
    
    public DVDEj2(String titulo, String director, String resumen, Generos genero, String actoresPrincipales, int duracion) {
        this.titulo = titulo;
        this.director = director;
        this.resumen = resumen;
        this.actoresPrincipales = actoresPrincipales;
        this.duracion = duracion;
    }
    
    public String muestraDVDCine(){
        /*String resumen = titulo + " dirigido por " + director + " y del genero " + genero + ". Resumen: " + ". Duracion: " + duracion;
        resumen += "\n Actores principales: " + actoresPrincipales;
        
        return resumen;*/
        
        return String.format("""
                             %s
                             De: %s
                             Con: %s
                             Genero: %s
                             Duracion: %d min.
                             """ , this.titulo , this.director , 
                             this.actoresPrincipales , this.genero , this.duracion);
        
        
    }
    
    public String getResumen(){
        return resumen;
    }
    
    public boolean esThriller(){
        return this.genero == genero.THRILLER;
    }
    
    public boolean tieneResumen(){
        return !resumen.equals("");
    }
    
    public String getDuracion(){
        return duracion + "min";
    }
    
    public String resumen(){
        return this.resumen;
    }
    
}
