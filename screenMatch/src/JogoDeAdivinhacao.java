import java.util.Random;
import java.util.Scanner;

public class JogoDeAdivinhacao {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int randomNumber = new Random().nextInt(100);
        //System.out.println("Número aleatório: " + randomNumber);
        int tentativa;

        System.out.println("Tente adivinhar, em até 5 tentativas, o número aleatório escolhido digitando um número entre 0 e 100.");

        for (int i = 1; i <= 5; i++){
            System.out.println("Tentativa " + i);
            tentativa = leitura.nextInt();

            if (tentativa == randomNumber){
                System.out.println("Parabéns você adivinhou o número aleatório!");
                break;
            } else if (i < 4) {
                System.out.println("Tente novamente");
            } else {
                System.out.println("Não foi dessa vez. O número aleatório era: " + randomNumber);
            }
        }
    }
}
