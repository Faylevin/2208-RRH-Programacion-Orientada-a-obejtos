package ICOFES2;

public class Tarea7Gato {
    private int edad;
    private String nombre;
    private boolean vacunado;

    public Tarea7Gato() {
    }

    public Tarea7Gato(int edad, String nombre, boolean vacunado) {
        this.edad = edad;
        this.nombre = nombre;
        this.vacunado = vacunado;
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

    public boolean isVacunado() {
        return vacunado;
    }

    public void setVacunado(boolean vacunado) {
        this.vacunado = vacunado;
    }

    @Override
    public String toString() {
        return "Tarea7Gato{" +
                "edad=" + edad +
                ", nombre='" + nombre + '\'' +
               ", vacunado=" + vacunado +
                '}';
    }
    public void Edad(){
        System.out.println("El gato parece que tiene " + edad + " años");
    }
    public void Vacunar() {
        if (this.vacunado == true)  {
            System.out.println("El gato " + nombre + " esta vacunado ");
        } else {
            System.out.println("El gato " + nombre + " no esta vacunado");
        }
    }
    public static void main(String[] args) { //Metodo main
        Tarea7Gato gato1 = new Tarea7Gato(4,"Garfield",false);
        gato1.Edad();
        gato1.Vacunar();
    }

}