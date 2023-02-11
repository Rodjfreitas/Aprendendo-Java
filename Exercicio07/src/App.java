import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        //Leia uma temperatura em graus Fahrenheit e apresente-a convertida em graus Celsius. A fórmula de conversão é C = 5 * (F -32)/9 , sendo C a temperatura Celsius e F a temperatura Fahrenheit.

        //Variáveis
        Scanner teclado = new Scanner(System.in);
        int cel,fah;

        //Entrada
        System.out.print("Digite a temperatura em °F (Graus Fahrenheit): ");
        fah = teclado.nextInt();

        //Processamento
        cel = 5 * (fah - 32)/9;

        //Saída
        System.out.println("A conversão da temperatura apresenta "+ cel + " °C.");
    }
}
