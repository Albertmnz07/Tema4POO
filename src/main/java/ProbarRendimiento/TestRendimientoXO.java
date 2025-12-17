package ProbarRendimiento;

public class TestRendimientoXO {

    public static boolean XO(String cadena) {
        boolean coincidenciaMinima = false;
        int acumulador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            
            switch(cadena.charAt(i)){
                
                case 'x':
                case 'X':
                    acumulador++;
                    coincidenciaMinima = true;
                    break;
                case 'o':
                case 'O':
                    acumulador--;
                    coincidenciaMinima = true;
            }
        }
        
        return acumulador == 0 && coincidenciaMinima;
    }

    public static void main(String[] args) {
        // Tamaños de las cadenas a probar
        int[] tamanios = {10, 100, 1000, 10000, 100000, 1000000, Integer.MAX_VALUE-8};

        long tiempoTotal = 0;
        for (int tam : tamanios) {
            // Generar una cadena determinista
            String cadena = generarCadena(tam);

            // Medir tiempo de ejecución
            long inicio = System.currentTimeMillis();
            boolean resultado = XO(cadena);
            long fin = System.currentTimeMillis();

            // Mostrar resultados
            System.out.printf("Tamaño cadena: %d, Resultado: %b, Tiempo: %d ms%n", 
                    tam, resultado, (fin - inicio));
            tiempoTotal += (fin-inicio);
        }
        System.out.printf("Tiempo total %d ms", tiempoTotal);
    }


    private static String generarCadena(int tamano) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < tamano; i++) {
            if (i % 3 == 0) {
                sb.append('x');
            } else if (i % 3 == 1) {
                sb.append('o');
            } else {
                sb.append('a'); // Un carácter irrelevante
            }
        }
        return sb.toString();
    }
}