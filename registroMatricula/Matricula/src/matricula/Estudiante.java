package matricula;

import java.util.ArrayList;


public class Estudiante extends Persona{
    private ArrayList<Materia> materias;
    
    
    //extendemos de la clase persona los atributos que tiene esa clase
     
    public Estudiante(String nombre, String apellido, int Edad) {
        super(nombre, apellido, Edad);
         this.materias = new ArrayList<>();
    }

    public ArrayList<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(ArrayList<Materia> materias) {
        this.materias = materias;
    }
    
       
}
 