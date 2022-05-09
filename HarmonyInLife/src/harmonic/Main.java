package harmonic;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        double result, sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            result = (double) 1 / numbers[i];
            sum += (double) 1 / numbers[i];
            System.out.println("1/" + numbers[i] + " =  " + String.format("%.3f", result));
        }
        System.out.println("The harmonic series result is : " + String.format("%.3f", sum));
    }
}
