package dao;

import java.sql.Date;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.Paciente;

public class PacienteImpl extends Conexion implements ICRUD<Paciente>{
// NUMPAC	NOMPAC	APEPAC	SEXPAC	DNIPAC	FNPAC	DIRPAC	NUMUBI
    @Override
    public void registrar(Paciente paciente) throws Exception {
        String sql = "insert into paciente (NOMPAC,APEPAC,SEXPAC,DNIPAC,FNPAC,DIRPAC,NUMUBI) values (?,?,?,?,?,?,?) ";
        try {
            PreparedStatement ps = this.conectar().prepareStatement(sql);
            ps.setString(1,paciente.getNombre() );
            ps.setString(2,paciente.getApellido());
            ps.setString(3,paciente.getSexo());
            ps.setString(4,paciente.getDni());
            ps.setDate(5, (Date) paciente.getNacimiento());
            ps.setString(6,paciente.getDir());
            ps.setString(7,paciente.getUbigeo());
            ps.executeUpdate();
            ps.close();            
        } catch (Exception e) {
            System.out.println("Error en PacienteImpl/registrar: " + e.getMessage());
        }
    }

    @Override
    public void modificar(Paciente paciente) throws Exception {
        String sql = "update paciente set NOMPAC=?,APEPAC=?,SEXPAC=?,DNIPAC=?,FNPAC=?,DIRPAC=?,NUMUBI=? where numpac=?";
        try {
            PreparedStatement ps = this.conectar().prepareStatement(sql);
            ps.setString(1,paciente.getNombre() );
            ps.setString(2,paciente.getApellido());
            ps.setString(3,paciente.getSexo());
            ps.setString(4,paciente.getDni());
            ps.setDate(5, (Date) paciente.getNacimiento());
            ps.setString(6,paciente.getDir());
            ps.setString(7,paciente.getUbigeo());
            ps.setInt(8,paciente.getCodigo());
            ps.executeUpdate();
            ps.close();            
        } catch (Exception e) {
            System.out.println("Error en PacienteImpl/modificar: " + e.getMessage());
        }
    }

    @Override
    public void eliminar(int codigo) throws Exception {
        String sql = "delete from paciente where numpac=" + codigo;
        try {
            PreparedStatement ps = this.conectar().prepareCall(sql);
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            System.out.println("Error en PacienteImpl/eliminar: " + e.getMessage());
        }
    }

    @Override
    public List<Paciente> listarTodos() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    
    
}
