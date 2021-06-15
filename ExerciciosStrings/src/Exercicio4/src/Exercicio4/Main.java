package Exercicio4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Digite uma palavra");
        String palavra = myScanner.nextLine();

        String[] palavraSplit = palavra.toUpperCase().split("");

        for (int i=0; i<palavraSplit.length; i++){
            for (int j=0; j<(i+1); j++){
                System.out.print(palavraSplit[j]);
            }
            System.out.println();
        }
    }
}