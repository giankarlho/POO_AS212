package dao;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import java.sql.ResultSet;
import java.sql.Statement;
import modelo.Ubigeo;

public class UbigeoD extends Conexion {

    public void listarDistrito(JComboBox Box) {
        DefaultComboBoxModel value;
        try {
            Statement st = this.conectar().createStatement();
            ResultSet rs = st.executeQuery("select NUMUBI, DISTUBI from ubigeo where NUMUBI like '0101%'");
            value = new DefaultComboBoxModel();
            while (rs.next()) {
                value.addElement(new Ubigeo(rs.getString("NUMUBI"), rs.getString("DISTUBI")));
            }
            Box.setModel(value);
            st.close();
            rs.close();
        } catch (Exception ex) {
            ex.getMessage();
            System.out.println(ex.getCause());
        }
    }
}
