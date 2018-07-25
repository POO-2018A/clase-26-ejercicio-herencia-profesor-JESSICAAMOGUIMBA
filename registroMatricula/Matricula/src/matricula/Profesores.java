/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matricula;

public class Profesores extends Persona  {
    private String materia;
    private int id;
    private int cont; 

    public Profesores(String nombre, String apellido, int Edad) {
        super(nombre, apellido, Edad);
    }
    
    

    public Profesores(String nombre, String apellido, int Edad, String materia) {
        super(nombre, apellido, Edad);
        this.materia = materia;
    }
     public Profesores(int cont, String nombre, String apellido, int Edad, String materia ) {
        super(nombre, apellido, Edad);
        this.materia = materia;
        this.cont = cont;
    } 


    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
}
