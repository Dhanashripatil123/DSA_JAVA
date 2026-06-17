public class q2 {
  public static int fact(int n) {
      if(n==0 || n==1) return 1;                                            
     int ans = n*fact(n-1);
      return ans;
  }                                                
  public static void main(String[] args) {
       int n=5;
       System.out.println(fact(n));                                           
  }                                                
}
