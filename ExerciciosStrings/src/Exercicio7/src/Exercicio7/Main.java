package Exercicio7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Digite uma frase: ");
        String fraseDigitada = myScanner.nextLine();
        String[] fraseSplit = fraseDigitada.split("");

        int vogais = 0;
        int espaçosEmBranco = 0;

        String[] letrasVogais = {"a", "e", "i", "o", "u"};
        for (int i=0; i< fraseSplit.length; i++){
            if (fraseSplit[i].equalsIgnoreCase(" ")){
                espaçosEmBranco++;
            }
            for (int j=0; j<letrasVogais.length; j++){
                if (fraseSplit[i].equalsIgnoreCase( letrasVogais[j])){
                    vogais++;
                }
            }
        }
        System.out.printf("Espaços em branco existente na frase: %d%n", espaçosEmBranco);
        System.out.printf("vogais existente na frase: %d", vogais);
    }
}