import java.util.Locale;

public class Main {

    // Question 1 - calculateGrade
    public static char calculateGrade(int grade) {
        if (grade >= 90) {
            return 'A';
        }
        else if (grade >= 80) {
            return 'B';
        }
        else if (grade >= 70) {
            return 'C';
        }
        else if (grade >= 60) {
            return 'D';
        }
        else if (grade >= 50) {
            return 'E';
        }
        return 'F';
    }

    // Question 2 - fizzBuzz
    public static String fizzBuzz(int num) {
        if (num % 3 == 0 && num % 5 == 0) {
            return "fizzbuzz";
        }
        else if (num % 3 == 0) {
            return "fizz";
        }
        else if (num % 5 == 0) {
            return "buzz";
        }
        return "unlucky";
    }

    // Question 3 - frontBack
    public static String frontBack(String str) {
        if (str.length() >= 2) {
            String substring = str.substring(0,2);
            return substring + str + substring;
        }
        return str;
    }

    // Question 4 - twoAsOne
    public static boolean twoAsOne(int x, int y, int z) {
        return x + y == z || z + y == x || x + z == y;
    }

    // Question 5 - endUp
    public static String endUp(String str) {
        if (str.length() <= 3) {
            return str.toUpperCase();
        } else {
            String substring = str.substring(str.length() - 3);
            String prefix = str.substring(0, str.length() - 3);
            return prefix + substring.toUpperCase();
        }
    }
}
