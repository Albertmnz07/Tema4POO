/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividades1.Ej7;

import java.time.LocalDate;
/**
 *
 * @author Usuario
 */
public class MainEmpleado {
    
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Albert" , "Cordoba" , "48273651R" , LocalDate.of(2007, 3, 8) , LocalDate.of(2020, 3, 8) , Departamento.INF , 1000);
        
        empleado1.MuestraEmpleado();
        System.out.println("dni valido: " + empleado1.comprobarDNI());
        System.out.println("edad: " + empleado1.calcularEdad());
        System.out.println("Salario mensual: " + empleado1.calcularSalarioMensual());
        System.out.println("Es junior: " + empleado1.esProgramadorJunior());
        System.out.println("Anos en la empresa: " + empleado1.getAnosEmpresa());
        System.out.println("Edad: " + empleado1.getEdad());
        System.out.println("Posibilidad de ascenso: " + empleado1.posibilidadAscenso());
    }
    
}
