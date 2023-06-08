package Vista;

import javax.swing.*;
import java.awt.*;

public class VentanaAve extends JFrame {
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    private JLabel labID;
    private JLabel labNombre;
    private JLabel labAlimentacion;
    private JLabel labDistribucion;
    private JLabel labConservacion;
    private JLabel labURL;
    private JLabel Imagenave;
    private JLabel lab2ID;
    private JLabel lab2Nombre;
    private JLabel lab2Alimentacion;
    private JLabel lab2Distribucion;
    private JLabel lab2Conservacion;
    private JLabel lab2URL;
    private JTextField textID;
    private JTextField textNombre;
    private JTextField textAlimentacion;
    private JTextField textDistribucion;
    private JTextField textConservacion;
    private JTextField textURL;

    private JTextField text2ID;
    private JTextField text2Nombre;
    private JTextField text2Alimentacion;
    private JTextField text2Distribucion;
    private JTextField text2Conservacion;
    private JTextField text2URL;
    private JButton botonAgregar;
    private JButton botonLeer;
    private JButton botonBorrar;
    private JButton botonActualizar;
    private JTable Tablave;
    private JScrollPane scrollPane;
    private GridLayout layout;

    public VentanaAve(String title) throws HeadlessException {
        super(title);
        this.setSize(1000,800);
        layout = new GridLayout(2,2);
        this.getContentPane().setLayout(layout);
        // Panel 1
        panel1 = new JPanel(new FlowLayout());
        panel1.setBackground(new Color(0xCE6C6C));
        this.getContentPane().add(panel1,0);
        labID = new JLabel("ID");
        labNombre = new JLabel("Nombre");
        labAlimentacion = new JLabel("Alimentacion");
        labDistribucion = new JLabel("Distribucion");
        labConservacion = new JLabel("Conservacion");
        labURL = new JLabel("URL");
        textID = new JTextField(3);
        textID.setText("0");
        textID.setEnabled(false);
        textNombre = new JTextField(15);
        textAlimentacion = new JTextField(15);
        textDistribucion = new JTextField(15);
        textConservacion = new JTextField(20);
        textURL = new JTextField(25);
        botonAgregar = new JButton("Agregar");
        panel1.add(labID);
        panel1.add(textID);
        panel1.add(labNombre);
        panel1.add(textNombre);
        panel1.add(labAlimentacion);
        panel1.add(textAlimentacion);
        panel1.add(labDistribucion);
        panel1.add(textDistribucion);
        panel1.add(labConservacion);
        panel1.add(textConservacion);
        panel1.add(labURL);
        panel1.add(textURL);
        panel1.add(botonAgregar);

        // Panel 2
        panel2 = new JPanel(new FlowLayout());
        panel2.setBackground(new Color(0x6C96CE));
        this.getContentPane().add(panel2,1);
        botonLeer = new JButton("Leer Base");
        panel2.add(botonLeer);
        Tablave = new JTable();
        scrollPane = new JScrollPane(Tablave);
        panel2.add(scrollPane, BorderLayout.CENTER);

        // Panel 3
        panel3 = new JPanel(new FlowLayout());
        panel3.setBackground(new Color(0xACE3B0));
        this.getContentPane().add(panel3,2);
        Imagenave = new JLabel("...");
        panel3.add(Imagenave);

        // Panel 4
        panel4 = new JPanel(new FlowLayout());
        panel4.setBackground(new Color(0xF0F39C));
        this.getContentPane().add(panel4,3);
        botonBorrar = new JButton("Eliminar");
        botonActualizar = new JButton("Actualizar");
        lab2ID = new JLabel("ID");
        lab2Nombre = new JLabel("Nombre");
        lab2Alimentacion = new JLabel("Alimentacion");
        lab2Distribucion = new JLabel("Distribucion");
        lab2Conservacion = new JLabel("Conservacion");
        lab2URL = new JLabel("URL");
        text2ID = new JTextField(3);
        text2ID.setText("0");
        text2ID.setEnabled(false);
        text2Nombre = new JTextField(15);
        text2Alimentacion = new JTextField(15);
        text2Distribucion = new JTextField(15);
        text2Conservacion = new JTextField(20);
        text2URL = new JTextField(25);
        panel4.add(lab2ID);
        panel4.add(text2ID);
        panel4.add(lab2Nombre);
        panel4.add(text2Nombre);
        panel4.add(lab2Alimentacion);
        panel4.add(text2Alimentacion);
        panel4.add(lab2Distribucion);
        panel4.add(text2Distribucion);
        panel4.add(lab2Conservacion);
        panel4.add(text2Conservacion);
        panel4.add(lab2URL);
        panel4.add(text2URL);
        panel4.add(botonBorrar);
        panel4.add(botonActualizar);


        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }


    public JPanel getPanel1() {
        return panel1;
    }

    public void setPanel1(JPanel panel1) {
        this.panel1 = panel1;
    }

    public JPanel getPanel2() {
        return panel2;
    }

    public void setPanel2(JPanel panel2) {
        this.panel2 = panel2;
    }

    public JPanel getPanel3() {
        return panel3;
    }

    public void setPanel3(JPanel panel3) {
        this.panel3 = panel3;
    }

    public JPanel getPanel4() {
        return panel4;
    }

    public void setPanel4(JPanel panel4) {
        this.panel4 = panel4;
    }

    public JLabel getLabID() {
        return labID;
    }

    public void setLabID(JLabel labID) {
        this.labID = labID;
    }

    public JLabel getLabNombre() {
        return labNombre;
    }

    public void setLabNombre(JLabel labNombre) {
        this.labNombre = labNombre;
    }

    public JLabel getLabAlimentacion() {
        return labAlimentacion;
    }

    public void setLabAlimentacion(JLabel labAlimentacion) {
        this.labAlimentacion = labAlimentacion;
    }

    public JLabel getLabDistribucion() {
        return labDistribucion;
    }

    public void setLabDistribucion(JLabel labDistribucion) {
        this.labDistribucion = labDistribucion;
    }

    public JLabel getLabConservacion() {
        return labConservacion;
    }

    public void setLabConservacion(JLabel labConservacion) {
        this.labConservacion = labConservacion;
    }

    public JLabel getLabURL() {
        return labURL;
    }

    public void setLabURL(JLabel labURL) {
        this.labURL = labURL;
    }

    public JTextField getTextID() {
        return textID;
    }

    public void setTextID(JTextField textID) {
        this.textID = textID;
    }

    public JTextField getTextNombre() {
        return textNombre;
    }

    public void setTextNombre(JTextField textNombre) {
        this.textNombre = textNombre;
    }

    public JTextField getTextAlimentacion() {
        return textAlimentacion;
    }

    public void setTextAlimentacion(JTextField textAlimentacion) {
        this.textAlimentacion = textAlimentacion;
    }

    public JTextField getTextDistribucion() {
        return textDistribucion;
    }

    public void setTextDistribucion(JTextField textDistribucion) {
        this.textDistribucion = textDistribucion;
    }

    public JTextField getTextConservacion() {
        return textConservacion;
    }

    public void setTextConservacion(JTextField textConservacion) {
        this.textConservacion = textConservacion;
    }

    public JTextField getTextURL() {
        return textURL;
    }

    public void setTextURL(JTextField textURL) {
        this.textURL = textURL;
    }

    public JButton getBotonAgregar() {
        return botonAgregar;
    }

    public void setBotonAgregar(JButton botonAgregar) {
        this.botonAgregar = botonAgregar;
    }

    public JButton getBotonCargar() {
        return botonLeer;
    }

    public void setBotonCargar(JButton botonLeer) {
        this.botonLeer = botonLeer;
    }

    public JTable getTablave() {
        return Tablave;
    }

    public void setTablave(JTable tablave) {
        Tablave = tablave;
    }

    public JScrollPane getScrollPane() {
        return scrollPane;
    }

    public void setScrollPane(JScrollPane scrollPane) {
        this.scrollPane = scrollPane;
    }

    @Override
    public GridLayout getLayout() {
        return layout;
    }

    public JButton getBotonLeer() {
        return botonLeer;
    }

    public void setBotonLeer(JButton botonLeer) {
        this.botonLeer = botonLeer;
    }

    public JButton getBotonBorrar() {
        return botonBorrar;
    }

    public void setBotonBorrar(JButton botonBorrar) {
        this.botonBorrar = botonBorrar;
    }

    public JButton getBotonActualizar() {
        return botonActualizar;
    }

    public void setBotonActualizar(JButton botonActualizar) {
        this.botonActualizar = botonActualizar;
    }

    public void setLayout(GridLayout layout) {
        this.layout = layout;
    }

    public JLabel getImagenave() {
        return Imagenave;
    }

    public void setImagenave(JLabel imagenave) {
        Imagenave = imagenave;
    }

    public JLabel getLab2ID() {
        return lab2ID;
    }

    public void setLab2ID(JLabel lab2ID) {
        this.lab2ID = lab2ID;
    }

    public JLabel getLab2Nombre() {
        return lab2Nombre;
    }

    public void setLab2Nombre(JLabel lab2Nombre) {
        this.lab2Nombre = lab2Nombre;
    }

    public JLabel getLab2Alimentacion() {
        return lab2Alimentacion;
    }

    public void setLab2Alimentacion(JLabel lab2Alimentacion) {
        this.lab2Alimentacion = lab2Alimentacion;
    }

    public JLabel getLab2Distribucion() {
        return lab2Distribucion;
    }

    public void setLab2Distribucion(JLabel lab2Distribucion) {
        this.lab2Distribucion = lab2Distribucion;
    }

    public JLabel getLab2Conservacion() {
        return lab2Conservacion;
    }

    public void setLab2Conservacion(JLabel lab2Conservacion) {
        this.lab2Conservacion = lab2Conservacion;
    }

    public JLabel getLab2URL() {
        return lab2URL;
    }

    public void setLab2URL(JLabel lab2URL) {
        this.lab2URL = lab2URL;
    }

    public JTextField getText2ID() {
        return text2ID;
    }

    public void setText2ID(JTextField text2ID) {
        this.text2ID = text2ID;
    }

    public JTextField getText2Nombre() {
        return text2Nombre;
    }

    public void setText2Nombre(JTextField text2Nombre) {
        this.text2Nombre = text2Nombre;
    }

    public JTextField getText2Alimentacion() {
        return text2Alimentacion;
    }

    public void setText2Alimentacion(JTextField text2Alimentacion) {
        this.text2Alimentacion = text2Alimentacion;
    }

    public JTextField getText2Distribucion() {
        return text2Distribucion;
    }

    public void setText2Distribucion(JTextField text2Distribucion) {
        this.text2Distribucion = text2Distribucion;
    }

    public JTextField getText2Conservacion() {
        return text2Conservacion;
    }

    public void setText2Conservacion(JTextField text2Conservacion) {
        this.text2Conservacion = text2Conservacion;
    }

    public JTextField getText2URL() {
        return text2URL;
    }

    public void setText2URL(JTextField text2URL) {
        this.text2URL = text2URL;
    }

    public void limpiar(){
        textNombre.setText("");
        textAlimentacion.setText("");
        textDistribucion.setText("");
        textConservacion.setText("");
        textURL.setText("");
    }

}
