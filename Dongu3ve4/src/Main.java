import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sayi giriniz");
        int y = input.nextInt();
        int sum = 0, x = 0;
        for (int i = 1; i <= y; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                sum += i;
                x++;
            }
        }
        System.out.println("Ortalama" + sum / x);
    }
}
