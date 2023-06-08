package Conexion;

import Modelo.Aves;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class AveDAO implements InterfazAveDAO{

    public AveDAO() {
    }

    @Override
    public boolean insertar(Object obj) throws SQLException {
        String Insert = "INSERT INTO Aves(Nombre, Alimentacion, Distribucion, Conservacion, URL) VALUES(?, ?, ?, ?, ?)";
        int rowCount = 0;
        PreparedStatement pstm = DBConexionSingleton.getInstance("AvesDB.db").getConnection().prepareStatement(Insert);
        pstm.setString(1, ((Aves) obj).getNombre());
        pstm.setString(2, ((Aves) obj).getAlimentacion());
        pstm.setString(3, ((Aves) obj).getDistribucion());
        pstm.setString(4, ((Aves) obj).getConservacion());
        pstm.setString(5, ((Aves) obj).getURL());
        rowCount = pstm.executeUpdate();
        return rowCount > 0;
    }

    @Override
    public boolean uptade(Object obj) throws SQLException {
        String UPTADE = "UPDATE Aves SET Nombre = ?, Alimentacion = ?, Distribucion = ?, Conservacion = ?, URL = ? WHERE ID = ? ;";
        int rowCount = 0;
        PreparedStatement pstm = DBConexionSingleton.getInstance("AvesDB.db").getConnection().prepareStatement(UPTADE);

        pstm.setString(1, ((Aves) obj).getNombre());
        pstm.setString(2, ((Aves) obj).getAlimentacion());
        pstm.setString(3, ((Aves) obj).getDistribucion());
        pstm.setString(4, ((Aves) obj).getConservacion());
        pstm.setString(5, ((Aves) obj).getURL());
        pstm.setInt(6, ((Aves) obj).getId());
        rowCount = pstm.executeUpdate();
        return rowCount > 0;
    }

    @Override
    public boolean delete(String id) throws SQLException {
        String Delete = "DELETE FROM Aves WHERE Id = ? ;";
        int rowCount = 0;
        PreparedStatement pstm = DBConexionSingleton.getInstance("AvesDB.db").getConnection().prepareStatement(Delete);
        pstm.setInt(1, Integer.parseInt(id));
        rowCount = pstm.executeUpdate();
        return rowCount > 0;
    }
    @Override
    public ArrayList ObtenerTodo() throws SQLException {
        String sql = "SELECT * FROM Aves";
        ArrayList<Aves> resultado = new ArrayList<>();

        Statement stm = DBConexionSingleton.getInstance("AvesDB.db").getConnection().createStatement();
        ResultSet rst = stm.executeQuery(sql);
        while (rst.next()){
            resultado.add(new Aves(rst.getInt(1),rst.getString(2),rst.getString(3),rst.getString(4),rst.getString(5),rst.getString(6)));
        }

        return resultado;
    }

    @Override
    public Object buscarPorId(String id) throws SQLException {
        String sql = "SELECT * FROM Aves WHERE id = ? ;";
        Aves ave = null;

        PreparedStatement pstm = DBConexionSingleton.getInstance("AvesDB.db").getConnection().prepareStatement(sql);
        pstm.setInt(1, Integer.parseInt(id));
        ResultSet rst = pstm.executeQuery();
        if (rst.next()) {
            ave = new Aves (rst.getInt(1), rst.getString(2), rst.getString(3),rst.getString(4),rst.getString(5),rst.getString(6));
            return ave;
        }
        return null;
    }

}
