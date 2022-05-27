package dao;

import java.util.List;

public interface ICRUD<Generic> {

    // Los métodos DML: insert, delete, update, merge, restore record
    void registrar(Generic object) throws Exception;

    void modificar(Generic object) throws Exception;

    void eliminar(Generic object) throws Exception;

    List<Generic> listarTodos() throws Exception;
}
