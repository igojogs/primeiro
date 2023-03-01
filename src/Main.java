import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        for (int i = 0; i < 500; i++) {
            double numeroAleatorio = rand.nextDouble() * 19000.0 + 1000.0;
            System.out.printf("%.2f\n", numeroAleatorio);
        }
    }
}