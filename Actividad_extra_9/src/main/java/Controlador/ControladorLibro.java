package Controlador;

import Modelo.Libro;
import Modelo.ModeloTablaLibro;
import Vista.VentanaLibro;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ControladorLibro extends MouseAdapter {
    private VentanaLibro view;
    private ModeloTablaLibro modelo;

    public ControladorLibro(VentanaLibro view) {
        this.view = view;
        modelo = new ModeloTablaLibro();
        this.view.getTblLibro().setModel(modelo);
        this.view.getBtnCargar().addMouseListener(this);
        this.view.getBtnAgrega().addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == this.view.getBtnCargar()){
           modelo.cargarDatos();
           this.view.getTblLibro().setModel(modelo);
           this.view.getTblLibro().updateUI();
        }

        if (e.getSource() == this.view.getBtnAgrega()){
            Libro libro = new Libro();
            libro.setId(0);
            libro.setTitulo(this.view.getTxtTitulo().getText());
            libro.setAutor(this.view.getTxtAutor().getText());
            if (modelo.agregarLibro(libro)){
                JOptionPane.showMessageDialog(view,"Se agrego correctamente","Aviso",JOptionPane.INFORMATION_MESSAGE);
                this.view.getTblLibro().updateUI();
            }else {
                JOptionPane.showMessageDialog(view,"No se pudo agregar a la base de datos. Por favor revise su conexión","Error al insertar",JOptionPane.ERROR_MESSAGE);
            }
            this.view.limpiar();
        }
    }



}
