package ICOTAREAS2;

import java.awt.*;
import java.util.ArrayList;

public class Tarea6Automovil {
    private String marca;

    private String subMarca;

    private byte modelo; // 2000 + byte

    private Color color;

    public Tarea6Automovil() {
    }

    public Tarea6Automovil(String marca, String subMarca, byte modelo, Color color) {
        this.marca = marca;
        this.subMarca = subMarca;
        this.modelo = modelo;
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        ArrayList<String> marcas = new ArrayList<>();
        marcas.add("VW");
        marcas.add("HONDA");
        marcas.add("TESLA");
        marcas.add("NISSAN");
        marcas.add("MITSUBISHI");
        marcas.add("TOYOTA");

        if(marcas.contains((marca.toUpperCase()))){
            this.marca = marca;}
        else {
            return;
        }
    }

    public String getSubMarca() {
        return subMarca;
    }

    public void setSubMarca(String subMarca) {
        this.subMarca = subMarca;
    }

    public byte getModelo() {
        return modelo;
    }

    public void setModelo(byte modelo) {
        this.modelo = modelo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Tarea6Automovil{" +
                "marca='" + marca + '\'' +
                ", subMarca='" + subMarca + '\'' +
                ", modelo=" + modelo +
                ", color=" + color +
                '}';
    }
    public void cambiarColor(Color nuevoColor) {
        this.color = nuevoColor;
    }
    public int obtenerAnio() {
        return modelo + 2000;
    }
    public boolean esDeMarca(String marca) {
        return this.marca.equalsIgnoreCase(marca);
    }
    
    // public class DriverAutomovil
    public static void main(String[] args) {
        Tarea6Automovil miAuto = new Tarea6Automovil("Toyota", "Corolla", (byte) 22, Color.RED);
        System.out.println(miAuto);

        miAuto.cambiarColor(Color.BLUE);
        System.out.println(miAuto);

        System.out.println("El modelo del auto es del año " + miAuto.obtenerAnio());

        System.out.println("¿Mi auto es de marca Toyota? " + miAuto.esDeMarca("Toyota"));
    }

}

