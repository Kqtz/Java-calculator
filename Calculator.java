import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numero1, numero2, resultado;
        char operador;

        System.out.println("Ingrese el primer número: ");
        numero1 = scanner.nextDouble();

        System.out.println("Ingrese el operador (+, -, *, /): ");
        operador = scanner.next().charAt(0);

        System.out.println("Ingrese el segundo número: ");
        numero2 = scanner.nextDouble();

        switch (operador) {
            case '+':
                resultado = numero1 + numero2;
                System.out.println("Resultado: " + resultado);
                break;
            case '-':
                resultado = numero1 - numero2;
                System.out.println("Resultado: " + resultado);
                break;
            case '*':
                resultado = numero1 * numero2;
                System.out.println("Resultado: " + resultado);
                break;
            case '/':
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("No se puede dividir por cero.");
                }
                break;
            default:
                System.out.println("Operador no válido.");
        }
    }
} 
        
