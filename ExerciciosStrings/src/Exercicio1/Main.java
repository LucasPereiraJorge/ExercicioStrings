package Exercicio1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Digite a primeira string: ");
        String s1 = scanner.nextLine();

        System.out.printf("Digite a segunda string: ");
        String s2 = scanner.nextLine();

        System.out.printf("Comparando as duas strings ");
        System.out.printf("Primeira String: %s%n", s1);
        System.out.printf("Seugunda String: %s%n", s2);

        System.out.printf("Tamanha de \"%s\": %d caracteres%n", s1, s1.length());
        System.out.printf("Tamanha de \"%s\": %d caracteres%n", s2, s2.length());

        if (s1.length() != s2.length()){
            System.out.printf("As duas strings são de tamanhos diferentes.%n");
        }else {
            System.out.printf("As duas strings são de tamanhos iguais.%n");
        }

        if (s1.intern().equals(s2.intern())){
            System.out.printf("As duas strings possuem conteúdo iguais.%n");
        }else {
            System.out.printf("As duas strings possuem conteúdo diferente.%n");
        }
    }
}