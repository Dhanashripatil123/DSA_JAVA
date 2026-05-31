public class fibonacci {
   int func(int n){
       if(n<=1){
          return n;
       }
       return func(n-1)+func(n-2);
   }                                               
   public static void main(String[] args) {
       fibonacci obj = new fibonacci();
       int n=5;
       for(int i=0; i<n; i++){
          System.out.println(i + "");
       }
   }                                               
}
