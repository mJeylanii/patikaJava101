import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.println("Sayi giriniz : ");
        int y = inp.nextInt();
        for (int i = 0; i <= 10; i++)
        {
            System.out.println("Cikis: " + Math.pow(2, i));
        }

    }

}
