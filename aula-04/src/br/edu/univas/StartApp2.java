/*
Demonstrou a funcionalidade equals e como pode ser util no dia a dia
*/
package br.edu.univas;
public class StartApp2 {
    public static void main(String[] args) {
            String name1 = "Anderson";
            String name2 = "Richard";

            if(name1 == name2){
                System.out.println("Os nomes são iguais.");
            }else{
                System.out.println("Os nomes não são iguais.");
            }

            name1 = "Sistemas";
            name2 = "Sistemas";

            if(name1 == name2){
                System.out.println("Os nomes são iguais.");
            }else{
                System.out.println("Os nomes não são iguais");
            }

            name1 = "Anderson Richard";
            name2 = name1;

            if(name1 == name2){
                System.out.println("Os nomes são iguais.");
            }else{
                System.out.println("Os nomes não são iguais");
            }

            name1 = new String("Hello");
            name2 = new String("Hello");

            if(name1 == name2){
                System.out.println("Os nomes são iguais.");
            }else{
                System.out.println("Os nomes não são iguais");
            }

            if(name1.equals(name2)){
                System.out.println("Os nomes são iguais");
            }else{
                System.out.println("Os nomes não são iguais");
            }

        }
    }

