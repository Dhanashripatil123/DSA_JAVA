

public class Recursionbasics{

      void func( i, n) {
         if(i<n){
          
            return ;
            System.out.println("raj");
            func(i + 1, n);
         }  
       
       
      }                                           
      public static void main(String[] args) {
            int i;
            int n;
         Recursionbasics obj = new Recursionbasics();
         obj.func(0, 5);                                 
      }                                            
}