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
public class Profesores extends Persona {
    private String materia;

    public Profesores(String nombre, String apellido, int Edad, String materia) {
        super(nombre, apellido, Edad);
        this.materia = materia;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
    
}
