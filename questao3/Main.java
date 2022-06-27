/*
Título: Faturamento
Autor: Enock Bezerra Ferreira de Souza

Descrição:
 
Dado um vetor que guarda o valor de faturamento diário de uma distribuidora, faça um programa, na linguagem que desejar, que calcule e retorne:
• O menor valor de faturamento ocorrido em um dia do mês;
• O maior valor de faturamento ocorrido em um dia do mês;
• Número de dias no mês em que o valor de faturamento diário foi superior à média mensal.

IMPORTANTE:
a) Usar o json ou xml disponível como fonte dos dados do faturamento mensal;
b) Podem existir dias sem faturamento, como nos finais de semana e feriados. Estes dias devem ser ignorados no cálculo da média;

*/
package questao3;

import java.util.HashMap;

public class Main {
    static HashMap<Integer, Double> dados = new HashMap<Integer, Double>(30);

    public static void main(String[] args)
    {
        preencheDados();

        System.out.println("Maior faturamento: " + calculaMaior());
        System.out.println("Menor faturamento: " + calculaMenor());
        System.out.println("Media: " + calculaMedia());
        System.out.println("Dias acima da média: " + calculaDiasAcimaMedia());

        
    }

    static void preencheDados()
    {
        dados.put(1, 22174.1664);
        dados.put(2, 24537.6698);
        dados.put(3, 26139.6134);
        dados.put(4, 0.0);
        dados.put(5, 0.0);
        dados.put(6, 26742.6612);
        dados.put(7, 0.0);
        dados.put(8, 42889.2258);
        dados.put(9, 46251.174);
        dados.put(10, 11191.4722);
        dados.put(11, 0.0);
        dados.put(12, 0.0);
        dados.put(13, 3847.4823);
        dados.put(14, 373.7838);
        dados.put(15, 2659.7563);
        dados.put(16, 48924.2448);
        dados.put(17, 18419.2614);
        dados.put(18, 0.0);
        dados.put(19, 0.0);
        dados.put(20, 35240.1826);
        dados.put(21, 43829.1667);
        dados.put(22, 18235.6852);
        dados.put(23, 4355.0662);
        dados.put(24, 13327.1025);
        dados.put(25, 0.0);
        dados.put(26, 0.0);
        dados.put(27, 25681.8318);
        dados.put(28, 1718.1221);
        dados.put(29, 13220.495);
        dados.put(30, 8414.61);
    }
    
    static Double calculaMenor()
    {
        Double menor = dados.get(1);

        for (int i = 1; i <= dados.size(); i++)
        {
            if (dados.get(i) < menor)
            {
                menor = dados.get(i);
            }
        }

        return menor;
    }

    static Double calculaMaior()
    {
        Double maior = dados.get(1);

        for (int i = 1; i <= dados.size(); i++)
        {
            if(dados.get(i) > maior)
            {
                maior = dados.get(i);
            }
        }

        return maior;
    }

    static int calculaDiasAcimaMedia()
    {
        int dias = 0;
        int media = calculaMedia();

        for (int i = 1; i <= dados.size(); i++)
        {
            if (dados.get(i) > media)
            {
                dias++;
            }
        }

        return dias;
    }

    static int calculaMedia()
    {
        int total = 0;
        int diasSemFaturamento = 0;
        for (int i = 1; i <= dados.size(); i++)
        {
            if (!(dados.get(i) == 0.0))
            {
                total += dados.get(i);
            }else{
                diasSemFaturamento++;
            }
        }

        return (total / (dados.size() - diasSemFaturamento));
    }
}
