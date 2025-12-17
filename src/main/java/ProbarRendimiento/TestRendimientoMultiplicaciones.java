public class TestRendimientoMultiplicaciones {

    public static int cantidadMultiplicaciones(long numero) {
        
        int multiplicaciones = 0;
        
        while (numero > 10){
            
            multiplicaciones = 1;
            long acumulador = 1;
            
            while (numero >= 1){
                acumulador *= (numero % 10);
                numero /= 10;
            }
            
            numero = acumulador;
            multiplicaciones++;
        }
        
        
        return (int) multiplicaciones;
    }



    public static void main(String[] args) {
        // Números de prueba de diferentes tamaños
        long[] numerosPrueba = {
            39,               // Pequeño número
            999,              // Más grande, varios dígitos iguales
            123456789,        // Números consecutivos
            987654321,        // Números consecutivos en orden inverso
            
        };
        long[] numerosPruebaAleatorios = generarAleatoriosLong(10);

        for (long numero : numerosPrueba) {
            // Medir tiempo de ejecución
            long inicio = System.nanoTime();
            int resultado = cantidadMultiplicaciones(numero);
            long fin = System.nanoTime();

            // Mostrar resultados
            System.out.printf("Número: %d... (longitud: %d), Multiplicaciones: %d, Tiempo: %.2f ms%n",
                    numero, String.valueOf(numero).length(), resultado, (fin - inicio) / 1e6);
        }
        long inicio = System.currentTimeMillis();
        for (long numero : numerosPruebaAleatorios) {
            // Medir tiempo de ejecución
            
            int resultado = cantidadMultiplicaciones(numero);
            
        } 
        long fin = System.currentTimeMillis();

            // Mostrar resultados
            System.out.printf("En aleatorios %d ms", (fin-inicio));
                  
    }

    private static long[] generarAleatoriosLong(int size) {
        long[] array = new long[size];
        for (int i = 0; i < size; i++) {
            array[i] = (long) (Math.random() * Long.MAX_VALUE);
        }
        return array;
    }
}