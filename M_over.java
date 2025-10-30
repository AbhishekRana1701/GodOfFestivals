import java.util.Scanner; 

class Calculator { 

void calculate(int a, int b) { 

System.out.println("Base Calculator: No specific calculation performed."); 

} 

} 

class Addition extends Calculator { 

void calculate(int a, int b) { 

int sum = a + b; 

System.out.println("Addition: " + a + " + " + b + " = " + sum); 

} 

} 

class Subtraction extends Calculator { 

void Calculator(int a, int b) { 

int difference = a - b; 

System.out.println("Subtraction: " + a + " - " + b + " = " + difference); 

} 

} 

public class M_over { 

public static void main(String[] args) { 

Scanner sc = new Scanner(System.in); 

System.out.print("Enter the first number: "); 

int num1 = sc.nextInt(); 

System.out.print("Enter the second number: "); 

int num2 = sc.nextInt(); 

Calculator c = new Addition(); 

Calculator c1 = new Subtraction(); 

c.calculate(num1, num2); 

c1.calculate(num1, num2); 

} 

} 