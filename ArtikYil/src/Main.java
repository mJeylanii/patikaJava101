import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Yil bilgisini giriniz :");
        int yil =input.nextInt();

        if (yil%100==0)
        {
            if (yil%400==0){
                System.out.printf(yil + " Artik yil");
            }
            else{
                System.out.printf(yil + " Artik yil degil");
            }
        }
        else if(yil%4==0){
            System.out.printf(yil + " Artik yil");
        }
        else{
            System.out.printf(yil + " Artik yil degil");
        }
    }
}
