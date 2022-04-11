import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.println("Sayi giriniz : ");
        int num = inp.nextInt();
        float result = 0.0F;
        System.out.println("Harmonik Serisi : ");
        while (num > 0) {
            result = result + (float)1 / num;
            num--;
            System.out.println(result + ", ");
        }


    }
}
