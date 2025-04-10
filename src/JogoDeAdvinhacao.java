//Crie um programa que simula um jogo de adivinhação, que deve gerar um número aleatório entre 0 e 100
// e pedir para que o usuário tente adivinhar o número, em até 5 tentativas.
// A cada tentativa, o programa deve informar se o número digitado pelo usuário é maior ou menor do que o número gerado.
//
//Dicas:
//Para gerar um número aleatório em Java: new Random().nextInt(100);
//Utilize o Scanner para obter os dados do usuário;
//Utilize uma variável para contar as tentativas;
//Utilize um loop para controlar as tentativas;
//Utilize a instrução break; para interromper o loop.

import java.util.Random;
import java.util.Scanner;

public class JogoDeAdvinhacao {
    public static void main(String[] args) {
        System.out.println("---- Jogo da Adivinhação, tente acertar o número ---- ");
        Scanner scanner = new Scanner(System.in);
        int numeroAleatorio = new Random().nextInt(100);
        int tentativa = 5;
        int usuario = 0;

        while (tentativa <= 5 && tentativa>0){
            System.out.println("Digite um número entre 0 e 100. Tentativas restantes: " +tentativa);
            usuario = scanner.nextInt();
            tentativa--;

            if (usuario == numeroAleatorio){
                System.out.println("Parabéns, voce acertou!");
                break;
            } else if (usuario < numeroAleatorio){
                System.out.println("O numero certo é maior que " +usuario);
            } else {
                System.out.println("O numero certo é menor que " +usuario);
            }
        }
        if(usuario != numeroAleatorio) {
            System.out.println("Suas tentativas acabaram. O numero era " + numeroAleatorio);
        }
    }
}
