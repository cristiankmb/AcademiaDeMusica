/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ManagedBean;

import com.google.common.base.Joiner;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author Cristian
 */
@ManagedBean
@RequestScoped
public class MBLogin {

    private String usuario;
    private String contraseña;
private final HttpServletRequest httpServletRequest;
private final FacesContext facesContext;
private FacesMessage facesMessage;
public MBLogin() {
    facesContext=FacesContext.getCurrentInstance();
    httpServletRequest=(HttpServletRequest)facesContext.getExternalContext().getRequest();

    }

public String login(){
    if (usuario.equals("Sergio")&& contraseña.equals("1234")){
        httpServletRequest.getSession().setAttribute("SesiónUsuario", usuario);
        facesMessage = new FacesMessage(FacesMessage.SEVERITY_INFO, "Acceso correcto", null);
        facesContext.addMessage(null,facesMessage);
        String x ="Esto esta correcto";
        return x;
        
    }
    else{
        facesMessage = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuario o contraseña incorrecto", null);
        facesContext.addMessage(null,facesMessage);
        String x ="Esto esta malo";
        return x;
    }
        
}

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
}
