import java.util.Scanner;

public class q2 {
   void num(int i,int n){
        if(i<n){
            return ; 
        }
   }                                                 
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      System.out.print("Enter number: ");
      int n = sc.nextInt();

      num obj = new num();

      obj.func(1, n);                                          
   }                                               
}
