package Actividades1.Ej6;

import java.time.LocalDate;
import java.time.Period;


public class PersonaEj6 {
    
    private String nombre;

    public String getNombre() {
        return nombre;
    }
    private LocalDate fechaNacimiento;
    private Sexo sexo;
    private double peso , altura;

    public PersonaEj6(String nombre, LocalDate fechaNacimiento, Sexo sexo) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
    }
    
    
    public PersonaEj6(String nombre, LocalDate fechaNacimiento, Sexo sexo, double peso, double altura) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }
    
    public int calcularIMC(){
        double indice = peso / (altura * altura);
        
        if (indice < 20) return -1;
        if (indice < 25) return 0;
        return 1;
        
    }
    
    public boolean esMayorDeEdad(){
        return getEdad() >= 18;
    }
    
    public int getEdad(){
        Period diff = Period.between(fechaNacimiento, LocalDate.now());
        return diff.getYears();
    }
    
    @Override
    public String toString(){
        return "Nombre: " + nombre + "\nEdad: " + getEdad() + "\nSexo: " + sexo.toString()
                + "\nPeso: " + peso + "\n Altura: " + altura;
    }
    
    
}
