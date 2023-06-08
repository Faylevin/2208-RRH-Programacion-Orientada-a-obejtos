import Conexion.AveDAO;
import Controlador.ControlAve;
import Modelo.Aves;
import Vista.VentanaAve;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        VentanaAve buho = new VentanaAve("Interfaz con SQL");
        ControlAve control = new ControlAve(buho);

    }
}

