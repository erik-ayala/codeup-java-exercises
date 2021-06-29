import java.util.Scanner;


public class MethodsWarmup {
    public static void age (int fact1) {
        Scanner ac = new Scanner(System.in);
        System.out.print("What is your age? ");
        String userInput = ac.next();

    }

    public static void name (String fact2) {
        Scanner nc = new Scanner(System.in);
        System.out.print("What is your Name? ");
        String userInput = nc.next();
    }

    public static void pet (String fact3) {
        Scanner pc = new Scanner(System.in);
        System.out.print("Do you have a Pet?");
        String userInput = pc.next();
        if (userInput.equals("Yes")) {
            System.out.print("We love pets here!");
        } else {
            System.out.print("Sad to hear! ");
        }
    }

    public static void main (String args) {
        System.out.println("Nice to meet you, %d ! you are %s years young!");
    }
}
