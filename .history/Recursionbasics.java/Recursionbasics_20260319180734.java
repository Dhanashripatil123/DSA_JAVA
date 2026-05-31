import java.util.Scanner;

public class Recursionbasics{

      void func( n,int i,) {
         if(i<n){
          
            return 
            System.out.println("raj");
            func(i + 1, n);
         }  
      }                                           
      public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);

          System.out.print("Enter your name: ");
         String n = sc.nextLine(); 

         Recursionbasics obj = new Recursionbasics();
        
        
         obj.func( 5);                                 
      }                                            
}