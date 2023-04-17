import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo1 = new Vehiculo(Color.blue,8,"VABSD6KJ3Lr279885");
        System.out.println(vehiculo1);
        vehiculo1.Avanzar();
        vehiculo1.Detenerse();
        Automovil auto1 = new Automovil(Color.black,5,"VSSBB6KJ3Lr149187","Seat","Seat ibiza","2020");
        System.out.println(auto1);
        auto1.encender();
        auto1.Avanzar();
        auto1.Detenerse();
        auto1.apagar();
        Taxi taxi1 = new Taxi(Color.WHITE,4,"CDAS86KL34r297821","Nissan","Nissan Tsuru","2012","VB-75451",4,30);
        System.out.println(taxi1);
        taxi1.encender();
        taxi1.vacio();
        taxi1.lleno();
        taxi1.Avanzar();
        taxi1.Detenerse();
        taxi1.apagar();

    }
}
