import java.util.Scanner;

public class q2 {
   void num(){

   }                                                 
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      System.out.print("Enter number: ");
      int n = sc.nextInt();

      Recursionbasics obj = new Recursionbasics();

      obj.func(1, n);                                          
   }                                               
}
