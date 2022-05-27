package controlador;

import java.io.Serializable;
import vistas.PacienteView;

public class PacienteC implements Serializable{
    
    public static void limpiar(){
        PacienteView.jrdnFemenino.setSelected(false);
        PacienteView.jrdnMasculino.setSelected(false);
        PacienteView.jtxtNombre.setText("");
        PacienteView.jtxtApellido.setText("");
        PacienteView.jtxtDni.setText("");
    }
            
}
