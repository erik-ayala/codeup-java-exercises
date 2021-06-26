public class SyntaxTypesVariables {
    public static void main(String[] args) {
        String name = "Erik";
        String activity = "is eating";
        String food = "an English muffin.";
        String complete = String.format(name, activity, food);

        System.out.println(complete);

    }
}
