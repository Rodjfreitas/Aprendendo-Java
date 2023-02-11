import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        //Leia uma temperatura em graus Celsius e apresente-a convertida em graus Kelvin. A fórmula de conversão é: K = C + 273.15, sendo C a temperatura em Celsius e K a temperatura em Kelvin.

        //Variáveis
        Scanner teclado = new Scanner(System.in);
        float cel, kel;

        //Entrada
        System.out.print("Digite a temperatura em °C: ");
        cel = teclado.nextFloat();

        //Processamento
        kel = cel + (float)273.15;

        //Saída
        System.out.printf("%.2f °C(graus Celsius) equivalem à %.2f °K(graus Kelvin).",cel,kel);

    }
}
