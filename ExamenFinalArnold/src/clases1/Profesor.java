
package clases1;

public class Profesor extends Persona {
    private String curso;
    private int año;
    
    public Profesor(String nombreCompleto, int edad, String curso, int año){
        super(nombreCompleto, edad);
        this.curso = curso;
        this.año = año;
        
    }

    public String getCurso() {
        return curso;
    }

    public int getAño() {
        return año;
    }
    
    public void agregarProfesor() {
        
    }
    
    public void listarProfesores() {
        
    }
    
    public void eliminarProfesor(){
        
    }
}
