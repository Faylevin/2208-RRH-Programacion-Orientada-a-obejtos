import java.util.Scanner;

public class DriverMaquinacafe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tarea8Maquinacafe maquina = new Tarea8Maquinacafe();
        System.out.println("Bienvenido a la máquina de café");
        while (true) {
            maquina.mostrar();
            System.out.println("Por favor seleccione una opción:");
            System.out.println("1. Café americano");
            System.out.println("2. Expreso");
            System.out.println("3. Capuchino");
            System.out.println("4. Dejar de usar");
            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    if (maquina.Americano()) {
                        System.out.println("Aquí está su café americano-!");
                    } else {
                        System.out.println("Lo sentimos, no se puede servir el café americano, le recomendamos dejar de usar la maquina si no desea nada más .");
                    }
                    break;
                case 2:
                    if (maquina.Expreso()) {
                        System.out.println("Aquí está su expreso");
                    } else {
                        System.out.println("Lo sentimos, no se puede servir el expreso, le recomendamos dejar de usar la maquina si no desea nada más .");
                    }
                    break;
                case 3:
                    if (maquina.Capuchino()) {
                        System.out.println("Aquí está su capuchino, ¡disfrútelo!");
                    } else {
                        System.out.println("Lo sentimos, no se puede servir el capuchino, le recomendamos dejar de usar la maquina si no desea nada más .");
                    }
                    break;
                case 4:
                    System.out.println("Gracias por utilizar la máquina de café");
                    return;
                default:
                    System.out.println("Opción inválida, por favor intente de nuevo.");
                    break;
            }
        }
    }
}

