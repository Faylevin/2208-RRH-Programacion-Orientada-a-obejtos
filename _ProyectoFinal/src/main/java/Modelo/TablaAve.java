package Modelo;

import Conexion.AveDAO;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.sql.SQLException;
import java.util.ArrayList;

public class TablaAve implements TableModel {
    public static final int Columnas = 6;
    private ArrayList <Aves> info;
    private AveDAO dao;

    public TablaAve() {
        dao = new AveDAO();
        info = new ArrayList<>();
    }

    public TablaAve(ArrayList<Aves> info) {
        this.info = info;
        dao = new AveDAO();
    }


    @Override
    public int getRowCount() {
        return info.size();
    }

    @Override
    public int getColumnCount() {
        return Columnas;
    }

    @Override
    public String getColumnName(int columnIndex) {
        switch (columnIndex){
            case 0:
                return "ID";
            case 1:
                return "Nombre";
            case 2:
                return "Alimentacion";
            case 3:
                return "Distribucion";
            case 4:
                return "Conservacion";
            case 5:
                return "URL";
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
            case 3:
                return String.class;
            case 4:
                return String.class;
            case 5:
                return String.class;
        }
        return null;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Aves obtener = info.get(rowIndex);
        switch (columnIndex){
            case 0:
                return obtener.getId();
            case 1:
                return obtener.getNombre();
            case 2:
                return obtener.getAlimentacion();
            case 3:
                return obtener.getDistribucion();
            case 4:
                return obtener.getConservacion();
            case 5:
                return obtener.getURL();
        }
        return null;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        switch (columnIndex){
            case 0:
                //info.get(rowIndex).setId();
                break;
            case 1:
                info.get(rowIndex).setNombre((String) aValue);
                break;
            case 2:
                info.get(rowIndex).setAlimentacion((String) aValue);
                break;
            case 3:
                info.get(rowIndex).setDistribucion((String) aValue);
                break;
            case 4:
                info.get(rowIndex).setConservacion((String) aValue);
                break;
            case 5:
                info.get(rowIndex).setURL((String) aValue);
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

    public ArrayList<Aves> getconseguirinfo(){
        return info;
    }

    public void setinfo(ArrayList<Aves> info){
        this.info = info;
    }

    public AveDAO getDao(){
        return dao;
    }

    public void setAve(AveDAO dao){
        this.dao = dao;
    }
    public void cargarDatos(){
        try {
            ArrayList<Aves> tirar = dao.ObtenerTodo();
            System.out.println(tirar);
            info = dao.ObtenerTodo();
        }catch (SQLException sqle){
            System.out.println(sqle.getMessage());
        }

    }

    public boolean Agregarcampos(Aves aves){
        boolean resultado = false;
        try {
            if (dao.insertar(aves)){
                info.add(aves);
                resultado = true;
            } else {
                resultado = false;
            }

        }catch (SQLException sqle){
            System.out.println(sqle.getMessage());
        }

        return resultado;
    }

    public boolean Eliminarcampos(String id){
        boolean resultado = false;
       try {
           if (dao.delete(id)){
               resultado = true;
           }else {
               resultado = false;
           }
       }catch (SQLException borrar){
           System.out.println(borrar.getMessage());
       }

        return resultado;
    }

    public boolean Modificarcampos(Aves ave){
        boolean resultado = true;
        try {
            if (dao.uptade(ave)) {
                resultado = true;
            } else {
                resultado = false;
            }
        } catch (SQLException sqle) {
            System.out.println(sqle.getMessage());
        }
        return resultado;
    }


    public Aves getAveatindex(int index){
        if (index >= 0 && index <info.size()){
            return info.get(index);
        }else {
            return null;
        }

    }

}
