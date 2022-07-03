public class FaturamentosMensais {

//    4) Dado o valor de faturamento mensal de uma distribuidora, detalhado por estado:
//
//    SP – R$67.836,43
//    RJ – R$36.678,66
//    MG – R$29.229,88
//    ES – R$27.165,48
//    Outros – R$19.849,53
//
//    Escreva um programa na linguagem que desejar onde calcule o percentual de representação que cada estado teve dentro do valor total mensal da distribuidora.

    public static void main(String[] args) {

        double sp = 67836.43;
        double rj = 36678.66;
        double mg = 29229.88;
        double es = 27165.48;
        double outros = 19849.53;
        double totalMensal = sp + rj + mg + es + outros; // 180.759,98

        double porcentagemSp = (sp * 100) / totalMensal;
        double porcentagemRj = (rj * 100) / totalMensal;
        double porcentagemMg = (mg * 100) / totalMensal;
        double porcentagemEs = (es * 100) / totalMensal;
        double porcentagemOutros = (outros * 100) / totalMensal;

        System.out.println("O faturamento de São Paulo representa " + porcentagemSp + "% do faturamento total mensal da Distribuidora.");
        System.out.println("O faturamento do Rio de Janeiro representa " + porcentagemRj + "% do faturamento total mensal da Distribuidora.");
        System.out.println("O faturamento de Minas Gerais representa " + porcentagemMg + "% do faturamento total mensal da Distribuidora.");
        System.out.println("O faturamento do Espírito Santo representa " + porcentagemEs + "% do faturamento total mensal da Distribuidora.");
        System.out.println("O faturamento dos outros estados representa " + porcentagemOutros + "% do faturamento total mensal da Distribuidora.");

    }
}





