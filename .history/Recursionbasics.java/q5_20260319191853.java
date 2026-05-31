import java.util.Scanner;

public class q5 {
    int func(int n){
       if(n == 1){
           return 1;
       }
       return n*func(n-1);

   }                                               
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);    
       System.out.print("Enter number: ");
       int n = sc.nextInt();                                           
   }                                               
}
