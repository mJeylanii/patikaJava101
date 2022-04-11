import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.println("Sayi giriniz : ");
      System.out.println("Sayi giriniz : ");
        int y = inp.nextInt();
        int x = inp.nextInt();
        for (int i = 0; i < y; i++)
        {
            System.out.println("Cikis: " + Math.pow(x, i));
        }

    }

}
