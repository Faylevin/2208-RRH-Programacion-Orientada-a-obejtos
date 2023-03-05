import java.util.Scanner;
public class Tarea5 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa una cadena que tenga 9 caracteres que unicamente contenga X, O , _ : ");
        String cadena = sc.nextLine();

        if (cadena.length() != 9 ) {
            System.out.println("La cadena ingresada no tiene 9 caracteres.");
            return;
        }

        if (!cadena.matches("[XO_]{9}")){
            System.out.println("La cadena no tiene los caracteres adecuados");
            return;
        }

        System.out.println("Cadena ingresada: " + cadena);
        System.out.println("-----");
        System.out.println("|"+cadena.charAt(0) + cadena.charAt(1) + cadena.charAt(2)+"|");
        System.out.println("|"+cadena.charAt(3) + cadena.charAt(4) + cadena.charAt(5)+"|");
        System.out.println("|"+ cadena.charAt(6)+ cadena.charAt(7) + cadena.charAt(8)+"|");
        System.out.println("-----");

    }
}
