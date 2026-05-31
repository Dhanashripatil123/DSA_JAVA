

public class Recursionbasics{

      void func(int i, int n) {
         if(i<n){
            System.out.println();
            return ;
         }    
         func(i+1, n); 
      }                                           
      public static void main(String[] args) {
         Recursionbasics obj = new Recursionbasics();
         obj.func(0, 5);                                 
      }                                            
}