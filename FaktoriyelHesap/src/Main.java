import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.println("Sayi giriniz : ");
        int n = inp.nextInt();
        System.out.println(faktoriyel(n));
    }

    public static int faktoriyel(int num) {
        int sum = num;
        if (num <= 0) {
            return 1;
        }
        return sum *= faktoriyel(num - 1) ;
    }

}
