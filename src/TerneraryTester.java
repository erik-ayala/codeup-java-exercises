import java.util.Scanner;

class CapitalCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your sentence.");
        String userInput = scanner.next();

        int upper = 0;

        for (int i = 0; i < userInput.length(); i++) {
            char ch = userInput.charAt(i);
            if (ch >= 'A' && ch <= 'Z')
                upper++;
        }
        System.out.println("Upper case letters : " + upper);
    }
}
