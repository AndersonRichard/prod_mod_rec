/*
Explicou-se sobre como funciona a impressão de conteúdo que esta no método main e nos métodos criados.
*/
package br.edu.univas;
public class StartApp {
    public static void main(String[] args) {
        //	System.out.println("Hello World");
        //	int a = 10;
        //	System.out.println(a);
        //	teste1(a);
        //	System.out.println(a);
        //	String nome = "Anderson";
        //	teste2(nome);
        //	System.out.println(nome);
        int[] notas = new int[2];
        notas[0] = 20;
        notas[1] = 10;
        System.out.println("A nota 1 é: " + notas[0]);
        System.out.println("A nota 2 é: " + notas[1]);
        teste3(notas);
        notas[0] = 10;
        notas[1] = 14;
        System.out.println("A nota 1 é: " + notas[0]);
        System.out.println("A nota 2 é: " + notas[1]);
    }

    public static void teste1(int x) {
        x = -15;
        System.out.println(x);
    }

    public static void teste2(String x) {
        x = "Richard";
        System.out.println(x);
    }

    public static void teste3(int[] x) {
        x[0] = 9;
        x[1] = 13;
        System.out.println("Nota 1:" + x[0]);
        System.out.println("Nota 2:" + x[1]);
    }
}
