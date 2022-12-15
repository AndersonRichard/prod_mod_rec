package br.edu.univas;

import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        String[] namePlayer = new String[2];
        String[] nameSelection = new String[2];
        int[] goals = new int[2];
        game(namePlayer,nameSelection,goals);
    }
    public static void game(String[] player,String[] selection,int[] goals){
        Scanner sc = new Scanner(System.in);
        for( int i = 0; i < player.length;i++){
            System.out.println("Qual o nome do jogador");
            player[i] = sc.nextLine();
            System.out.println("Qual o nome do time");
            selection[i] = sc.nextLine();
            System.out.println("Quantos gols ele fez");
            goals[i] = sc.nextInt();
            sc.nextLine();
        }

        for (int i = 0;i < player.length;i++){
            int quantidade = 0;
            if (selection[i] != null) {
                String word = selection[i];
                for (int j = 0; j < player.length; j++) {
                    if (word.equalsIgnoreCase(selection[j])) {
                        quantidade += goals[j];
                        goals[j] = 0;
                        selection[j] = null;
                    }
                }
                System.out.println(word + " - " +quantidade);
            }
        }
    }
}
