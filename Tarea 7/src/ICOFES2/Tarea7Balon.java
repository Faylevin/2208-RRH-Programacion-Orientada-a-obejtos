package ICOFES2;

public class Tarea7Balon {
    private String marca;
    private double peso;
    private String material;
    private String deporte;

    public Tarea7Balon() {
    }

    public Tarea7Balon(String marca, double peso, String material, String deporte) {
        this.marca = marca;
        this.peso = peso;
        this.material = material;
        this.deporte = deporte;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    @Override
    public String toString() {
        return "Tarea7Balon{" +
                "marca='" + marca + '\'' +
                ", peso=" + peso +
                ", material='" + material + '\'' +
                ", deporte='" + deporte + '\'' +
                '}';
    }
    public void inflar() {
        System.out.println("El balón está siendo inflado");
    }

    public void desinflar() {
        System.out.println("El balón está siendo desinflado");
    }

    // Metodo main
    public static void main(String[] args) {
        Tarea7Balon balon = new Tarea7Balon();
        balon.setMarca("Nike");
        balon.setPeso(0.3);
        balon.setMaterial("Cuero");
        balon.setDeporte("Fútbol");

        balon.inflar();
        System.out.println("El balon esta hecho de:" + balon.getMaterial());
        System.out.println("El balon es de " + balon.getDeporte() +  " y es de la marca: " + balon.getMarca());
        System.out.println("Tiene un Peso: " + balon.getPeso() + " kg");
        balon.desinflar();
    }


}
