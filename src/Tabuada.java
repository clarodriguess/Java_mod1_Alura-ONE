//hora da pratica
//3.4 Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10.

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero para saber sua tabuada de 1 a 10");
        int numeroUsuario = scanner.nextInt();

        for (int i = 1; i < 11; i++) {
            System.out.println(numeroUsuario +" x " +i + " = " +numeroUsuario*i);
        }
    }
}
