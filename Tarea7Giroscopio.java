package ICOFES2;

public class Tarea7Giroscopio {
    private double resolucion;
    private double velocidadangular;
    private double ejex;
    private double ejey;
    private double ejez;

    public Tarea7Giroscopio() {
    }

    public Tarea7Giroscopio(double resolucion, double velocidadangular, double ejex, double ejey, double ejez) {
        this.resolucion = resolucion;
        this.velocidadangular = velocidadangular;
        this.ejex = ejex;
        this.ejey = ejey;
        this.ejez = ejez;
    }

    public double getResolucion() {
        return resolucion;
    }

    public void setResolucion(double resolucion) {
        this.resolucion = resolucion;
    }

    public double getVelocidadangular() {
        return velocidadangular;
    }

    public void setVelocidadangular(double velocidadangular) {
        this.velocidadangular = velocidadangular;
    }

    public double getEjex() {
        return ejex;
    }

    public void setEjex(double ejex) {
        this.ejex = ejex;
    }

    public double getEjey() {
        return ejey;
    }

    public void setEjey(double ejey) {
        this.ejey = ejey;
    }

    public double getEjez() {
        return ejez;
    }

    public void setEjez(double ejez) {
        this.ejez = ejez;
    }

    @Override
    public String toString() {
        return "Tarea7Giroscopio{" +
                "resolucion=" + resolucion +
                ", velocidadangular=" + velocidadangular +
                ", ejex=" + ejex +
                ", ejey=" + ejey +
                ", ejez=" + ejez +
                '}';
    }

    public void Resolucion(double nuevaResolucion) {
        this.resolucion = nuevaResolucion;
        System.out.println("Resolución ajustada a: " + nuevaResolucion);
    }
        public void Valores () {
            System.out.println("Resolución: " + resolucion);
            System.out.println("Velocidad angular: " + velocidadangular);
            System.out.println("Eje X: " + ejex);
            System.out.println("Eje Y: " + ejey);
            System.out.println("Eje Z: " + ejez);
        }

        public static void main (String[]args){//Metodo main
            Tarea7Giroscopio giroscopio = new Tarea7Giroscopio(720, 100, 0.8, 0.6, 0.2);
            giroscopio.Valores();
            giroscopio.Resolucion(1080);
        }

}