import java.lang.reflect.Array;
import java.util.Scanner;

class lib {

    public static void print(String arg) {
        System.out.println(arg);

    }
    public String removeSpaces(char[] c) {
        String temp = "";
        for (char cc: c) {
            if (cc != ' ') {
                temp += cc;
            }
        }

        return temp;

    }

    public double pow(double base, double exponent) {
        return Math.pow(base, exponent);
    }
    public String input() {
        Scanner scanner = new Scanner(System.in);
        return (scanner.nextLine());
    }

    public static double f(double x) {
        return (Math.pow(x,4) + 4*x + 4);
    }

    public static double derivert(double a, double dx) {
        return (f(a + dx) - f(a)) / dx;
    }

    public double andrederivert(double x1, double x2) {
        return (derivert(x2, 0.0001) - derivert(x1, 0.0001) / x2 - x2);
    }
    public lib() {

    }

}
