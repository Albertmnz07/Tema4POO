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

    private String nombre, direccion, DNI;
    private LocalDate fechaNacimiento, fechaAntiguedad;
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

    public Empleado(String nombre, String direccion, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.fechaNacimiento = fechaNacimiento;
    }

    public static boolean compruebaDepartamento(String departamento) {
        /*for (int i = 0; i < departamentos.length; i++) {
            if (departamentos[i].name().equals(departamento)) return true;
        }
        return false;*/
        try {
            Departamento.valueOf(departamento);
            return true;
        } catch (IllegalArgumentException e) {
            return false;
        }
    }

    public int getEdad() {
        return Period.between(fechaNacimiento, LocalDate.now()).getYears();
    }

    public int getAnosEmpresa() {
        return Period.between(fechaAntiguedad, LocalDate.now()).getYears();
    }

    public int calcularEdad() {
        return getEdad();
    }

    public void MuestraEmpleado() {
        System.out.println(toString());
    }

    public boolean esProgramadorJunior() {
        return departamento == Departamento.INF && calcularSalarioMensual() <= 2000;
    }

    public static void MuestraNumTrabajadores() {
        for (int i = 0; i < departamentos.length; i++) {
            System.out.println(departamentos[i].name() + ": " + empleadosDepartamento[i]);
        }
    }

    public double calcularSalarioMensual() {
        return this.salarioAnual / 12;
    }

    public boolean posibilidadAscenso() {
        return getAnosEmpresa() > 4 && getEdad() > 40;
    }

    private void actualizarEmpleados(Departamento departamento) {
        for (int i = 0; i < departamentos.length; i++) {
            if (departamentos[i].equals(departamento)) {
                empleadosDepartamento[i]++;
                return;

            }
        }

    }

    public boolean comprobarDNI() {
        if (this.DNI.length() != 9) {
            return false;
        }
        for (int i = 0; i < 8; i++) {
            if (!(Character.isDigit(DNI.charAt(i)))) {
                return false;
            }
        }
        if (!Character.isLetter(DNI.charAt(8))) {
            return false;
        }

        int resto = Integer.valueOf(DNI.substring(0, 8)) % 23;

        String letrasPosibles = "TRWAGMYFPDXBNJZSQVHLCKE";
        String letra = "" + letrasPosibles.charAt(resto);
        
        if (!letra.equals(DNI.substring(8, 9))) return false;

        return true;
    }

    public String toString() {
        return String.format("Nombre: %s \nDireccion: %s\nNacimiento: %d %s %d \n"
                + "DNI: %s \nSalario anual: %d \n Departamento: %s \n , Fecha antiguedad: %d %s %d \n",
                nombre, direccion, fechaNacimiento.getYear(),
                fechaNacimiento.getMonth().toString(), fechaNacimiento.getDayOfMonth(),
                DNI, salarioAnual, departamento.name(), 
                fechaAntiguedad.getYear(), fechaAntiguedad.getMonth().toString(), fechaAntiguedad.getDayOfMonth());
    }

}
