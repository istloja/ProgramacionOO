
import java.io.Serializable;
import javax.faces.application.FacesMessage;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;



@ManagedBean
@RequestScoped
public class login implements Serializable{
    private String usuario;
    private String contraseña;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    public void ingresar(){
        //usuario admin y password 123456
        FacesContext context = FacesContext.getCurrentInstance();
        if(usuario.equals("admin")&&contraseña.equals("1234")){
            context.addMessage(null, new FacesMessage("Successful",  "Ingreso correctamente") );
            
            
        }else{
            context.addMessage(null, new FacesMessage("Error",  "Datos erroneos") );
        }
    
    }
}
