package ICOFES2;

public class Tarea7Libro {

    private String nombre;
    private String autor;
    private int fechadepublicación;
    private String editorial;

    public Tarea7Libro() {
    }

    public Tarea7Libro(String nombre, String autor, int fechadepublicación, String editorial) {
        this.nombre = nombre;
        this.autor = autor;
        this.fechadepublicación = fechadepublicación;
        this.editorial = editorial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getFechadepublicación() {
        return fechadepublicación;
    }

    public void setFechadepublicación(int fechadepublicación) {
        this.fechadepublicación = fechadepublicación;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return "Tarea7Libro{" +
                "nombre='" + nombre + '\'' +
                ", autor='" + autor + '\'' +
                ", fechadepublicación=" + fechadepublicación +
                ", editorial='" + editorial + '\'' +
                '}';
    }
    public void abrir() {
        System.out.println("El libro " + this.nombre + " está siendo abierto");
    }

    public void cerrar() {
        System.out.println("El libro "+ this.nombre +  " está siendo cerrado");
    }

    public void leer() {
        System.out.println("El libro de " + this.autor + " está siendo leído");
    }

    public static void main(String[] args) { //Metodo main
        Tarea7Libro libro = new Tarea7Libro("Cronica de una muerte anunciada", "Gabriel García Márquez", 1981, "Editorial Sudamericana");
        libro.abrir();
        libro.leer();
        libro.cerrar();
    }
}
