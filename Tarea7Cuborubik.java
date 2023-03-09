package ICOFES2;

import java.awt.Color;
import java.util.Arrays;

public class Tarea7Cuborubik {

    private String marca;
    private int tamaño;
    private Color[] colores;

    public Tarea7Cuborubik() {
        this.marca = "Rubik's";
        this.tamaño = 3;
        this.colores = new Color[] {Color.WHITE, Color.YELLOW, Color.RED, Color.ORANGE, Color.BLUE, Color.GREEN};
    }

    public Tarea7Cuborubik(String marca, int tamaño, Color[] colores) {
        this.marca = marca;
        this.tamaño = tamaño;
        this.colores = colores;
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public Color[] getColores() {
        return colores;
    }

    public void setColores(Color[] colores) {
        this.colores = colores;
    }


    public String toString() {
        return "Tarea7Cuborubik [marca=" + marca + ", tamaño=" + tamaño + ", colores=" + Arrays.toString(colores) + "]";
    }


    public void mezclar() {
        System.out.println("El cubo Rubik se ha mezclado aleatoriamente.");
    }

    public void resolver() {
        System.out.println("El cubo Rubik se ha resuelto correctamente.");
    }

    public void mostrarColores() {
        System.out.println("Los colores del cubo Rubik son:");
        for (Color color : colores) {
            System.out.println(color);
        }
    }

    // Método main
    public static void main(String[] args) {
        Tarea7Cuborubik cubo1 = new Tarea7Cuborubik();
        System.out.println(cubo1);
        cubo1.mezclar();
        cubo1.resolver();
        cubo1.mostrarColores();

        Color[] colores2 = {Color.BLACK, Color.WHITE, Color.BLUE, Color.GREEN, Color.ORANGE, Color.YELLOW};
        Tarea7Cuborubik cubo2 = new Tarea7Cuborubik("Sheng Shou", 3, colores2);
        System.out.println(cubo2);
        cubo2.mezclar();
        cubo2.resolver();
        cubo2.mostrarColores();
    }
}
