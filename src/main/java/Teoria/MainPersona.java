/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Teoria;

/**
 *
 * @author alberto
 */
public class MainPersona {

    public static void main(String[] args) {
        Persona persona1 = new Persona("Albert", 18 , (float) 1.7);
        Persona persona2 = new Persona("Aitana Bonmati", 28 , (float) 1.45);
        
         System.out.println("Nombre: " + persona1.getNombre());
         System.out.println("Edad: " + persona1.getEdad());
         
         persona1.saludar();
         
         persona1.cumplirAños();
         persona1.saludar();
         System.out.println("");
         persona2.saludar();
         
         Rectangulo rec = new Rectangulo(3, 5);
         rec.dibujar();
         
         Alumno alumno = new Alumno("Alberto" , "Muñoz Sanchez" , 18 , new int[]{4, 6, 6});
         System.out.println(alumno.aprobado());
    }

}
