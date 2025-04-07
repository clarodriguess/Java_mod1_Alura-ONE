//hora da pratica2
//2-5 Declare uma variável do tipo double valorEmDolares. Atribua um valor em dólares a essa variável.
// Considere que o valor de 1 dólar é equivalente a 4.94 reais.
// Realize a conversão do valor em dólares para reais e imprima o resultado formatado.

public class ConversaoDolaresReais {
    public static void main(String[] args) {
        double valorEmDolares = 50.90;
        double taxaDeConversao = 4.94;

        double valorEmReais = valorEmDolares * taxaDeConversao;

        System.out.println("O valor em reais é: " + valorEmReais);

        //limitando as casas decimais com format():
        System.out.println(String.format("O valor em reais é %.2f",valorEmReais));
    }
}
