import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        //Leia um número real e imprima a quinta parte desse número

        //Variáveis
        Scanner teclado = new Scanner(System.in);
        float numero,resultado;

        //Entrada
        System.out.print("Digite um número: ");
        numero = teclado.nextFloat();

        //Processamento
        resultado = numero/5;

        //Saída
        System.out.print("A quinta parte de " + numero + " é igual à " + resultado);
    }
}
