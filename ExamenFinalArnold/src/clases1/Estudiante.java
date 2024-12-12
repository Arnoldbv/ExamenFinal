package clases1;

public class Estudiante extends Persona {
    private String carrera;
    
    public Estudiante(String nombreCompleto, int edad, String carrera){
        super(nombreCompleto, edad);
        this.carrera = carrera;
        
    }
    

    public String getCarrera() {
        return carrera;
    }
    
    public void agregarEstudiante(){
        
    }
    
    public void eliminarEstudiante(){
        
    }
    
}

