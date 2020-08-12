import java.util.InputMismatchException;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        int x = getIntEAFP(); // x = method below
        System.out.println("x is " + x);
    }

    /*
     * public static int getIntLBYL() { Scanner input = new Scanner(System.in);
     * boolean isValid = true; System.out.println("What num dawg?"); String y =
     * input.nextInt(); // setting input info to variabe y for (int i = 0; i <
     * y.length; i++) { if (!Character.isDigit(y.charAt(i))) { isValid = false;
     * break; } } if (isValid) { input.close(); return Integer.parseint(y); }
     * input.close(); return 0; }
     */
    public static int getIntEAFP() {
        Scanner input = new Scanner(System.in);
        System.out.println("Give me a num");
        try {
            int x = input.nextInt();
            input.close();
            return x;
        } catch (Exception error) {
            System.out.println(error);
            return -1;
        }
    }
}