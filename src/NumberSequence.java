
// This class brings to output sequence of numerals the square of which is less than defined by a user



import java.util.Scanner;

public class NumberSequence {
    public static void main(String[] args) {
        long maxValue;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the max value");
        maxValue = sc.nextInt();

        for (int i = 0; i <= Math.sqrt(maxValue); i++) {
            System.out.print(i + ", ");
        }

    }
}
