import java.math.BigInteger;

public class Factorial88 {
    public static void main(String[] args) {
        BigInteger factorial = BigInteger.ONE;
        for (int i = 1; i <= 88; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        System.out.println("Factorial of 88: " + factorial);
    }
}