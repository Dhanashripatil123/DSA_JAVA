public class fibonacci {
   int fib(int n){
       if(n<=1){
          return n;
       }
       return func(n-1)+func(n-2);
   }                                               
   public static void main(String[] args) {
       fibonacci obj = new fibonacci();
       int n=8;
       for(int i=0; i<n; i++){
          System.out.println(obj.func(i) + " ");
       }
   }                                               
}
