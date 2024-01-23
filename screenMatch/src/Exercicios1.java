public class Exercicios1 {
    public static void main(String[] args){
        /*Crie um programa que realize a média de duas notas decimais e exiba o resultado.*/
        double nota1 = 8.9;
        double nota2 = 6.8;

        double mediaNotas = (nota1 + nota2)/2;
        String resultado = String.format("A média das notas %.2f e %.2f é igual a %.2f.", nota1, nota2, mediaNotas);
        System.out.println(resultado);

        int mediaNotasInt = (int) mediaNotas;
        String resultado2 = String.format("A média das notas em valor inteiro é igual a %d.", mediaNotasInt);
        System.out.println(resultado2);

        /*Declare uma variável do tipo double e uma variável do tipo int.
        Faça o casting da variável double para int e imprima o resultado.*/

        double variavel1 = 40.2;
        int variavel2 = (int) variavel1/2;
        String resultado3 = String.format("O resultado 2 é: %d.", variavel2);
        System.out.println(resultado3);

        /*Declare uma variável do tipo char (letra) e uma variável do tipo String (palavra).
        Atribua valores a essas variáveis e concatene-as em uma mensagem.*/

        char char1 = 'V';
        String palavra = "iviane";

        System.out.println("O meu nome é " + char1 + palavra);

        /*Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade).
        Calcule o valor total multiplicando o preço do produto pela quantidade e apresente o resultado em uma mensagem.*/

        double precoProduto = 5.99;
        int quantidade = 10;
        double valorTotal = precoProduto * quantidade;
        System.out.println("O valor total da compra foi de R$ " + String.format("%.2f", valorTotal));

        /*Declare uma variável do tipo double valorEmDolares. Atribua um valor em dólares a essa variável.
        Considere que o valor de 1 dólar é equivalente a 4.94 reais.
        Realize a conversão do valor em dólares para reais e imprima o resultado formatado.*/

        double valorEmDolares = 10.50;
        double valorConversao = 4.94;

        double valorEmReais = valorEmDolares * valorConversao;
        String mensagem2 = String.format("O valor de %.2f dólares, com valor de conversão de %.2f, em reais é igual a %.2f reais.", valorEmDolares, valorConversao, valorEmReais);
        System.out.println(mensagem2);

        /* Declare uma variável do tipo double precoOriginal. Atribua um valor em reais a essa variável, representando o preço original de um produto.
        Em seguida, declare uma variável do tipo double percentualDesconto e atribua um valor percentual de desconto ao produto (por exemplo, 10 para 10%).
        Calcule o valor do desconto em reais, aplique-o ao preço original e imprima o novo preço com desconto.
        */

        double precoOriginalReais = 90.99;
        double percentualDesconto = 10;
        double valorDoDesconto = precoOriginalReais * (percentualDesconto / 100);
        double valorDoProdutoDesconto = precoOriginalReais - valorDoDesconto;

        String mensagem3 = String.format("O produto de valor de R$ %.2f com desconto de %.2f, economiza R$ %.2f e paga apenas %.2f.", precoOriginalReais, percentualDesconto, valorDoDesconto, valorDoProdutoDesconto);
        System.out.println(mensagem3);
    }
}
