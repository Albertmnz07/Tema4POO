 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenSevilla;

/**
 *
 * @author Usuario
 */
public class Ejercicio1 {
    
    private static final int ESPACIOS = 15;
    
    public static void main(String[] args) {
        
        String[] jugadores = {"Jose Caldeorn" , "Rudy Fernández" , "Juan Carlos" , "Gasol" , "Felipe Reyes"};
        String[] rivales = { "Croacia" , "Lituania"};
        
        int[][] puntos = {
            {5 , 7},
            {22 , 8},
            {12 , 10},
            {20 , 19},
            {6 , 12}
        };
        
        System.out.println("Estadísticas iniciales");
        mostrarPuntuacionMasAlta(puntos, jugadores, rivales);
        System.out.println("");
        calcularMaximoAnotador(puntos , jugadores);
        
        String nuevoRival = "USA";
        int[] puntosNuevoPartido = {10 , 15 , 12 , 21 , 31};
        
        puntos = añadirPuntos(puntos , puntosNuevoPartido);
        rivales = añadirRival(rivales , nuevoRival);
        
        System.out.println("");
        System.out.println("Estadísticas tras el nuevo partido");
        mostrarPuntuacionMasAlta(puntos, jugadores, rivales);
        System.out.println("");
        calcularMaximoAnotador(puntos , jugadores);
        
        System.out.println("");
        mostrarPuntuaciones(puntos , jugadores , rivales);
        
    }
    
    public static void mostrarPuntuaciones(int[][] puntos , String[] jugadores , String[] rivales){
        System.out.printf("%"+ESPACIOS+"s" , "Jugador");
        
        for (int i = 0; i < rivales.length; i++) {
            System.out.printf("%"+ESPACIOS+"s" , rivales[i]);
        }
        System.out.println("");
        System.out.println("----------------------------------------------------------------------");
        
        for (int i = 0; i < puntos.length; i++) {
            System.out.printf("%"+ESPACIOS+"s" , jugadores[i]);
            for (int j = 0; j < puntos[i].length; j++) {
                System.out.printf("%"+ESPACIOS+"d" , puntos[i][j]);
            }
            System.out.println("");
        }
    }
    
    public static void mostrarPuntuacionMasAlta(int[][] puntos , String[] jugadores , String[] rivales){
        int puntuacionAlta = Integer.MIN_VALUE;
        String jugador = "";
        String rival = "";
        
        for (int i = 0; i < puntos.length; i++) {
            for (int j = 0; j < puntos[i].length; j++) {
                
                if (puntos[i][j] > puntuacionAlta){
                    puntuacionAlta = puntos[i][j];
                    jugador = jugadores[i];
                    rival = rivales[j];
                }
            }
        }
        
        System.out.printf("El que más puntos ha sumado es %s, consiguiendo %d puntos contra %s" , jugador , puntuacionAlta , rival);
        
    }
    
    public static void calcularMaximoAnotador(int[][] puntos , String[] jugadores){
        int[] totales = new int[puntos.length];
        
        for (int i = 0; i < puntos.length; i++) {
            for (int j = 0; j < puntos[i].length; j++) {
                totales[i] += puntos[i][j];
            }
        }
        
        int mayor = Integer.MIN_VALUE;
        String jugador = "";
        for (int i = 0; i < totales.length; i++) {
            if (totales[i] > mayor){
                mayor = totales[i];
                jugador = jugadores[i];
            }
        }
        
        System.out.printf("El jugador %s es el que más puntos tiene, un total de %d" , jugador , mayor);
    }
    
    public static String[] añadirRival(String[] rivales  , String rival){
        String[] nuevo = new String[rivales.length + 1];
        
        for (int i = 0; i < rivales.length; i++) {
            nuevo[i] = rivales[i];
        }
        
        nuevo[rivales.length] = rival;
        return nuevo;
    }
    
    public static int[][] añadirPuntos(int[][] puntosOriginales , int[] puntosPartido){
        int[][] nuevo = new int[puntosOriginales.length][puntosOriginales[0].length + 1];
        
        for (int i = 0; i < nuevo.length; i++) {
            for (int j = 0; j < nuevo[i].length - 1; j++) {
                nuevo[i][j] = puntosOriginales[i][j];
            }
        }
        
        for (int i = 0; i < puntosPartido.length; i++) {
            nuevo[i][nuevo[i].length - 1] = puntosPartido[i];
        }
        
        return nuevo;
    }
}