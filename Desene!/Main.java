import java.util.Scanner;

public class Main {
    static void deseneYazdir(int sayi) {
        System.out.print(sayi + " ");
        if (sayi <= 0) return;
        deseneYazdir(sayi - 5);
        System.out.print(sayi + " ");
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int in = input.nextInt();
        deseneYazdir(in);
    }


}


