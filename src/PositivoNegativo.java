//hora da pratica
//3.1 Crie um programa que solicite ao usuário digitar um número.
// Se o número for positivo, exiba "Número positivo", caso contrário, exiba "Número negativo".

import java.util.Scanner;

public class PositivoNegativo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número");
        int numero = scanner.nextInt();

        if (numero > 0){
            System.out.println("Numero Positivo");
        }else {
            System.out.println("Numero Negativo");
        }
    }
}
