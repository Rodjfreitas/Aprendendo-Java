import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        //Leia uma temperatura em graus Celsius e apresente-a convertida em graus Fahrenheit. A fórmula de conversão é F = C * (9.0/5.0) + 32.0, sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.

        //Variáveis
        Scanner teclado = new Scanner(System.in);
        int cel, fah;

        //Entrada
        System.out.print("Digite a temperatura em °C (graus Celsius): ");
        cel = teclado.nextInt();

        //Processamento
        fah = cel * (9/5) + 32;

        //Saída
        System.out.println("A temperatura convertida para Fahrenheit é de: " + fah + " °F");
    }
}
