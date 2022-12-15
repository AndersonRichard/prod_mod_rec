/*
Utilizando recursividade, crie um programa que some os números de 1 até n, onde n será informado pelo usuário
(leitura do teclado) e será um valor entre 50 e 100 (ambos inclusive).Utilize variáveisdo tipo “long”para não
ter problema com o tamanho das respostas!
Exemplode entrada:
6
Exemplo de saída:
21
*/
package br.edu.univas;
import java.util.Scanner;
public class Questao3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor digite um número: ");
        long readNumber = scanner.nextLong();
        long result = sumNumber(readNumber);
        System.out.println(result);
    }
    public static long sumNumber(long number){
        if(number == 1){
            return 1;
        }
        return number + sumNumber(number - 1);
    }
}
