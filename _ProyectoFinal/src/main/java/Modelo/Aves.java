package Modelo;

import javax.swing.*;
import javax.swing.table.TableRowSorter;
import java.net.MalformedURLException;
import java.net.URL;

public class Aves {
    private int Id;
    private String Nombre;
    private String Alimentacion;
    private String Distribucion;
    private String Conservacion;
    private String URL;

    public Aves() {
    }

    public Aves(int id, String nombre, String alimentacion, String distribucion, String conservacion, String URL) {
        Id = id;
        Nombre = nombre;
        Alimentacion = alimentacion;
        Distribucion = distribucion;
        Conservacion = conservacion;
        this.URL = URL;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getAlimentacion() {
        return Alimentacion;
    }

    public void setAlimentacion(String alimentacion) {
        Alimentacion = alimentacion;
    }

    public String getDistribucion() {
        return Distribucion;
    }

    public void setDistribucion(String distribucion) {
        Distribucion = distribucion;
    }

    public String getConservacion() {
        return Conservacion;
    }

    public void setConservacion(String conservacion) {
        Conservacion = conservacion;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    @Override
    public String toString() {
        return "Aves{" +
                "Id=" + Id +
                ", Nombre='" + Nombre + '\'' +
                ", Alimentacion='" + Alimentacion + '\'' +
                ", Distribucion='" + Distribucion + '\'' +
                ", Conservacion='" + Conservacion + '\'' +
                ", URL='" + URL + '\'' +
                '}';
    }

    public ImageIcon getImagen() throws MalformedURLException{
            URL urlImagen = new URL(this.URL);
            return new ImageIcon(urlImagen);
    }

}
