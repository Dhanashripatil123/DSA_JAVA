import java.util.Scanner;

public class Recursionbasics {

   void func(int i, int n) {
      if (i > n) {
         return;
      }

      System.out.println("raj");
      func(i + 1, n);
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter number: ");
      int n = sc.nextInt();

      Recursionbasics obj = new Recursionbasics();
      obj.func(1, n);
   }
}