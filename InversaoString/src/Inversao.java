import java.util.Scanner;

//5) Escreva um programa que inverta os caracteres de um string.
//
//        IMPORTANTE:
//        a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;
//        b) Evite usar funções prontas, como, por exemplo, reverse;

public class Inversao {

    public static void main(String[] args) {
        String frase = "It's a long way to the top if you wanna rock n' roll";
        int len = frase.length();
        char[] tempCharArray = new char[len];
        char[] charArray = new char[len];

        for (int i = 0; i < len; i++) {
            tempCharArray[i] = frase.charAt(i);
        }

        for (int j = 0; j < len; j++) {
            charArray[j] = tempCharArray[len - 1 - j];
        }
        String reverseFrase = new String(charArray);
        System.out.println(reverseFrase);
    }

}
