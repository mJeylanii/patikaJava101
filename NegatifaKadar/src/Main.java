import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int n = 0, total = 0;
        while (n >= 0) {
            System.out.println("Sayi giriniz : ");
            n = inp.nextInt();
            total += n;
        }
        System.out.println("Total : " + total);
    }

}
