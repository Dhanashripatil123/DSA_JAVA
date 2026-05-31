import java.util.Scanner;

public class Recursionbasics{

      void func( int i, n) {
         if(i<n){
          
            return 
            System.out.println("raj");
            func(i + 1, n);
         }  
      }                                           
      public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);

          System.out.print("Enter your name: ");
         String name = sc.nextLine(); 
         Recursionbasics obj = new Recursionbasics();
        
         int n;
         obj.func(0, 5);                                 
      }                                            
}