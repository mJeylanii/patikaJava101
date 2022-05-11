package MAXMIN;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
        Arrays.sort(list);
        int max = 0, min = 0, x = 0;
        Scanner input = new Scanner(System.in);
        x = input.nextInt();
        for (int i = 0; i < list.length; i++) {
          if(x < list[i]){
              System.out.println("Max " + list[i]);
              System.out.println("Min " + list[i-2]);
              break;
          }
        }
    }
}
