/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividades1.Ej6;

import Actividades1.Ej6.Sexo;
import Actividades1.Ej6.PersonaEj6;
import java.util.Scanner;
import java.time.LocalDate;

/**
 *
 * @author Usuario
 */
public class MainEj6 {
    
    public static void main(String[] args) {
        /*Scanner entry = new Scanner(System.in);
        
        System.out.print("Nombre: ");
        String nombre = entry.nextLine();
        
        System.out.print("Edad: ");
        int edad = entry.nextInt();
        
        System.out.print("Sexo: ");
        String strSexo = entry.nextLine();
        Sexo sexo = null;
        
        if (strSexo.equalsIgnoreCase("H")) sexo = Sexo.H;
        if (strSexo.equalsIgnoreCase("M")) sexo = Sexo.M;
        
        entry.nextLine();
        
        System.out.print("Peso: ");
        double peso = entry.nextDouble();
        
        System.out.print("Altura: ");
        double altura = entry.nextDouble(); */
        
        //PersonaEj6 persona = new PersonaEj6(nombre , edad , sexo , peso , altura);
        PersonaEj6 persona = new PersonaEj6("Albert" , LocalDate.of(2000, 10, 21) , Sexo.H , 65 , 1.72);
        
        int indice = persona.calcularIMC();
        
        switch(indice){
            case -1: System.out.println("Peso ideal"); break;
            case 0: System.out.println("Debajo del ideal"); break;
            case 1: System.out.println("Sobrepeso"); break;
        }
        
        System.out.println("Mayor de edad: " + persona.esMayorDeEdad());
        
        System.out.println(persona.toString());
        
        persona = new PersonaEj6("Lucia" , LocalDate.of(2010, 10, 21) , Sexo.M , 50 , 1.60);
        
        indice = persona.calcularIMC();
        
        switch(indice){
            case -1: System.out.println("Peso ideal"); break;
            case 0: System.out.println("Debajo del ideal"); break;
            case 1: System.out.println("Sobrepeso"); break;
        }
        
        System.out.println("Mayor de edad: " + persona.esMayorDeEdad());
        
        System.out.println(persona.toString());
        
        PersonaEj6[] personas = {
            new PersonaEj6("Carlos", LocalDate.of(1990, 5, 12) , Sexo.H, 80, 1.75),
            new PersonaEj6("Ana", LocalDate.of(2003, 8, 25), Sexo.M ,  62, 1.65),
            new PersonaEj6("Luis", LocalDate.of(2010, 3, 10), Sexo.H, 45, 1.55),
            new PersonaEj6("María", LocalDate.of(1985, 11, 2), Sexo.M, 70, 1.68),
            new PersonaEj6("Javier", LocalDate.of(1998, 1, 30), Sexo.H, 90, 1.82),
            new PersonaEj6("Sofía", LocalDate.of(2007, 6, 14), Sexo.M, 52, 1.60),
            new PersonaEj6("Pedro", LocalDate.of(1975, 9, 5), Sexo.H, 85, 1.78),
            new PersonaEj6("Laura", LocalDate.of(2000, 12, 19), Sexo.M, 58, 1.63),
            new PersonaEj6("Miguel", LocalDate.of(2015, 4, 8), Sexo.H, 40, 1.45),
            new PersonaEj6("Elena", LocalDate.of(1993, 7, 27), Sexo.M, 65, 1.70)
        };
        
        PersonaEj6 personaMayor = personas[0];
        
        for (int i = 1; i < personas.length; i++) {
            if (personas[i].getEdad() > personaMayor.getEdad()){
                personaMayor = personas[i];
            }
        }

        System.out.println("Descripción de la persona mayor");
        System.out.println(personaMayor.toString());
        
        //PersonaEj6[] personasSobrepeso = personasSobrepeso(personas);

    }
    
    public PersonaEj6[] personasSobrepeso(PersonaEj6[] personas){
        PersonaEj6[] personasSobrepeso = new PersonaEj6[personas.length];
        int size = 0;
        for (int i = 0; i < personas.length; i++) {
            
            if (personas[i].calcularIMC() == 1){
                personasSobrepeso[i] = personas[i];
                size++;
            }
            
        }
        
        return limpiarArray(personasSobrepeso , size);
    }
    
    public PersonaEj6[] limpiarArray(PersonaEj6[] personas , int indice){
        PersonaEj6[] nuevo = new PersonaEj6[indice];
        for (int i = 0; i < indice; i++) {
            nuevo[i] = personas[i];
        }
        return nuevo;
    }
    
    public void imprimirNombres(PersonaEj6[] personas){
        for (int i = 0; i < personas.length; i++) {
            System.out.println(personas[i].getNombre());
        }
    }
    
}
