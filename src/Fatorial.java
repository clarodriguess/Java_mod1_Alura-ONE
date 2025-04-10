//hora da pratica
//3.6 Crie um programa que solicite ao usuário um número e calcule o fatorial desse número.

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero");
        int n = scanner.nextInt();
        int fatorial = n;

        for (int i = n -1 ; i > 0; i--) {
            fatorial *= i;
        }
        System.out.println("O fatorial de " +n +" é " +fatorial);
    }
}
