import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        //leia um ângulo em radianos e apresente-o convertido em graus.A fórmula de conversão é: G = R * 180/raio, sendo G o angulo, R radianos e raio = 3.14

        //Variáveis
        Scanner teclado = new Scanner(System.in);
        float graus,radiano,raio = (float)3.14;

        //Entrada
        System.out.print("Digite o radiano de um ângulo: ");
        radiano = teclado.nextFloat();

        //Processamento
        graus = radiano * 180/raio;

        //Saída
        System.out.printf("%.2f radianos equivalem à %.2f graus.",radiano,graus);
    }
}
