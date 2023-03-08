package ICOTAREAS2;

public class Tarea6Monitor {
    private double pulgadas;
    private String marca;
    private String modelo;
    private String tipo;
    private double precio;

    public Tarea6Monitor() {
    }

    public Tarea6Monitor(double pulgadas, String marca, String modelo, String tipo, double precio) {
        this.pulgadas = pulgadas;
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
        this.precio = precio;
    }

    public double getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(double pulgadas) {
        this.pulgadas = pulgadas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Tarea6Monitor{" +
                "pulgadas=" + pulgadas +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", tipo='" + tipo + '\'' +
                ", precio=" + precio +
                '}';
    }
    public void aumentarPrecio (double porcentaje) {
        precio += precio * porcentaje / 100.0;
    }

    public boolean esGamer() {
        return tipo.equalsIgnoreCase("Gamer");
    }

    public boolean esEconomico() {
        return precio <= 200.0;
    }

    public static void main(String[] args) {
        Tarea6Monitor monitor1 = new Tarea6Monitor();
        Tarea6Monitor monitor2 = new Tarea6Monitor(27, "Dell", "S2719DGF", "Gamer", 450.0);

        monitor1.setPulgadas(24);
        monitor1.setMarca("HP");
        monitor1.setModelo("24fw");
        monitor1.setTipo("Oficina");
        monitor1.setPrecio(150.0);

        System.out.println(monitor1);
        System.out.println("\n¿Es gamer? " + monitor1.esGamer());
        System.out.println("¿Es económico? " + monitor1.esEconomico());

        System.out.println("\n" + monitor2);
        System.out.println("\n¿Es gamer? " + monitor2.esGamer());
        System.out.println("¿Es económico? " + monitor2.esEconomico());

        monitor2.aumentarPrecio(10.0);
        System.out.println("\nNuevo precio de monitor2: $" + monitor2.getPrecio());
    }
}