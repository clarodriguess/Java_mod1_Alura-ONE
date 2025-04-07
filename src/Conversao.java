//Escreva um programa que converta uma temperatura em graus Celsius para Fahrenheit.
// Utilize variáveis para representar os valores das temperaturas e imprima no console o valor convertido de Celsius para Fahrenheit.
//crie uma variável inteira para exibir a temperatura em Fahrenheit sem casas decimais.
// Lembre-se que provavelmente você precisará fazer um casting de valores

public class Conversao {
    public static void main(String[] args) {
        int celsius = 20;
        double fahrenheit = (celsius * 1.8) + 32;
        int valorFahrenheit = (int)fahrenheit;
        System.out.println( celsius +" graus Celsius é equivalente a " +fahrenheit+ " graus fahrenheit");
        System.out.println( celsius +" graus Celsius é equivalente a " +valorFahrenheit+ " graus fahrenheit");

    }
}
