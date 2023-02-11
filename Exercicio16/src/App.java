import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        //Faça um programa que leia o valor de um produto e imprima o valor com desconto,tendo em vista que o desconto foi de 12%.

        //Variáveis
        Scanner teclado = new Scanner(System.in);
        float valor,total;

        //Entrada
        System.out.print("Valor do Produto: ");
        valor = teclado.nextFloat();

        //Processamento
        total = valor - (valor * (float)0.12);

        //Saída
        System.out.printf("com desconto de 12%%: R$ %.2f",total);
    }
}
