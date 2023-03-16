package ICOFES2;

public class drivergiro {
    public static void main (String[]args){//Metodo main
        Tarea7Giroscopio giroscopio = new Tarea7Giroscopio(720, 100, 0.8, 0.6, 0.2);
        giroscopio.Valores();
        giroscopio.Resolucion(1080);
    }
}
