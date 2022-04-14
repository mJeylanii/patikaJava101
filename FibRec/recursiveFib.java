public class Demo {
   public static long fib(long n) {
      if ((n == 0) || (n == 1))
         return n;
      else
         return fib(n - 1) + fib(n - 2);
   }
   public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     int x = input.nextInt();
       System.out.println(".no Fibonacci degeri ogrenmek istediginiz giriniz");
      System.out.println(x + ". Fibonacci degeri" + fib(x) + "dir");
   }
}
