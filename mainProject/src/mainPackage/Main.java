package mainPackage;

public class Main {
    public static void main(String[] args) {
        int big = 5;
        int small = 3;

        String statement = equalityMethod(big, small);

        System.out.println(statement);
        System.out.println();

        for (String arg: args) {
            System.out.println(arg);
        }
    }

    public static String equalityMethod(int num1, int num2) {
        String statement;

        if (num1 == num2) {
            statement = "equal!";
        }
        else {
            statement = "better luck next time fucko";
        }

        return statement;
    }
}