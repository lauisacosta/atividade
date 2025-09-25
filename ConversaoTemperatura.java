import java.util.Scanner;

public class ConversaoTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário a temperatura em Celsius
        System.out.print("Digite a temperatura em Celsius: ");
        double temperaturaCelsius = scanner.nextDouble();

        // Conversão para Fahrenheit e Kelvin
        double temperaturaFahrenheit = (temperaturaCelsius * 9/5) + 32;
        double temperaturaKelvin = temperaturaCelsius + 273.15;

        // Exibir os resultados
        System.out.println("\nTemperatura em Celsius: " + temperaturaCelsius + "°C");
        System.out.println("Temperatura em Fahrenheit: " + temperaturaFahrenheit + "°F");
        System.out.println("Temperatura em Kelvin: " + temperaturaKelvin + " K");

        scanner.close();
    }
}
