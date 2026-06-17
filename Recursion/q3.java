import java.util.Scanner;

public class q3 {
  public static int pow(int a, int b) {
    //    if(b==0) return 1;
    //    int ans = a*pow(a, b-1); 
    //    return ans;   
    
    /********* another method  */
    if(b==0) return 1;
    int call = pow(a,b/2);
    if(b%2==0){
     return call*call;
    }else{
      return a*call*call; 
    }
  }                                                 
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();   
       int b = sc.nextInt();       
       System.out.println(pow(a, b));
   }                                               
}
