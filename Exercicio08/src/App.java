import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        // Leia uma temperatura em graus Kelvin e apresente-a convertida em Graus Celsius. A fórmula de conversão é C = K - 273.15, sendo C a temperatura em Celsius e K a temperatura em Kelvin.

        //Variáveis
        Scanner teclado = new Scanner(System.in);
        float cel, kel;

        //Entrada
        System.out.print("Informe a temperatura em °K (graus Kelvin): ");
        kel = teclado.nextFloat();

        //Processamento
        cel = kel - (float)273.15;

        //Saída
        System.out.printf("A conversão de %.2f °K é igual à  %.2f °C.", kel,cel);
    }
}
