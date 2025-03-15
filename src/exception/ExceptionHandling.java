package exception;

import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number");
        String inputX = scanner.nextLine();
        System.out.println("Please enter number");
        String inputY = scanner.nextLine();

        try {
            int x = Integer.parseInt(inputX);
            int y = Integer.parseInt(inputY);

            int z = x / y;

            System.out.println("Result: " + z);

        } catch (ArithmeticException e) {
            System.out.println("Can not / by zero");
        } catch (NumberFormatException e) {
            System.out.println("Can not allow decimal values");
        } catch (Exception e) {
            System.out.println("e = " + e);
        } finally {
            System.out.println("Hi");
        }

        System.out.println("Bey");
    }

}
