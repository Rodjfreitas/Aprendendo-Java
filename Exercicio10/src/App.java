import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        //Leia uma velocidade em Km/h(quilometros por hora) e apresente-a convertida em m/s(metros por segundo). A fórmula de conversão é: M = K/3.6, sendo K a velocidade em km/h e M em m/s.

        //Variáveis
        Scanner teclado = new Scanner(System.in);
        float km, ms;

        //Entrada
        System.out.print("Informe a velocidade em Km/h: ");
        km = teclado.nextFloat();

        //Processamento
        ms = km/(float)3.6;

        //Saída
        System.out.printf("%.0f Km/h equivalem à %.2f m/s(metros por segundo).",km,ms);
    }
}
