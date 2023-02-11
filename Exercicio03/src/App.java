import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        //Peça ao usuário para digitar tres valores inteiros e imprima a soma deles.

        //Variáveis
        Scanner teclado = new Scanner(System.in);
        int num1,num2,num3,total;

        //Entradas
        System.out.print("Digite o primeiro número: ");
        num1 = teclado.nextInt();

        System.out.print("Digite o segundo número: ");
        num2 = teclado.nextInt();

        System.out.print("Digite o terceiro número: ");
        num3 = teclado.nextInt();

        //Processamento

        total = num1 + num2 + num3;

        //Saída
        System.out.println("O total da soma dos valores é de: " + total);
    }
}
