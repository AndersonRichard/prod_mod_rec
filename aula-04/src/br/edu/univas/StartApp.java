/*
Demonstrou em aula como funciona o lenght e o uso da Substring.
*/
package br.edu.univas;
public class StartApp {
    public static void main(String[] args) {
        printOutNumber(1);
        printOutString("Brasil Hexa!!!");
    }
    public static void printOutNumber(int number){
        System.out.println(number);
        number++;
        if(number < 11){
            printOutNumber(number);
        }
    }
    public static void printOutString(String content){
        System.out.println(content);
        int length = content.length();
        if(length > 1){
            content = content.substring(0, length -1);
            printOutString(content);
        }
    }
}
