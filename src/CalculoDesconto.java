// hora da pratica2
//2-6 Declare uma variável do tipo double precoOriginal.
// Atribua um valor em reais a essa variável, representando o preço original de um produto.
// Em seguida, declare uma variável do tipo double percentualDesconto e atribua um valor percentual de desconto ao produto (por exemplo, 10 para 10%).
// Calcule o valor do desconto em reais, aplique-o ao preço original e imprima o novo preço com desconto.

public class CalculoDesconto {
    public static void main(String[] args) {
        double precoOriginal = 50.00;
        double percentualDesconto = 10;
        double descontoEmReais = precoOriginal * (percentualDesconto/100);
        double precoComDesconto = precoOriginal - descontoEmReais;

        String mensagem = """
               O valor do produto é R$%.2f
               Com desconto de R$%.2f fica por R$%.2f
               """.formatted(precoOriginal,descontoEmReais, precoComDesconto);

        System.out.println(mensagem);
    }
}
