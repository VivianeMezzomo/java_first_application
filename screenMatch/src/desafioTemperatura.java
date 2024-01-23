import java.util.Scanner;

public class desafioTemperatura {
    public static void main(String[] args){
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite a temperatura em graus Celcius que deseja converter:");
        double temperaturaCelcius = leitura.nextInt();
        double tempraturaFahrenheit = (temperaturaCelcius * 1.8) + 32;
        String mensagem = String.format("A temperatura de %.2f Celsius é equivalente a %.2f Fahrenheit", temperaturaCelcius, tempraturaFahrenheit);
        System.out.println(mensagem);

        int tempraturaFahrenheitInt = (int) (tempraturaFahrenheit);
        String mensagem2 = String.format("A temperatura em valor inteiro é de %d Fahrenheit", tempraturaFahrenheitInt);
        System.out.println(mensagem2);
    }
}
