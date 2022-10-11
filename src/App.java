import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        //Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius. C = 5 * ((F-32) / 9).

        Scanner scanner = new Scanner(System.in);
 
        double temperaturaGrausFahrenheit, temperaturaGrausCelsius;

        System.out.println("Temperatura em graus Fahrenheit: ");
        temperaturaGrausFahrenheit = scanner.nextDouble();

        temperaturaGrausCelsius = 5 * ((temperaturaGrausFahrenheit - 32) / 9);

        System.out.println("Temperatura em graus Celsius: " + temperaturaGrausCelsius);
    }
}
