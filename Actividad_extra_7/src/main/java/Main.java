import Modelo.Libro;
import Persistencia.DemoLibroDB;
import Persistencia.LibroDAO;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        LibroDAO ldao = new LibroDAO();
        try {
            Libro res = (Libro) ldao.buscarPorId("1");
            System.out.println(res);
            System.out.println("--------------");
            for (Object lib : ldao.ObtenerTodo()) {
                System.out.println((Libro)lib);
            }
        }catch (SQLException sqle){
            System.out.println("Error");
            System.out.println(sqle.getMessage());
        }



    }
}
