import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        //leia um ângulo em graus e apresente-o convertido em radianos. A fórmula de conversão é: R = G * raio/180, sendo G o ângulo em graus e R em radianos e raio = 3.14.

        //Variáveis
        Scanner teclado = new Scanner(System.in);
        float graus, radiano,raio = (float)3.14;

        //Entrada
        System.out.print("Digite o Graus: ");
        graus = teclado.nextFloat();

        //Processamento
        radiano = graus * raio / 180;

        //saída
        System.out.printf("%.2f graus equivalem à %.2f radianos.",graus,radiano);
    }
}
