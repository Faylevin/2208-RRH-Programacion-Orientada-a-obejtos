package Modelo;

import Persistencia.LibroDAO;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.sql.SQLException;
import java.util.ArrayList;

public class Libro {
    private int id;
    private String titulo;
    private String autor;

    public Libro() {
    }

    public Libro(int id, String titulo, String autor) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                '}';
    }

    public static class ModeloTablaLibro implements TableModel {
        public static final int COLUMNS = 3;
        private ArrayList<Libro> datos;
        private LibroDAO ldao;

        public ModeloTablaLibro(ArrayList<Libro> datos) {
            this.datos = datos;
            ldao = new LibroDAO();
        }


        @Override
        public int getRowCount() {
            return datos.size();
        }

        @Override
        public int getColumnCount() {
            return COLUMNS;
        }

        @Override
        public String getColumnName(int columnIndex) {
            switch (columnIndex){
                case 0:
                    return "Id";
                case 1:
                    return "Titulo";
                case 2:
                    return "Autor";
            }
            return null;
        }

        @Override
        public Class<?> getColumnClass(int columnIndex) {
            switch (columnIndex){
                case 0:
                    return Integer.class;
                case 1:
                    return String.class;
                case 2:
                    return String.class;
            }
            return null;
        }

        @Override
        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return true;
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            Libro tmp = datos.get(rowIndex);
            switch (columnIndex){
                case 0:
                    return tmp.getId();
                case 1:
                    return tmp.getTitulo();
                case 2:
                    return tmp.getAutor();
            }
            return null;
        }

        @Override
        public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
            switch (columnIndex){
                case 0:
                    //datos.get(rowIndex).setId();
                    break;
                case 1:
                    datos.get(rowIndex).setTitulo((String)aValue);
                    break;
                case 2:
                    datos.get(rowIndex).setAutor((String) aValue);
                    break;
                default:
                    System.out.println("No se modifica nada");
            }
        }

        @Override
        public void addTableModelListener(TableModelListener l) {

        }

        @Override
        public void removeTableModelListener(TableModelListener l) {

        }

        public void cargarDatos(){
            try {
                datos = ldao.ObtenerTodo();
            }catch (SQLException sqle){
                System.out.println(sqle.getMessage());
            }

        }

    }
}
