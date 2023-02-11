import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        //Leia o saláriod e um funcionário. Calcule e imprima o valor do novo salário, sabendo que eles recebem um aumento de 25%.

        //variaveis
        Scanner teclado = new Scanner(System.in);
        float salario,reajuste;

        //Entradas
        System.out.print("Informe seu salário: ");
        salario = teclado.nextFloat();

        //Processamento
        reajuste = salario + (salario * (float)0.25);

        //Saída
        System.out.printf("Você terá um reajuste de 25%%. O novo valor do seu salário será de R$ %.2f.",reajuste);

    }
}
