import java.util.Scanner;

public class Exercicios2 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        /*Crie um programa que solicite ao usuário digitar um número.
        Se o número for positivo, exiba "Número positivo", caso contrário, exiba "Número negativo".*/

        System.out.println("Digite um número: ");
        int numero = leitura.nextInt();

        if (numero > 0){
            System.out.println("Número positivo");
        } else {
            System.out.println("Número negativo.");
        }

        /*Peça ao usuário para inserir dois números inteiros.
        Compare os números e imprima uma mensagem indicando se são iguais, diferentes, o primeiro é maior ou o segundo é maior.*/

        System.out.println("Digite um número inteiro: ");
        int primeiroNumero = leitura.nextInt();
        System.out.println("Digite um outro número inteiro: ");
        int segundoNumero = leitura.nextInt();

        if (primeiroNumero == segundoNumero) {
            System.out.println("Os números são iguais.");
        } else {
            System.out.println("Os números são diferentes.");
        }

        if (primeiroNumero != segundoNumero) {
            if (primeiroNumero > segundoNumero) {
                System.out.println("O primeiro número é maior.");
            } else {
                System.out.println("O segundo número é maior.");
            }
        }

        /* Crie um menu que oferece duas opções ao usuário:
        "1. Calcular área do quadrado" e
        "2. Calcular área do círculo".
        Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada.*/

        System.out.println("Digite 1 para calcular a área do quadrado ou digite 2 para calcular área do círculo.");
        int opcaoEscolhida = leitura.nextInt();

        switch (opcaoEscolhida){
            case 1:
                //Caso escolhido 1 - calcular a área do quadrado
                System.out.println("Você escolheu calcular a área do quadrado.");
                System.out.println("Digite a medida da base do quadrado:");
                double baseQuadrado = leitura.nextDouble();
                System.out.println("Digite a altura do quadrado:");
                double alturaQuadrado = leitura.nextDouble();

                double areaQuadrado = baseQuadrado * alturaQuadrado;
                System.out.println("A área do quadrado é igual a: " +  String.format("%.2f", areaQuadrado));
                break;

            case 2:
                //Caso escolhido 2 - calcular a área do círculo
                System.out.println("Você escolheu calcular a área do círculo.");
                System.out.println("Digite a medida do raio do círculo:");
                double raio = leitura.nextDouble();

                double areaCirculo = Math.PI * Math.pow(raio, 2);
                System.out.println("A área do círculo é igual a: " +  String.format("%.2f", areaCirculo));
                break;

            case -1:
                break;
         }

        /*Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10.*/

        System.out.println("Insira o número para o qual deseja a tabuada: ");
        int numeroTabuada = leitura.nextInt();

        for (int i = 1; i <= 10; i++){
            int tabuada = i * numeroTabuada;
            System.out.println(i + " X " + numeroTabuada + " = " + tabuada);
        }

        /*Crie um programa que solicite ao usuário a entrada de um número inteiro.
        Verifique se o número é par ou ímpar e exiba uma mensagem correspondente.*/

        System.out.println("Insira um número par ou ímpar:");
        int numeroParImpar = leitura.nextInt();

        if(numeroParImpar % 2 == 0){
            System.out.println("Este número é PAR.");
        } else {
            System.out.println("Este número é ÍMPAR.");
        }

        /*Crie um programa que solicite ao usuário um número e calcule o fatorial desse número.*/

        System.out.println("Insira um número para obter o fatorial:");
        int numeroFatorial = leitura.nextInt();
        int resultadofatorial = 1;

        for (int i = 1; i <= numeroFatorial; i++) {
            resultadofatorial *= i;
        }

        System.out.println("O fatorial de " + numeroFatorial + " é: " + resultadofatorial);
    }
}
