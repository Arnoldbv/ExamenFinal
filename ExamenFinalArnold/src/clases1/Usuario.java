
package clases1;

public class Usuario {
    private String usu;
    private String pass;
    private String rol;
   
    public Usuario(String usu, String pass, String rol){
        this.usu = usu;
        this.pass = pass;
        this.rol = rol;
        
    }

    public String getUsu() {
        return usu;
    }

    public String getPass() {
        return pass;
    }

    public String getRol() {
        return rol;
    }
    
    
}
