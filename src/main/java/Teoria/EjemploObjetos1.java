package Teoria;


public class EjemploObjetos1 {
    
    public static void main(String[] args) {
        String[] marcas = new String[10];
        String[] modelos = new String[10];
        String[] fechaFabricacion = new String[10];
        String[] numeroBastidor = new String[10];
        int[] numeroPuertas = new int[10];

        //Esto es justamente lo que queremos evitar
        Coche coche1 = new Coche(); 
        
        coche1.setMarca("SEAT");
        
        
        
        System.out.println(coche1.toString());
    }
    
    
    
    
    
    
    
    
}
