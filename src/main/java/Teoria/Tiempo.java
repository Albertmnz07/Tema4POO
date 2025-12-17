/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Teoria;

/**
 *
 * @author alberto
 */
public class Tiempo {
    
    private int segundos , minutos , horas;
    
    public Tiempo(int segundos , int minutos , int horas){
        this.segundos = segundos;
        this.minutos = minutos;
        this.horas = horas;
    }
    
    int enSegundos(){
        return this.horas*60*60+this.minutos*60+this.segundos;
    }
    
    public static Tiempo resta(Tiempo t1 , Tiempo t2){
        int segundosT1 = t1.enSegundos();
        int segundosT2 = t2.enSegundos();
        
        int restaSegundos = segundosT1-segundosT2;
        
        
        int horasFinales = restaSegundos / 3600;
        restaSegundos %= 3600;
        int minutosFinales = restaSegundos/ 60;
        restaSegundos %= 60;
        
        return new Tiempo(horasFinales , minutosFinales , restaSegundos);
    }
    
    public void suma(Tiempo t1){
        
        this.segundos = this.segundos + t1.getSegundos();
        
        if (segundos >= 60){
            minutos++;
            segundos %= 60;
        }
        
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }
    
    
    
}
