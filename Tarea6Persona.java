package ICO;

public class Tarea6Persona {
    private int edad;
    private String nombre;
    private double estatura;
    private double peso;
    private String genero;

    public Tarea6Persona() {
    }

    public Tarea6Persona(int edad, String nombre, double estatura, double peso, String genero) {
        this.edad = edad;
        this.nombre = nombre;
        this.estatura = estatura;
        this.peso = peso;
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Tarea6Persona{" +
                "edad=" + edad +
                ", nombre='" + nombre + '\'' +
                ", estatura=" + estatura +
                ", peso=" + peso +
                ", genero='" + genero + '\'' +
                '}';
    }
    public void presentarse() {
        System.out.println("Hola, mi nombre es " + this.nombre + " y tengo " + this.edad + " años.");
    }

    public void calcularIMC() {
        double imc = this.peso / (this.estatura * 2);
        System.out.println("El IMC de " + this.nombre + " es " + imc);
    }
    public void caminar() {
        System.out.println(this.nombre + " está caminando");
    }
    
    //public class DriverPersona
    public static void main(String[] args) {
        Tarea6Persona persona1 = new Tarea6Persona(25, "Pablo", 1.75, 70.5, "Masculino");
        Tarea6Persona persona2 = new Tarea6Persona(70.5/1.75*2);
        Tarea6Persona persona3 = new Tarea6Persona ("pablo");

        System.out.println(persona1.toString());
        System.out.println(persona2.toString());
        System.out.println(persona3.toString());

        persona1.presentarse();
        persona2.calcularIMC();
        persona3.caminar();
    }
}

