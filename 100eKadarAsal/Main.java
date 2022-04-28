import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("************ 1 - 100 arasindaki asal sayilar *************");

            for(int i=2; i<= 100;i++){
                int durum=1;
                for(int j=2;j<i;j++){
                    if(i%j==0){
                        durum=0;
                    }
                }
                if(durum==1){
                    System.out.print(i+" ");
                }

        }
        System.out.println("\n************ 1 - 100 arasindaki asal sayilar *************");
    }
}
