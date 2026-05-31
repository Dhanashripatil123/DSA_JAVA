import java.util.Scanner;

public class q4 {
      void func(i,sum){
         if(i<1){
            System.out.println(sum);
            return;
         }
         func(i-1,sum+1);
      }                                            
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);    
           System.out.print("Enter number: ");
          int n = sc.nextInt();
          
          q4 obj = new q4();
          obj.func()
     }                                             
}
