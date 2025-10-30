
import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        System.out.println("Taking input from the user");
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = scn.nextInt();
        System.out.print("Enter the second number: ");
        int b = scn.nextInt();
        int sum = a + b ;
        System.out.print("The sum of given numbers = ");
        System.out.print(sum);
    }
}
