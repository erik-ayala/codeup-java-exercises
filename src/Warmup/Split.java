package Warmup;

import java.util.Arrays;
import java.util.Scanner;

public class Split {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter words of same category ");
        String userInput = scanner.next();
        String[] splited = userInput.split("\\s+");
        System.out.println("Words are now array: " + Arrays.toString(splited));

    }
}
