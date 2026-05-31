package Basic_maths;

public class q2 {
       int reverse =0;  
       int lastele;                                         
      int reverse(int n){
         lastele = n%10;
         n=n/10;
         System.out.println(lastele);
         return reverse;
      }       
                                        
    public static void main(String[] args) {
        q2 obj = new q2();
        obj.reverse();                                        
    }                                              
}
