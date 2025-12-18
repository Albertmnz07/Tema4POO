/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenSevilla;

/**
 *
 * @author Usuario
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        String[] cancionesRobeIniesta = {
            "Jesucristo García",
            "Estoy muy bien",
            "Quemando tus recuerdos",
            "Ama, ama, ama y ensancha el alma",
            "Sucede",
            "Si te vas",
            "La vereda de la puerta de atrás",
            "So payaso",
            "Segundo movimiento: Lo de fuera",
            "Un suspiro acompasado",
            "Del tiempo perdido",
            "El poder del arte"
        };

        for (int i = 0; i < cancionesRobeIniesta.length; i++) {
            if (cancionesRobeIniesta[i].length() > 10) {
                cancionesRobeIniesta[i] = transformarMayusculas(cancionesRobeIniesta[i]);
            }
        }

        for (int i = 0; i < cancionesRobeIniesta.length; i++) {
            System.out.println(cancionesRobeIniesta[i]);
        }

        String[] a = {};
        String[] b = {"Segundo movimiento: Lo de fuera", "Un suspiro acompasado"};
        String[] resultado = combinarCanciones(a, b);

        System.out.println("");
        imprimirArray(resultado);

    }

    public static String transformarMayusculas(String frase) {
        String nuevo = "";
        nuevo += ("" + frase.charAt(0)).toUpperCase();
        for (int i = 1; i < frase.length(); i++) {
            if (frase.charAt(i - 1) == ' ') {
                String letra = "" + frase.charAt(i);
                letra = letra.toUpperCase();
                nuevo += letra;
            } else {
                nuevo += "" + frase.charAt(i);
            }

        }

        return nuevo;
    }

    public static String[] combinarCanciones(String[] a, String[] b) {
        int indexA = 0;
        int indexB = 0;
        int indexTotal = 0;
        String[] nuevo = new String[a.length + b.length];

        while (nuevo[nuevo.length - 1] == null) {

            if (indexA < a.length) {
                nuevo[indexTotal++] = a[indexA++];
            }
            if (indexB < b.length) {
                nuevo[indexTotal++] = b[indexB++];
            }
        }

        return nuevo;
    }

    public static void imprimirArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

}
