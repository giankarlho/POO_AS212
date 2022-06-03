package dao;

import java.sql.Date;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelo.Paciente;
import services.UtilToSql;

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
            ps.setDate(5, UtilToSql.convert(paciente.getNacimiento()));            
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
            ps.setDate(5, UtilToSql.convert(paciente.getNacimiento()));
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

    public void listar (DefaultTableModel modeloTabla, Integer tipo, String dato) throws Exception {
        String sql = "";
        // NUMPAC	NOMPAC	APEPAC	SEXPAC	DNIPAC	FNPAC	DIRPAC	NUMUBI
        try {
            switch (tipo){
                case 1:
                    sql = "select * from paciente"; break;
                case 2:
                    sql = "select * from paciente where NOMPAC like '%" + dato + "%'"; break;
                case 3:
                    sql = "select * from paciente where APEPAC like '%" + dato + "%'"; break;
                case 4:
                    sql = "select * from paciente where DNIPAC like '%" + dato + "%'"; break;
            }
            String datos[] = new String[8];
            Statement st = this.conectar().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()){
                for (int i=0; i<8; i++)
                    datos[i] = rs.getString(i+1);
            }
            modeloTabla.addRow(datos);
            st.close();
            rs.close();                    
        } catch (Exception e) {
            
            
        }
    }
   
    
    
}
