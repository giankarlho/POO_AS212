package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import modelo.Paciente;
import services.UtilToSql;

public class PacienteImpl extends Conexion implements ICRUD<Paciente> {
// NUMPAC	NOMPAC	APEPAC	SEXPAC	DNIPAC	FNPAC	DIRPAC	NUMUBI

    public static Integer cantRegistros = 0;
            
    @Override
    public void registrar(Paciente paciente) throws Exception {
        String sql = "insert into paciente (NOMPAC,APEPAC,SEXPAC,DNIPAC,FNPAC,DIRPAC,NUMUBI,ESTPAC) values (?,?,?,?,?,?,?,?) ";
        try {
            PreparedStatement ps = this.conectar().prepareStatement(sql);
            ps.setString(1, paciente.getNombre());
            ps.setString(2, paciente.getApellido());
            ps.setString(3, paciente.getSexo());
            ps.setString(4, paciente.getDni());
            ps.setDate(5, UtilToSql.convert(paciente.getNacimiento()));
            ps.setString(6, paciente.getDir());
            ps.setString(7, paciente.getUbigeo());
            ps.setString(8, "A");
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
            ps.setString(1, paciente.getNombre());
            ps.setString(2, paciente.getApellido());
            ps.setString(3, paciente.getSexo());
            ps.setString(4, paciente.getDni());
            ps.setDate(5, UtilToSql.convert(paciente.getNacimiento()));
            ps.setString(6, paciente.getDir());
            ps.setString(7, paciente.getUbigeo());
            ps.setInt(8, paciente.getCodigo());
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

    
    public void listar(DefaultTableModel modeloTabla, Integer tipo, String dato, String estado) throws Exception {
      
        String sql = "";
        switch (tipo) {
            case 1:
                sql = "select * from paciente where ESTPAC ='" + estado + "'";
                break;
            case 2:
                sql = "select * from paciente where ESTPAC ='" + estado + "' and NOMPAC like '%" + dato + "%'";
                break;
            case 3:
                sql = "select * from paciente where ESTPAC ='" + estado + "' and APEPAC like '%" + dato + "%'";
                break;
            case 4:
                sql = "select * from paciente where ESTPAC ='" + estado + "' and DNIPAC like '%" + dato + "%'";
                break;
//            case 5:
//                sql = "select * from paciente where ESTPAC='" + dato + "'";
//                break;
        }
        String datos[] = new String[8];
        try {
            Statement st = this.conectar().createStatement();
            ResultSet rs = st.executeQuery(sql);
            cantRegistros = 0;
            while (rs.next()) {                
                for (int i = 0; i < 8; i++) {
                    datos[i] = rs.getString(i + 1);
                }
                modeloTabla.addRow(datos);
                cantRegistros ++; // cantRegistros = cantRegistros + 1
            } 
            rs.close();
            st.close();             
        } catch (Exception e) {
            System.out.println("Error en PacienteImpl/listar" + e.getMessage());
        }
    }
    
  
    public void cambiarEstado (String estado, int codigo) throws Exception{
        String sql = "update paciente set ESTPAC=? where numpac=?";
        try {
            PreparedStatement ps = this.conectar().prepareStatement(sql);
            ps.setString(1, estado);
            ps.setInt(2, codigo);
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            System.out.println("Error en PacienteImpl/cambiarEstado: " + e.getMessage());
        }
    }

}
