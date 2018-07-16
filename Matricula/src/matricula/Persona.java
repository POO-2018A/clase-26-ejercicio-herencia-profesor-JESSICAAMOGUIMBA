/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matricula;

/**
 *
 * @author FRANCISCO
 */
public class Persona {
    
    private String nombre;
    private String apellido;
    private int Edad;
//CONSTRUCTOR
    public Persona(String nombre, String apellido, int Edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.Edad = Edad;
    }

      
//GET Y SET
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
// TO STRING
    
    @Override
    public String toString() {
        return  nombre + " " + apellido;
    }
    
    
}
