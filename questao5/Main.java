/*
Título: Inversor de String
Autor: Enock Bezerra Ferreira de Souza

Descrição:

Escreva um programa que inverta os caracteres de um string.

IMPORTANTE:
a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;
b) Evite usar funções prontas, como, por exemplo, reverse;
*/
package questao5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite algo: ");
        String str = scan.nextLine();

        String strInvertida = "";

        for (int i = str.length() - 1; i >= 0; i--)
        {
            strInvertida += str.charAt(i);
        }

        System.out.println(strInvertida);
        scan.close();
    }
}
