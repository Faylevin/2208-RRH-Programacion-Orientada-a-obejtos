package Conexion;

import java.sql.SQLException;
import java.util.ArrayList;

public interface InterfazAveDAO {
    public abstract boolean insertar (Object obj) throws SQLException;
    public abstract boolean uptade (Object obj) throws SQLException;
    public abstract ArrayList ObtenerTodo () throws SQLException;
    public abstract boolean delete (String id) throws SQLException;

    public abstract Object buscarPorId (String id) throws SQLException;

}
