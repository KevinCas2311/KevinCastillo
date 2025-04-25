package kevin_castillo.proyectoN1;

import java.util.Scanner;

public class Suma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer numero: ");
        double numero1 = Double.parseDouble(scanner.nextLine());

        System.out.print("Ingresa el segundo numero: ");
        double numero2 = Double.parseDouble(scanner.nextLine());

        double suma = numero1 - numero2;

        System.out.println("La resta es: " + suma);
    }
}