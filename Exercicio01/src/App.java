import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        //Faça um programa que leia um número inteiro e o imprima
        
        //Declarando variáveis
        int numero;
        Scanner teclado = new Scanner(System.in);

        
        //Entrada
        System.out.println("Digite um número:");
        numero = teclado.nextInt();
        
        //Saída
        System.out.println("O número é: "+ numero);
    }
}
