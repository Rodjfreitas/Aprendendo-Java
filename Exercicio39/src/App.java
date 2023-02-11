import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        //Divida 780,00 reais para 3 ganhadores, sendo ganhador um 46%, dois 32% e tres o restante.

        //Variáveis
        Scanner teclado = new Scanner(System.in);
        float win1,win2,win3,premio = (float)700;

        //Processamento
        win1 = premio * (float)0.46;
        win2 = premio * (float)0.32;
        win3 = premio - (win1 + win2);

        //Saída
        System.out.printf("O primeiro ganhador recebeu o prêmio de R$ %.2f\n",win1);
        System.out.printf("O segundo ganhador recebeu o prêmio de R$ %.2f\n",win2);
        System.out.printf("O terceiro ganhador recebeu o prêmio de R$ %.2f\n",win3);
        
        
    }
}
