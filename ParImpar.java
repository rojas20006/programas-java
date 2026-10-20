import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa un número entero: ");
        int numero = scanner.nextInt();
        
        // Se usa el operador módulo (%) para verificar el residuo de la división entre 2
        if (numero % 2 == 0) {
            System.out.println("El número " + numero + " es par.");
        } else {
            System.out.println("El número " + numero + " es impar.");
        }
        
        scanner.close();
    }
}
