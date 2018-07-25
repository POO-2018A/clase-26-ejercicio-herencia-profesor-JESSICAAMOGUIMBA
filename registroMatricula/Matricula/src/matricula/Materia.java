   
package matricula;

public class Materia  {
    private String nombre;
    private int id;

    //Constructor Vacio
    public Materia (){
    
    }
    
    
    public Materia(String nombre) {
        this.nombre = nombre;
    }

    Materia(int cont, String text) {
    
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    

}
