import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        //Leia uma velocidade em m/s e apresente-a convertida em km/h. A fórmula de conversão é: k = m * 3.6, sendo k a velocidade em km/h e m em m/s.

        //Variáveis
        Scanner teclado = new Scanner(System.in);
        float kmh, ms;

        //Entrada
        System.out.print("Informe o metro por segundo: ");
        ms = teclado.nextFloat();

        //Processamento
        kmh = ms * (float)3.6;

        //Saída
        System.out.printf("%.2f m/s equivalem à %.0f km/h",ms,kmh);
    }
}
