

public class Recursionbasics{

      void func(int i, int n) {
         if(i<n){
          
            return ;
         }  
         System.out.println("raj");
           
       
      }                                           
      public static void main(String[] args) {
         Recursionbasics obj = new Recursionbasics();
         obj.func(0, 5);                                 
      }                                            
}