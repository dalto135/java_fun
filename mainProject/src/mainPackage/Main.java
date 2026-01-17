package mainPackage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        String firstString = scanner.nextLine();

        System.out.println("Enter another number:");
        String secondString = scanner.nextLine();

        int firstNumber = Integer.parseInt(firstString);
        int secondNumber = Integer.parseInt(secondString);

        String statement = equalityMethod(firstNumber, secondNumber);

        System.out.println();
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
            statement = "unequal, better luck next time fucko";
        }

        return statement;
    }
}