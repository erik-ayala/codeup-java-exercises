import java.util.Scanner;
public class practiceExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String[] studentsArr =
//                {"Amado", "Christian", "Christopher", "Corey", "Demetrio",
//                        "Diamond", "Erik", "Grady", "Jesse", "Joshua",
//                        "Juan", "Mitchell", "Moses", "Nathan", "Prachi",
//                        "Raul", "Ricardo", "Richard", "Robert", "Sam",
//                        "Sean", "Stephen", "Tiffanny", "Wagner", "Laura",
//                        "Casey", "Dorian", "Tristan", "Jordy"};
//        int randomNum = (int) (Math.random() * 28);
//        String randomName = studentsArr[randomNum];
//        /* your code goes here */
//        System.out.print("Please enter name pls: ");
//
//        String userInput = sc.next();
//
//        if (userInput.equals(randomName)) {
//            System.out.println("Woah you guessed: " + userInput);
//        }else {
//            System.out.println("Way off my friend! My name isn't " +
//                    userInput + ". It's " + randomName + ".");
//        }
//
//        String colors = "Red Orange Blue Yellow Green Purple";
//        System.out.print("What is your favorite color: ");
//        String input = sc.next();
//        if(colors.startsWith(input)) {
//            System.out.println("My fave color: " + input + " is the first one!");
//        } else if(colors.endsWith(input)){
//            System.out.println("My fave color: " + input + " is last...");
//        } else {
//            System.out.println("I don't know that color...");
//        }
//

        System.out.println("What is your favorite team? ");
        String userInput = sc.next();

        System.out.println("Your favorite team is " + userInput);


    }


        public static void LouSassle(String str) {
            System.out.println("this is how much characters there is: " + str.length());

        }



}

