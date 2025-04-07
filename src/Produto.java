//hora da pratica 2
//2.4- Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade).
// Calcule o valor total multiplicando o preço do produto pela quantidade e apresente o resultado em uma mensagem.

public class Produto {
    public static void main(String[] args) {
        double precoProduto = 11.49;
        int quantidade = 20;
        double valorTotal = precoProduto * quantidade;
        String mensagem = "O valor total da compra é R$" +valorTotal;
        System.out.println(mensagem);
    }
}
