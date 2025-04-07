//conversao de Celsius para Fahrenheit com entrada de dados do usuario

import java.util.Scanner;

public class Conversao2 {
    public static void main(String[] args) {

        Scanner resposta = new Scanner(System.in);
        System.out.println("Qual temperatura em Celsius deseja converter para Fahrenheit?");

        double celsius = resposta.nextDouble(); // para receber um double
        int fahrenheit = (int) (celsius * 1.8 + 32.0);//converter para int

        System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);
    }
}
