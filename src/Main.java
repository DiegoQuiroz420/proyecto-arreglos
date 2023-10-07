import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[20];

        System.out.println("Ingrese 20 números enteros:");

        for (int i = 0; i < 20; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("\nNúmero | Cuadrado | Cubo");
        System.out.println("------------------------");

        for (int i = 0; i < 20; i++) {
            int numero = numeros[i];
            int cuadrado = numero * numero;
            int cubo = numero * numero * numero;

            System.out.println(numero + "      | " + cuadrado + "       | " + cubo);
        }
    }
}
