import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        //Uma empresa contrata um encanador a R$30,00 por dia. Faça um programa que solicite o número de dias trabalhados pelo encanador e imprima a quantia líquida que deverá ser paga, sabendo que são descontados 8% para impostos de renda.

        //Variaveis
        Scanner teclado = new Scanner(System.in);
        String nome;
        int dayWork;
        float salBruto, salLiq, salDay = 30;

        //Entradas
        System.out.print("Olá. Informe seu primeiro nome: ");
        nome = teclado.next();

        System.out.printf("Bem-vindo %s. Informe-nos os dias trabalhados: ",nome);
        dayWork =  teclado.nextInt();

        //Processamento
        salBruto = dayWork * salDay;
        salLiq = salBruto - (salBruto * (float)0.08);

        //Saída
        System.out.printf("\n%s: o valor bruto de seu trabalho de %d dias é de R$ %.2f\n",nome,dayWork,salBruto);
        System.out.printf("\ncom dedução de impostos de 8%%, você receberá R$ %.2f\n",salLiq);
    }
}
