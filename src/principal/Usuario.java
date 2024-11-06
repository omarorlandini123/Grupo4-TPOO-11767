
import java.util.List;

/**
 *
 * @author ALEJANDRO
 */
public class Usuario {
    private String id;
    private List < Administrador > administradores;
    
    public Usuario(){
    
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    } 
    public List < Administrador > getAdministradores() {
        return administradores;
    }

    public void setAdministradores(List < Administrador > administradores) {
        this.administradores = administradores;
    }
    
    
    
}
