
import java.util.Scanner;

public class Geeks {
    public static void main(String[] args) {
        System.out.println("Taking input form the user.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number: ");
        int a = sc.nextInt();
        System.out.println("Enter the Second Number: ");
        int b = sc.nextInt();       
        int sum = a + b;
        System.out.println("The sum of the given numbers is: ");
        System.out.println(sum);
    }
    
}
