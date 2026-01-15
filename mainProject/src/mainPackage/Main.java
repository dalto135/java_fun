package mainPackage;

public class Main {
    public static void main(String[] args) {
        String statement = helloMethod();

        System.out.println(statement);
    }

    public static String helloMethod() {
        boolean truthPoop = 5 > 3;
        boolean falsehoodPoop = 3 > 5;

        String statement;

        if (truthPoop && falsehoodPoop) {
            statement = "both true";
        }
        else {
            statement = "better luck next time fucko";
        }

        return statement;
    }
}