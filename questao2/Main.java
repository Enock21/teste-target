package questao2;
/*
Título: Sequencia de Fibonnaci
Autor: Enock Bezerra Ferreira de Souza

Descrição:
 
Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.

IMPORTANTE:
Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente definido no código;

*/
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int numero = Integer.parseInt(scan.nextLine());

        if(isFibonacci(numero))
        {
            System.out.println(numero + " faz parte da sequencia de Fibonacci!");
        }else
        {
            System.out.println(numero + " não faz parte da sequencia de Fibonacci!");
        }

        scan.close();
    }

    static boolean isFibonacci(int numero)
    {
        int i = 0;
        int j = 1;
        int temp = 0;

        while(true)
        {
            if (i == numero || j == numero){ return true; }
            else if (j > numero) { return false; }

            temp = j;
            j = j + i;
            i = temp;

            System.out.println(j);
        }
    }
}