import Controlador.ControladorLibro;
import Modelo.Libro;
import Persistencia.LibroDAO;
import Vista.VentanaLibro;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        VentanaLibro view = new VentanaLibro("MVC Y JDBC");
        ControladorLibro controller = new ControladorLibro(view);


    }
}
