/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividades1.Ej7;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Usuario
 */
public class Empleado {
    
    private String nombre , direccion , DNI;
    private LocalDate fechaNacimiento , fechaAntiguedad;
    private Departamento departamento;
    private int salarioAnual;
    
    private static Departamento[] departamentos = Departamento.values();
    private static int[] empleadosDepartamento = new int[departamentos.length];

    public Empleado(String nombre, String direccion, String DNI, LocalDate fechaNacimiento, LocalDate fechaAntiguedad, Departamento departamento, int salarioAnual) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.DNI = DNI;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaAntiguedad = fechaAntiguedad;
        this.departamento = departamento;
        this.salarioAnual = salarioAnual;
        actualizarEmpleados(departamento);
    }
  
    public Empleado(String nombre , String direccion , LocalDate fechaNacimiento){
        this.nombre = nombre;
        this.direccion = direccion;
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public int getEdad(){
        return Period.between(fechaNacimiento, LocalDate.now()).getYears();
    }
    
    public int getAnosEmpresa(){
        return Period.between(fechaAntiguedad, LocalDate.now()).getYears();
    }
    
    public int calcularEdad(){
        return getEdad();
    }
    
    public String MuestraEmpleado(){
        return toString();
    }
    
    public boolean esProgramadorJunior(){
        return departamento.equals(Departamento.INF) && salarioAnual <= 2000;
    }
    
    public static void MuestraNumTrabajadores(){
        for (int i = 0; i < departamentos.length; i++) {
            System.out.println(departamentos[i].name() + ": " + empleadosDepartamento[i]);
        }
    }
    
    public double calcularSalarioMensual(){
        return this.salarioAnual / 12;
    }
    
    public boolean posibilidadAscenso(){
        return getAnosEmpresa() > 4 && getEdad() > 40;
    }
    
    private void actualizarEmpleados(Departamento departamento){
        for (int i = 0; i < departamentos.length; i++) {
            if (departamentos[i].equals(departamento)){
                empleadosDepartamento[i]++;
                return;
                
            }
        }
        
    }
    
    
    public String toString(){
        return String.format("Nombre: %s \nDireccion: %s\nNacimiento: %d %d %d \nDNI: %s \nSalario anual: %d \n Departamento: %s \n , Fecha antiguedad: %d %d %d \n" ,
                nombre , direccion , fechaNacimiento.getYear() , fechaNacimiento.getMonth() , fechaNacimiento.getDayOfMonth() ,
                DNI , salarioAnual , departamento.name() , fechaAntiguedad.getYear() , fechaAntiguedad.getMonth() , fechaAntiguedad.getDayOfMonth());
    }
    
}
