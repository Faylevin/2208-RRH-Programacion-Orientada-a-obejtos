import java.awt.*;

public class Taxi extends Automovil{
    private String Matricula;
    private int capacidadpasajeros;
    private double tarifa;

    public Taxi() {
    }

    public Taxi(Color color, int numeroAsientos, String numerodeserie, String marca, String modelo, String año, String matricula, int capacidadpasajeros, double tarifa) {
        super(color, numeroAsientos, numerodeserie, marca, modelo, año);
        Matricula = matricula;
        this.capacidadpasajeros = capacidadpasajeros;
        this.tarifa = tarifa;
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String matricula) {
        Matricula = matricula;
    }

    public int getCapacidadpasajeros() {
        return capacidadpasajeros;
    }

    public void setCapacidadpasajeros(int capacidadpasajeros) {
        this.capacidadpasajeros = capacidadpasajeros;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "Matricula='" + Matricula + '\'' +
                ", capacidadpasajeros=" + capacidadpasajeros +
                ", tarifa=" + tarifa +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", año='" + año + '\'' +
                ", color=" + color +
                ", NumeroAsientos=" + NumeroAsientos +
                ", numerodeserie='" + numerodeserie + '\'' +
                '}';
    }

    public void vacio(){
        System.out.println("El taxi tiene disponible " + capacidadpasajeros + " asientos.");
    }
    public void lleno(){
        System.out.println("El taxi está ocupando los " + capacidadpasajeros + " asientos.");
    }

    @Override
    public void Avanzar() {
        System.out.println("El taxi con matricula " + Matricula + " esta avanzando");
    }

    @Override
    public void Detenerse() {
        System.out.println("El taxi con matricula" + Matricula + " se detuvo por lo tanto el taxi cobra lo acordado que es " + tarifa + " pesos");
    }
    @Override
    public void encender() {
        System.out.println("El taxi se ha encedido");
    }

    @Override
    public void apagar() {
        System.out.println("El taxi se ha apagado");
    }
}

