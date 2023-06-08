package Controlador;

import Modelo.Aves;
import Modelo.TablaAve;
import Vista.VentanaAve;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;

public class ControlAve extends MouseAdapter {
    private VentanaAve interfaz;
    private TablaAve modelo;

    public ControlAve(VentanaAve interfaz) {
        this.interfaz = interfaz;
        modelo = new TablaAve();
        this.interfaz.getTablave().setModel(modelo);
        this.interfaz.getBotonAgregar().addMouseListener(this);
        this.interfaz.getTablave().addMouseListener(this );
        this.interfaz.getBotonCargar().addMouseListener(this);
        this.interfaz.getBotonBorrar().addMouseListener(this);
        this.interfaz.getBotonActualizar().addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == this.interfaz.getBotonCargar()) {
            modelo = new TablaAve();
            modelo.cargarDatos();
            this.interfaz.getTablave().setModel(modelo);
            this.interfaz.getTablave().updateUI();
        }

        if (e.getSource() == interfaz.getBotonAgregar()) {
            System.out.println("Evento sobre boton Agregar");
            String nombre = this.interfaz.getTextNombre().getText();
            String alimentacion = this.interfaz.getTextAlimentacion().getText();
            String distribucion = this.interfaz.getTextDistribucion().getText();
            String conservacion = this.interfaz.getTextConservacion().getText();
            String url = this.interfaz.getTextURL().getText();

            if (nombre.isEmpty() || alimentacion.isEmpty() || distribucion.isEmpty() || conservacion.isEmpty() || url.isEmpty()) {
                JOptionPane.showMessageDialog(interfaz, "Todos los campos son obligatorios", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                Aves pollo = new Aves();
                pollo.setNombre(nombre);
                pollo.setAlimentacion(alimentacion);
                pollo.setDistribucion(distribucion);
                pollo.setConservacion(conservacion);
                pollo.setURL(url);

                if (modelo.Agregarcampos(pollo)) {
                    JOptionPane.showMessageDialog(interfaz, "Se agregó correctamente", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                    this.interfaz.getTablave().updateUI();
                } else {
                    JOptionPane.showMessageDialog(interfaz, "No se pudo agregar a la base de datos", "Error al insertar", JOptionPane.ERROR_MESSAGE);
                }
                this.interfaz.limpiar();
            }
        }

        if (e.getSource() == interfaz.getTablave()) {
            System.out.println("Evento sobre Tabla");
            int index = this.interfaz.getTablave().getSelectedRow();
            Aves pollo = modelo.getAveatindex(index);
            try {
                this.interfaz.getImagenave().setIcon(pollo.getImagen());
                this.interfaz.getImagenave().setText("");
            } catch (MalformedURLException photo) {
                System.out.println(photo.toString());
            }
        }

        if (e.getSource() == this.interfaz.getBotonActualizar()) {
            System.out.println("Evento sobre boton Actualizar");
            int rowIndex = this.interfaz.getTablave().getSelectedRow();
            Aves tmp = modelo.getAveatindex(rowIndex);
            Aves ave = new Aves();
            ave.setNombre(this.interfaz.getText2Nombre().getText());
            ave.setAlimentacion(this.interfaz.getText2Alimentacion().getText());
            ave.setDistribucion(this.interfaz.getText2Distribucion().getText());
            ave.setConservacion(this.interfaz.getText2Conservacion().getText());
            ave.setURL(this.interfaz.getText2URL().getText());
            ave.setId(tmp.getId());
            if (modelo.Modificarcampos(ave)) {
                JOptionPane.showMessageDialog(interfaz, "Se modificó correctamente", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                modelo.cargarDatos();
                this.interfaz.getTablave().setModel(modelo);
                this.interfaz.getTablave().updateUI();
            } else {
                JOptionPane.showMessageDialog(interfaz, "No se pudo modificar", "Error al Insertar", JOptionPane.ERROR_MESSAGE);
            }
            this.interfaz.getTablave().updateUI();
        }

        if (e.getSource() == this.interfaz.getBotonBorrar()) {
            TablaAve temp = new TablaAve();
            int index = this.interfaz.getTablave().getSelectedRow();
            Aves tmp = modelo.getAveatindex(index);
            if (temp.Eliminarcampos(Integer.toString(tmp.getId()))) {
                JOptionPane.showMessageDialog(interfaz, "Se eliminó correctamente", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                modelo.cargarDatos();
                this.interfaz.getTablave().updateUI();
                this.interfaz.limpiar();
            } else {
                JOptionPane.showMessageDialog(interfaz, "No se pudo eliminar la base", "Error al insertar", JOptionPane.ERROR_MESSAGE);
            }
        }

    }
    private String EspaciosNombre(String nombre) {
        if (nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El campo Nombre no puede estar vacío.");
        }
        if (!Character.isLetter(nombre.charAt(0))) {
            throw new IllegalArgumentException("El campo Nombre debe contener solo letras.");
        }

        return nombre;
    }

    private String EspaciosAlimentacion(String Comida) {
        if (Comida.trim().isEmpty()) {
            throw new IllegalArgumentException("El campo Alimentacion no puede estar vacío.");
        }
        if (!Character.isLetter(Comida.charAt(0))) {
            throw new IllegalArgumentException("El campo Alimentacion debe contener solo letras.");
        }

        return Comida;
    }
    private String EspaciosDistribucion(String zona) {
        if (zona.trim().isEmpty()) {
            throw new IllegalArgumentException("El campo Distribucion no puede estar vacío.");
        }
        if (!Character.isLetter(zona.charAt(0))) {
            throw new IllegalArgumentException("El campo Distribucion debe contener solo letras.");
        }

        return zona;
    }
    private String EspaciosConservacion(String estado) {
        if (estado.trim().isEmpty()) {
            throw new IllegalArgumentException("El campo Conservacion no puede estar vacío.");
        }
        if (!Character.isLetter(estado.charAt(0))) {
            throw new IllegalArgumentException("El campo Conservacion debe contener solo letras.");
        }

        return estado;
    }
    private String EspaciosURL(String imagen) {
        if (imagen.trim().isEmpty()) {
            throw new IllegalArgumentException("El campo Imagen no puede estar vacío.");
        }
        if (!Character.isLetter(imagen.charAt(0))) {
            throw new IllegalArgumentException("El campo imagen debe contener solo letras.");
        }

        return imagen;
    }

}
