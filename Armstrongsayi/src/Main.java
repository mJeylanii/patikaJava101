import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.println("Sayi giriniz : ");
        int n = inp.nextInt();
        int r;
        int sum = 0;
        int original = n;
        while (n > 0) {
            r = n % 10;
            sum += ((int) Math.pow(r, 3));
            n /= 10;
        }
        if (sum == original)
        {
            System.out.println("Bu bir Armstrong sayisi : " + sum);
        }
        else
            System.out.println("Armstrong degil");

    }


}
