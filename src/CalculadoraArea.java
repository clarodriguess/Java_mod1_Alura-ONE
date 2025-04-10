// hora da pratica
//3.3 Crie um menu que oferece duas opções ao usuário: "1. Calcular área do quadrado" e "2.Calcular área do círculo".
// Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada.

import java.util.Scanner;

public class CalculadoraArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 3){
        System.out.println("""
                Escolha uma opção:
                1 - calcular a area do circulo
                2 - calcular a area do quadrado
                3 - sair
                """);
        opcao = scanner.nextInt();

        switch (opcao){
            case 1:
                System.out.println("Qual o raio do circulo?");
                double raio = scanner.nextDouble();
                double areaCirculo = 3.1415 * (raio * raio);
                System.out.println("A area do circulo é " +areaCirculo);
                break;
            case 2:
                System.out.println("Qual é o tamanho do lado do quadrado?");
                double ladoQuadrado = scanner.nextDouble();
                double areaQuadrado = ladoQuadrado * ladoQuadrado;
                System.out.println("A area do quadrado é " +areaQuadrado);
                break;
            case 3:
                System.out.println("Programa encerrado");
                break;
            default:
                System.out.println("Opcao invalida. Digite 1, 2 ou 3");
                break;
        }
        }
    }
}
