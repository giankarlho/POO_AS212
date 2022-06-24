package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import modelo.Usuario;

public class UsuarioD extends Conexion {

    public static Boolean logueo = false;
    public static int nivel = 0;

    public Usuario acceso(Usuario usuario) throws Exception {
        Usuario user = new Usuario();
        String sql = "SELECT nomuser,pwduser,nivuser FROM usuario where nomuser=? and pwduser=?  ";
        PreparedStatement ps = (PreparedStatement) this.conectar().prepareStatement(sql);
        ps.setString(1, usuario.getUsuario());
        ps.setString(2, usuario.getClave());
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            user.setUsuario(rs.getString("nomuser"));
            user.setClave(rs.getString("pwduser"));
            user.setNivel(rs.getInt("nivuser"));
            logueo = true;
        } else {
            logueo = false;
        }
        ps.close();
        rs.close();
        return user;
    }

    public int acceso2(Usuario usuario) throws Exception {
        String sql = "SELECT nomuser,pwduser,nivuser FROM usuario where nomuser=? and pwduser=?  ";
        PreparedStatement ps = (PreparedStatement) this.conectar().prepareStatement(sql);
        ps.setString(1, usuario.getUsuario());
        ps.setString(2, usuario.getClave());
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            nivel = rs.getInt("nivuser");
            logueo = true;
        } else {
            logueo = false;
        }
        ps.close();
        rs.close();
        return nivel;
    }
}
