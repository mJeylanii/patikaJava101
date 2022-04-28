import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Find Fibonacci Series");
        System.out.println("Please enter the number of the fibonacci digit you want to see");
        Scanner input = new Scanner(System.in);
        int in = input.nextInt();
        int first = 0;
        int second = 1;
        int next = first+second;
        System.out.println(first + " + " + second + " = " + (first + second));
        for (int i = 0; i <= in; i++) {

            first = second;
            second = next;
            next = first + second;
            System.out.println(first + " + " + second + " = " + next);
        }
    }
