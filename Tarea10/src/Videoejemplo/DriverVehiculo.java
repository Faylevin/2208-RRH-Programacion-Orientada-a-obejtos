package Videoejemplo;

public class DriverVehiculo {
    public static void main(String[] args) {
        Camion camion1 = new Camion("Diesel",3);
        System.out.println(camion1);
        System.out.println(camion1.encender());
        camion1.avanzar();
        camion1.frenar();
        System.out.println(camion1.apagar());
        System.out.println("----- Motocicleta ------");
        Motocicleta moto = new Motocicleta(150,"Yamaha");
        System.out.println(moto);
        moto.encender();
        moto.avanzar();
        moto.hacerCaballito();
        moto.frenar();
        moto.apagar();
    }
}
