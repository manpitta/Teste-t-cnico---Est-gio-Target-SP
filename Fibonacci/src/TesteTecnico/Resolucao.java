package TesteTecnico;

import java.util.Scanner;

//2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores
//(exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número,
//ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.

public class Resolucao {
    public static void main(String[] args) {
    java.util.Scanner usuario = new java.util.Scanner(System.in);

    System.out.println("Digite o número desejado.");
    int num = usuario.nextInt();
    System.out.println();
    int x[] = new int[num + 1];
    boolean verificador = false;


        for(int i = 0; i <= num; i++){
            System.out.print(fib(i) + ", ");
            x[i] = fib(i);
        }

        for(int i = 0; i < x.length; i++){
            if(x[i] == num){
                verificador = true;
            }
        }
        System.out.println();
        if(verificador){
            System.out.println("O número digitado faz parte da sequência de Fibonacci.");
        }else{
            System.out.println("O número digitado não faz parte da sequência de Fibonacci.");
        }
        usuario.close();
    }
    static int fib(int num){
        return (num < 2) ? num : fib(num -1) + fib(num - 2);
    }

}

