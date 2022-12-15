/*
Utilizando recursividade crie um programa em Java que imprima os números pares ou ímpares de 1 até n, onde n será
informado pelousuário (leitura do teclado) e será um valor entre 50 e 100 (ambos inclusive). A decisão por imprimir
par ou ímpar está relacionada ao número digitado pelo usuário: caso ele digite par, seu programa deverá imprimir os
números pares, caso contrário, seu programa deverá imprimir os números ímpares.
Exemplode entrada:
8
Exemplo de saída:
2
4
6
8
 */
package br.edu.univas;
import java.util.Scanner;
public class Questao2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor digite um número: ");
        int readNumber = scanner.nextInt();
        sumNumber(readNumber,0);
    }
    public static void sumNumber(int number, int number2){
        if(number % 2 == 0 && number2 < number){
            number2 += 2;
            System.out.println(number2);
            sumNumber(number, number2);
        } else if (number % 2 != 0 && number2 < number){
            number2 += 1;
            System.out.println(number2);
            sumNumber(number, number2 + 1);
        }
    }

}
