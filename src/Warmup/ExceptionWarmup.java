package Warmup;
import java.util.Random;

public class ExceptionWarmup {
    public static void main(String[] args) {
        String str = "Oberon is the best class ever.";
        randomGenerator(str);

    }
    public static void randomGenerator (String str) {
        Random random = new Random();
        int UpperLimit = 50;
        int rando = random.nextInt(UpperLimit);

    }
}
