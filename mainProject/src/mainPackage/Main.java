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

        StringBuilder sb = new StringBuilder();
        sb.append(firstNumber);
        sb.append(", ");
        sb.append(secondNumber);
        String sbs = sb.toString();
        System.out.println(sbs);

        MyClass yee = new MyClass();
        int myInt = yee.getHello();

        System.out.println();
        System.out.println("My Class:");
        System.out.println(myInt);

        yee.setHello(4);
        myInt = yee.getHello();

        System.out.println();
        System.out.println("My Class again:");
        System.out.println(myInt);
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