package controlador;

import dao.UsuarioD;
import modelo.Usuario;
import vistas.Loguin;

public class UsuarioC {
    Usuario usuario;
    UsuarioD dao;

    public UsuarioC() {
        usuario = new Usuario();
    }
    
    public void accesoC() throws Exception {
        try {
            variablesUser();
            dao.acceso(usuario);
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
    }

    public void accesoC2() throws Exception {
        try {
            variablesUser();
            dao.acceso2(usuario);
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
    }

    public void variablesUser() {
        usuario.setUsuario(Loguin.jtxtUser.getText());
        usuario.setClave(Loguin.jtxtClave.getText());
    }
}
