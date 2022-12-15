/*Dando continuidade na introdução de métodos para que o método main fique mais limpo e organizado.
Contudo usando métodos com os itpos de váriaveis usando uma estrutura de repetição.
*/
package br.edu.univas;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StartApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor digite o primeiro número: ");
        int readNumberOne = scanner.nextInt();
        System.out.println("Por favor digite o segundo número: ");
        int readNumberTwo = scanner.nextInt();

        for(int i = 0; i < 10; i++){
            double result = addition(readNumberOne, readNumberTwo);
            System.out.println("Resultado da Soma é: " + result);

            result = subtraction(readNumberOne, readNumberTwo);
            System.out.println("Resultado da Subtração é: " + result);

            result = diision(readNumberOne, readNumberTwo);
            System.out.printf("Resultado da Divisão é: %.2f %n", result);

            result = multiplication(readNumberOne, readNumberTwo);
            System.out.println("Resultado da multiplicação é:" + result);
        }
    }
    public static double addition(double readNumberOne, double readNumberTwo){
        return readNumberOne + readNumberTwo;
    }
    public static double subtraction(double readNumberOne, double readNumberTwo){
        return readNumberOne - readNumberTwo;
    }
    public static double diision(double readNumberOne, double readNumberTwo){
        return readNumberOne / readNumberTwo;
    }
    public static double multiplication(double readNumberOne, double readNumberTwo){
        return readNumberOne * readNumberTwo;
    }
}
