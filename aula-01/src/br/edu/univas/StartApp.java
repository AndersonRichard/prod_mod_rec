/*Primeira aula foi feita a introdução quando aos métodos e a forma que devemos usar, tem como objetivo
deixar o método main mais limpo e organizado. Na atividade pediu-se que o usuario digitasse dois números
para calcular 4 operações basicas da calculadora utilizando cada método para isso.
Para limitar casas decimais usa-se printf e após o texto inserir %.2f \n, a variavel,
Outro método seria importar a classe DecimalFormat usando println(texto+ new DecimalFormat("#.##").format(variavel)
*/
package br.edu.univas;
import java.util.Scanner;
public class StartApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor digite o primeiro número: ");
        int readNumberOne = scanner.nextInt();
        System.out.println("Por favor digite o segundo número: ");
        int readNumberTwo = scanner.nextInt();
        addition(readNumberOne, readNumberTwo);
        subtraction(readNumberOne, readNumberTwo);
        division(readNumberOne, readNumberTwo);
        multiplication(readNumberOne, readNumberTwo);
        }
    public static void addition(int readNumberOne, int readNumberTwo){
        int addition = readNumberOne + readNumberTwo;
        System.out.println("A soma dos dois números é: " + addition);
    }
    public static void subtraction(int readNumberOne, int readNumberTwo){
        int subtraction = readNumberOne - readNumberTwo;
        System.out.println("A subtração dos dois números é: " + subtraction);
    }
    public static void division(double readNumberOne, double readNumberTwo){
        double division = readNumberOne / readNumberTwo;
        System.out.printf("A divisão dos dois números é: %.2f " , division);
        System.out.println("");
    }
    public static void multiplication(int readNumberOne, int readNumberTwo){
        int multiplication = readNumberOne * readNumberTwo;
        System.out.println("A multiplicação dos dois números é: " + multiplication);
    }
}

