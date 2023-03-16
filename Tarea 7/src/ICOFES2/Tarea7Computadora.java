package ICOFES2;

public class Tarea7Computadora {
    private String marca;
    private double memoria;
    private String modelo;

    public Tarea7Computadora() {
    }

    public Tarea7Computadora(String marca, double memoria, String modelo) {
        this.marca = marca;
        this.memoria = memoria;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getMemoria() {
        return memoria;
    }

    public void Memoria(double memoria) {
        this.memoria = memoria;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Tarea7Computadora{" +
                "marca='" + marca + '\'' +
                ", memoria=" + memoria +
                ", modelo='" + modelo + '\'' +
                '}';
    }

    public void ConfigMemoria(double memoria) {
        this.memoria = memoria;
    }

    public void Informacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Memoria: " + memoria + " GB");
    }

    public static void main(String[] args) { //Metodo main
        Tarea7Computadora miComputadora = new Tarea7Computadora("Dell", 32.0, "Latitude");
        System.out.println("Información de la computadora:");
        miComputadora.Informacion();
        miComputadora.ConfigMemoria(64);

        System.out.println("\nInformación actualizada de la computadora:");
        miComputadora.Informacion();
    }

    }



