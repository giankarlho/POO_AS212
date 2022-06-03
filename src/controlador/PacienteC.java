package controlador;

import dao.PacienteImpl;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.sql.Date;
import javax.swing.table.DefaultTableModel;
import modelo.Paciente;
import vistas.PacienteView;

// NOMPAC	APEPAC	SEXPAC	DNIPAC	FNPAC	DIRPAC	NUMUBI
public class PacienteC implements Serializable {

    Paciente pac;
    PacienteImpl dao;

    public PacienteC() {
        pac = new Paciente();
        dao = new PacienteImpl();
    }

    public void registrar() {
        try {
            setVariables();
            dao.registrar(pac);            
        } catch (Exception e) {
            System.out.println("Error en PacienteC/registrar: " + e.getMessage());
        }
    }
    
    public void modificar(){
        try {
            pac.setCodigo(Integer.parseInt(PacienteView.jlblCodigo.getText()));
            setVariables();
            dao.modificar(pac);
        } catch (Exception e) {
            System.out.println("Error en PacienteC/modificar: " + e.getMessage());
        }
    }

    public void eliminar(){
        try {
            pac.setCodigo(Integer.parseInt(PacienteView.jlblCodigo.getText()));
            dao.eliminar(pac.getCodigo());
        } catch (Exception e) {
            System.out.println("Error en PacienteC/eliminar: " + e.getMessage());
        }
    }
    public void listar(DefaultTableModel modelo, Integer tipo, String dato) {
        try {
            dao.listar(modelo, tipo, dato);
        } catch (Exception e) {
            System.out.println("Error en PacienteC/listar: " + e.getMessage());
        }
    }

    public void setVariables() {
        try {   
            pac.setNombre(PacienteView.jtxtNombre.getText());
            pac.setApellido(PacienteView.jtxtApellido.getText());
            pac.setSexo(PacienteView.sexo);
            pac.setDni(PacienteView.jtxtDni.getText());
            pac.setNacimiento(PacienteView.jdcNac.getDate());
            pac.setDir(PacienteView.jtxtdir.getText());
            pac.setUbigeo(PacienteView.jtxtUbigeo.getText());
        } catch (Exception e) {
            System.out.println("Error en PacienteC/setVariables: " + e.getMessage());
        }
    }

    public static void limpiar() {
        try {
            PacienteView.jrdnFemenino.setSelected(false);
            PacienteView.jrdnMasculino.setSelected(false);
            PacienteView.jtxtNombre.setText("");
            PacienteView.jtxtApellido.setText("");
            PacienteView.jtxtDni.setText("");
            PacienteView.jtxtUbigeo.setText("");
        } catch (Exception e) {
            System.out.println("Error en PacienteC/limpiar: " + e.getMessage());
        }
    }

}
