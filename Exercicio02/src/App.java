import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        //Faça um programa que leia um número real e o imprima

        //Variaveis
        Scanner teclado = new Scanner(System.in);
        float real;

        //Entrada
        System.out.print("Digite um valor em Real:");
        real = teclado.nextFloat();

        //Saída
        System.out.println("O valor é R$ "+ real);
    }
}
