/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author manue
 */
import java.util.ArrayList;
import java.util.HashSet;

public class TestRendimientoArrays {

    public static int[] diferenciaArrays(int[] inicial, int[] resta) {
        
        int max = 0;
        
        for (int i = 0; i < inicial.length; i++) {
            if (inicial[i] > max){
                max = inicial[i];
            }
        }
        
        for (int i = 0; i < resta.length; i++) {
            if (resta[i] > max){
                max = resta[i];
            }
        }
        
        boolean[] numerosAEliminar = new boolean[max + 1];
        
        for (int i = 0; i < resta.length; i++) {
            numerosAEliminar[resta[i]] = true;
        }
        
        int[] numerosProvisionales = new int[inicial.length];
        int indice = 0;
        
        for (int i = 0; i < inicial.length; i++) {
            int valor = inicial[i];
            
            if (numerosAEliminar[inicial[i]]){
                continue;
            }
            
            numerosProvisionales[indice++] = valor;
        }
        
        int[] salida = new int[indice];
        
        for (int i = 0; i < salida.length; i++) {
            salida[i] = numerosProvisionales[i];
        }
        
        return salida;

    }

    public static void main(String[] args) {

        int[][] casosInicial = {
            new int[]{1, 2, 2, 3, 4, 4, 5, 6, 7, 8, 8, 8},
            new int[]{5, 3, 1, 7, 7, 9, 2, 2, 2, 8},
            new int[]{100, 50, 50, 20, 10, 10, 5, 5, 5},
            generarArrayRepetidos(1, 1000, 5),
            generarArrayRepetidos(1, 10000, 10),
            generarArrayRepetidos(1, 1000000, 100),
            generarAleatorios(10000000)
        };

        int[][] casosResta = {
            new int[]{2, 4, 8},
            new int[]{7, 2},
            new int[]{50, 5, 10},
            generarArrayRepetidos(500, 600, 1),
            generarArrayRepetidos(1000, 2000, 1),
            generarArrayRepetidos(2, 20000, 1),
            generarAleatorios(10000000)
        };

        // Realizar pruebas
        double total = 0;
        for (int i = 0; i < casosInicial.length; i++) {
            int[] inicial = casosInicial[i];
            int[] resta = casosResta[i];

            long inicio = System.currentTimeMillis();
            int[] resultado = diferenciaArrays(inicial, resta);
            long fin = System.currentTimeMillis();
            total += (fin - inicio);

            System.out.printf("Caso %d: Tamaño inicial: %d, Tamaño resta: %d, Tiempo: %d ms, Resultado: %d elementos%n",
                    i + 1, inicial.length, resta.length, (fin - inicio), resultado.length);
        }
        System.out.printf("Tiempo total de todas las pruebas: %f ms", total);
    }

    // Genera un array con elementos repetidos. Cada número entre start y end se repite repeat veces.
    private static int[] generarArrayRepetidos(int start, int end, int repeat) {
        ArrayList<Integer> lista = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            for (int j = 0; j < repeat; j++) {
                lista.add(i);
            }
        }
        // Convertir la lista a un array
        int[] array = new int[lista.size()];
        for (int i = 0; i < lista.size(); i++) {
            array[i] = lista.get(i);
        }
        return array;
    }

    // Genera un array con números aleatorios
    private static int[] generarAleatorios(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * size);
        }
        return array;
    }
}
