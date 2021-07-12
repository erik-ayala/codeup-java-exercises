import java.util.Scanner;


public class ControlFlowExercises {
    public static void main(String[] args) {
        /// 1
//        for (int i = 5; i <= 15; i++) {
//            System.out.print(" " + i);
//        }
//          2
//        int i = 1;
//        do {
//           i = i * 2;
//            System.out.println(i);
//        } while (i <= 100);

//        int i = 100;
//        do {
//            i = i -5;
//            System.out.println(i);
//        } while (i > 0);

        //fizzbuzzz

//        for (int i = 1; i <=100; i++){
//
//            if (i % 3 == 0) {
//                System.out.println("Fizz");
//            }
//            if (i % 5 == 0){
//                System.out.println("Buzz");
//            }
//            if (i % 3 == 0 && i % 5 == 0 ) {
//                System.out.println("Fizzbuzz");
//            }
//            System.out.println(i);
//        }

        //////

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        int input = scanner.nextInt();
//        System.out.println("number | squared | cubed");
//        System.out.println("------ | ------- | -----");
//
//        for (int i = 1; i < input + 1; i++) {
//            System.out.println(i + " | " + (i * i) + " | " + (i * i * i));
//        }
    Scanner scanner = new Scanner(System.in);
    gradeApplication(scanner);

    }

    public static void gradeApplication (Scanner scan) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number form 1 to 100: ");
        int input = scanner.nextInt();
        if (input <= 100 && input >= 88) {
            System.out.println("You're grade is A");
            yesNo(scanner);
        }
        if (input <= 87 && input >= 80) {
            System.out.println("You're grade is B");
            yesNo(scanner);
        }
        if (input <= 79 && input >= 67) {
            System.out.println("You're grade is C");
            yesNo(scanner);
        }
        if (input <= 66 && input >= 60) {
            System.out.println("You're grade is D");
            yesNo(scanner);
        }
        if (input <= 59 && input >= 0) {
            System.out.println("You're grade is F");
            yesNo(scanner);
        }
    }
    public static void yesNo (Scanner scanner) {
        System.out.println("Do you want to continue? Y/N");
        String choice = scanner.next();
        if (choice.equalsIgnoreCase("y")) {
            gradeApplication(scanner);
        } else if (choice.equalsIgnoreCase("n")) {
            return;
        }

    }
}
