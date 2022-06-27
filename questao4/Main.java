/*
Título: Percentual de Faturamento
Autor: Enock Bezerra Ferreira de Souza

Descrição:
 
Dado o valor de faturamento mensal de uma distribuidora, detalhado por estado:

SP – R$67.836,43
RJ – R$36.678,66
MG – R$29.229,88
ES – R$27.165,48
Outros – R$19.849,53

Escreva um programa na linguagem que desejar onde calcule o percentual de representação que cada estado teve dentro do valor total mensal da distribuidora.
*/

package questao4;

public class Main {
    final static Double SP = 67836.43;
    final static Double RJ = 36878.66;
    final static Double MG = 29229.88;
    final static Double ES = 27165.48;
    final static Double OUTROS = 19849.53;

    public static void main(String[] args)
    {
        Double total = SP + RJ + MG + ES + OUTROS;
        Double SPPorcento = (100 * SP) / total;
        Double RJPorcento = (100 * RJ) / total;
        Double MGPorcento = (100 * MG) / total;
        Double ESPorcento = (100 * ES) / total;
        Double outrosPorcento = (100 * OUTROS) / total;

        System.out.println("Porcentagem de SP = " + SPPorcento);
        System.out.println("Porcentagem de RJ = " + RJPorcento);
        System.out.println("Porcentagem de MG = " + MGPorcento);
        System.out.println("Porcentagem de ES = " + ESPorcento);
        System.out.println("Porcentagem de outros = " + outrosPorcento);
    }
}
