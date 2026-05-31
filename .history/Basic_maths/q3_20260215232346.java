public class q3 {
      void division(int n){
         for(int i=1; i<=n; i++){
             if(n%i==0){
               System.out.println(i);
             }
         }
      }   
      public static void main(String[] args) {
           q3 obj= new q3();
            obj.division(36);
      }                                         
}
