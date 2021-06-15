package Exercicio2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe seu nome");
        String usuário = scanner.nextLine();

        StringBuilder nomeBuilder = new StringBuilder();
        nomeBuilder.append(usuário).reverse();
        String nomeRevers = String.valueOf(nomeBuilder);
        System.out.print(String.valueOf(nomeBuilder));

    }
}
