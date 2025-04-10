//hora da pratica
//3.2 Peça ao usuário para inserir dois números inteiros.
// Compare os números e imprima uma mensagem indicando se são iguais, diferentes, o primeiro é maior ou o segundo é maior.

import java.util.Scanner;

public class Comparacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero inteiro");
        int numero1 = scanner.nextInt();
        System.out.println("Digite novamente um numero inteiro");
        int numero2 = scanner.nextInt();

        if (numero1 == numero2){
            System.out.println("Os numeros sao iguais!");
        } else if (numero1 > numero2) {
            System.out.println("O primeiro numero é maior!");
        }else {
            System.out.println("O segundo numero digitado é maior");
        }
    }
}
