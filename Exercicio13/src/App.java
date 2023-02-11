import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        //Leia uma distância em quilometros e apresente-a convertida em milhas. A fórmula de conversão é: M = k / 1.61, sendo k a distância em quilometros e m em milhas.

        //Variáveis
        Scanner teclado = new Scanner(System.in);
        float km, milhas;

        //Entrada
        System.out.print("Informe a distância em Km: ");
        km = teclado.nextFloat();

        //Processamento
        milhas = km/(float)1.61;

        //Saída
        System.out.printf("%.2f km equivalem à %.2f milhas.",km,milhas);

    }
}
