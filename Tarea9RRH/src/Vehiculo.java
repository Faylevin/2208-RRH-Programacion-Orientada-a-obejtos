import java.awt.*;

public class Vehiculo {
    protected Color color;
    protected int NumeroAsientos;
    protected String numerodeserie;

    public Vehiculo() {
    }

    public Vehiculo(Color color, int numeroAsientos, String numerodeserie) {
        this.color = color;
        NumeroAsientos = numeroAsientos;
        this.numerodeserie = numerodeserie;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getNumeroAsientos() {
        return NumeroAsientos;
    }

    public void setNumeroAsientos(int numeroAsientos) {
        NumeroAsientos = numeroAsientos;
    }

    public String getNumerodeserie() {
        return numerodeserie;
    }

    public void setNumerodeserie(String numerodeserie) {
        this.numerodeserie = numerodeserie;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "color=" + color +
                ", NumeroAsientos=" + NumeroAsientos +
                ", numerodeserie='" + numerodeserie + '\'' +
                '}';
    }

    public void Avanzar(){
        System.out.println("El vehiculo con numero de serie " + numerodeserie + " esta avanzando ");
    }

    public void Detenerse(){
        System.out.println("El vehiculo con numero de serie " + numerodeserie + " se detuvo ");
    }

}
