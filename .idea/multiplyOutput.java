//3. Write a Java program that takes two numbers as input and display the product of two numbers.
//        https://data-flair.training/blogs/read-java-console-input/ (Links to an external site.)
//        Angel prefers to use the scanner class in Java.
//
//        Example:
//        Input first number: 25
//        Input second number: 5
//        Expected Output: 25 x 5 = 125


import java.util.Scanner;

public class multiplyOutput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input first number: ");
        int num1 = in.nextInt();

        System.out.print("Input second number: ");
        int num2 = in.nextInt();

        System.out.println(num1 + " x " + num2 + " = " + num1 * num2);
    }
}


