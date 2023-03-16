package ICOTAREAS2;

public class Tarea6Libro {
        private String titulo;
        private String autor;
        private int AñoPublicacion;
        private int numeroPaginas;

    public Tarea6Libro() {
    }

    public Tarea6Libro(String titulo, String autor, int añoPublicacion, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        AñoPublicacion = añoPublicacion;
        this.numeroPaginas = numeroPaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAñoPublicacion() {
        return AñoPublicacion;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        AñoPublicacion = añoPublicacion;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public String toString() {
        return "Tarea6Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", AñoPublicacion=" + AñoPublicacion +
                ", numeroPaginas=" + numeroPaginas +
                '}';
    }

    public void prestar() {
        System.out.println("El libro " + this.titulo + " ha sido prestado.");
    }

    public void devolver() {
        System.out.println("El libro " + this.titulo + " ha sido devuelto.");
    }

    public boolean estaDisponible() {
        return true;
    }

}
