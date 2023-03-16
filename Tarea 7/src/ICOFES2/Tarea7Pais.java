package ICOFES2;

public class Tarea7Pais {
    private String nombre;
    private String capital;
    private String idioma;
    private String moneda;

    public Tarea7Pais() {
    }

    public Tarea7Pais(String nombre, String capital, String idioma, String moneda) {
        this.nombre = nombre;
        this.capital = capital;
        this.idioma = idioma;
        this.moneda = moneda;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    @Override
    public String toString() {
        return "Tarea7Pais{" +
                "nombre='" + nombre + '\'' +
                ", capital='" + capital + '\'' +
                ", idioma='" + idioma + '\'' +
                ", moneda='" + moneda + '\'' +
                '}';
    }
    public void visitar() {
        System.out.println("Visitando " + nombre + " por turismo");
        System.out.println("La moneda que se usa es: " + moneda);
    }
    public void hablar() {
        System.out.println("Aqui se habla en: " + idioma);
    }
    public void comprar(){
        System.out.println("La moneda que se usa para comprar es: " + moneda);
    }
    public static void main(String[] args) { //Metodo main
        Tarea7Pais pais = new Tarea7Pais("Suecia","Estocolmo","Sueco","Corona Sueca");

        pais.visitar();
        pais.hablar();
        pais.comprar();
    }
}
