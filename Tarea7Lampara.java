package ICOFES2;

import java.awt.*;

public class Tarea7Lampara {

    private boolean apagada;
    private String marca;
    private Color color;
    private boolean encedida;

    public Tarea7Lampara() {
    }

    public Tarea7Lampara(boolean apagada, String marca, Color color, boolean encedida) {
        this.apagada = apagada;
        this.marca = marca;
        this.color = color;
        this.encedida = encedida;
    }

    public boolean isApagada() {
        return apagada;
    }

    public void setApagada(boolean apagada) {
        this.apagada = apagada;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public boolean isEncedida() {
        return encedida;
    }

    public void setEncedida(boolean encedida) {
        this.encedida = encedida;
    }

    @Override
    public String toString() {
        return "Tarea7Lampara{" +
                "apagada=" + apagada +
                ", marca='" + marca + '\'' +
                ", color=" + color +
                ", encedida=" + encedida +
                '}';
    }
    public void encender() {
        this.encedida = true;
        System.out.println("La lámpara se ha encendido.");
    }

    public void apagar() {
        this.apagada = false;
        System.out.println("La lámpara se ha apagado.");
    }

    public void cambiarColor(Color nuevoColor) {
        this.color = nuevoColor;
        System.out.println("El color de la lámpara se ha cambiado a " + nuevoColor.toString());
    }
    public static void main(String[] args) { //Metodo main
        Tarea7Lampara lampara = new Tarea7Lampara(false, "Philips", Color.blue, true);

        lampara.encender();

        lampara.cambiarColor(Color.green);

        lampara.apagar();
    }
}

