package Exercicio3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma palavra");
        String palavra = scanner.nextLine();

        String[] palavraSplit = palavra.toLowerCase().split("");
        for (String letras : palavraSplit){
            System.out.println(letras);
        }
    }
}
