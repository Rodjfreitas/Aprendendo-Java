import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        //Leia um número real e imprima o resultado do quadrado desse número

        //Variaveis
        Scanner teclado = new Scanner(System.in);
        float numero,operacao;

        //Entrada
        System.out.print("Digite um número qualquer: ");
        numero = teclado.nextFloat();

        //Processamento
        operacao = numero * numero;

        //Saída
        System.out.println("O valor do quadrado de "+numero+" é = "+operacao);

    }
}
