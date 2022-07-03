import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Arrays;

//3) Dado um vetor que guarda o valor de faturamento diário de uma distribuidora, faça um programa, na linguagem que desejar, que calcule e retorne:
//        • O menor valor de faturamento ocorrido em um dia do mês;
//        • O maior valor de faturamento ocorrido em um dia do mês;
//        • Número de dias no mês em que o valor de faturamento diário foi superior à média mensal.
//
//        IMPORTANTE:
//        a) Usar o json ou xml disponível como fonte dos dados do faturamento mensal;
//        b) Podem existir dias sem faturamento, como nos finais de semana e feriados. Estes dias devem ser ignorados no cálculo da média;


public class Resolucao {
    public static void main(String[] args) {

        int[] dia  = {1, 2, 3, 6, 8, 9, 10, 13, 14, 15,
        16, 17, 20, 21, 22, 23, 24, 27, 28, 29, 30};

        double[] faturamento = {22174.1664, 24537.6698, 26139.6134, 26742.6612, 42889.2258,
        46251.174, 11191.4722, 3847.4823, 373.7838, 2659.7563, 48924.2448, 18419.2614, 35240.1826,
        43829.1667, 18235.6852, 4355.0662, 13327.1025, 25681.8318, 1718.1221, 13220.495, 8414.61};

        for(int i = 0; i < dia.length; i++){
            System.out.println("O dia " + dia[i] + " teve R$ " + faturamento[i] + " de faturamento.");
        }
        System.out.println("");

        double max = faturamento[0];
        for (int i = 1; i < faturamento.length; i++) {
            if (faturamento[i] > max)
                max = faturamento[i];
        }

        System.out.println("O maior faturamento foi de  " + max + " reais" + " obtido no dia " + dia[10] +".");
        System.out.println("");

        double min = faturamento[0];
        for (int i = 1; i < faturamento.length; i++) {
            if (faturamento[i] < min)
                min = faturamento[i];
        }

        System.out.println("O menor faturamento foi de  " + min + " reais, " + "obtido no dia " + dia[8]);
        System.out.println("");

        double sum = Arrays.stream(faturamento).parallel().reduce(0,(a, b)->  a + b);
        double mediaMensal = sum / dia.length;
        System.out.println("A média de faturamento mensal foi de R$ " + mediaMensal);
        System.out.println("");



        double fatMaiorQueMedia = faturamento[0];
        for (int i = 0; i < faturamento.length; i++) {
            if (faturamento[i] > mediaMensal)
            System.out.println(faturamento[i]);
        }
        System.out.println("");
        System.out.println("Em 10 dias o faturamento diário foi superior à média de faturamento mensal.");
    }
}







