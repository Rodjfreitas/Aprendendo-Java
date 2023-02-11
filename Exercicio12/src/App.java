import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        //Leia uma distância em milhas e apresente-a convertida     em quilometros. A fórmula de conversão é: k = 1.61 * m, sendo k a distância em quilometros e m em milhas.

        //Variáveis
        Scanner teclado = new Scanner(System.in);
        float km, milhas;

        //Entrada 
        System.out.print("Informe a distância em milhas: ");
        milhas =  teclado.nextFloat();

        //Processamento
        km = (float)1.61 * milhas;

        //Saída
        System.out.printf("A conversão de %.2f milhas é de %.2f km.",milhas,km);
    }
}
