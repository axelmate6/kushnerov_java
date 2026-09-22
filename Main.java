import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();

            if (number > 7) {
                System.out.println("Hello");
            }
        }
        scanner.nextLine();

        System.out.print("Enter a name: ");
        String name = scanner.nextLine();
        if ("John".equals(name)) {
            System.out.println("Hello, John");
        } else {
            System.out.println("There is no such name");
        }


        int[] numbersArray = {3, 5, 9, 12, 14, 18, 20, 21};
        System.out.println("Array elements multiple of 3 (from " + Arrays.toString(numbersArray) + "):");
        for (int num : numbersArray) {
            if (num % 3 == 0) {
                System.out.println(num);
            }
        }

        scanner.close();
    }
}
