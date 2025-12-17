package Teoria;

/**
 *
 * @author alberto
 */
public class Persona {

    
    private String nombre;
    private int edad;
    private float altura;

    public Persona(String nombre, int edad , float altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }
    
    
    public void cumplirAños(){
        this.edad++;
    }
    
    public void saludar(){
        System.out.printf("Hola, me llamo %s, y tengo %d años." , this.nombre , this.edad);
    }
    
    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /*public void setEdad(int edad) {
        this.edad = edad;
    }*/ 
    //Con esto obligamos a que para cambiar edad solo se pueda hacer con el 
    //metodo cumplirAños, y que no pueda restar edad
    
    
}
