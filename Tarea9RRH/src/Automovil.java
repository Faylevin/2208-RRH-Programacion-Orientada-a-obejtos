import java.awt.*;

public class Automovil extends Vehiculo{ //Seat ibiza
    protected String marca;
    protected String modelo;
    protected String año;

    public Automovil() {
    }
    public Automovil(Color color, int numeroAsientos, String numerodeserie, String marca, String modelo, String año) {
        super(color, numeroAsientos, numerodeserie);
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
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

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }
    @Override
    public String toString() {
        return "Automovil{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", año='" + año + '\'' +
                ", color=" + color +
                ", NumeroAsientos=" + NumeroAsientos +
                ", numerodeserie='" + numerodeserie + '\'' +
                '}';
    }

    public void encender(){
        System.out.println("El automóvil de la marca " + marca +  " está encendido. ");
    }
    public void apagar(){
        System.out.println("El automóvil de la marca " + marca + " esta apagado. ");
    }

    @Override
    public void Avanzar() {
        System.out.println("El automovil " + modelo +  año + " está avanzando. ");
    }
    @Override
    public void Detenerse() {
        System.out.println("El automovil " + modelo +  año + " se detuvo. ");
    }

}
