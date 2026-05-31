

public class q2 {
       int reverse =0;  
       int lastele;                                         
      int reverse(int n){
        while(n>0){
            lastele = n%10;
            n=n/10;
       
        }
      }       
                                        
    public static void main(String[] args) {
        q2 obj = new q2();
        obj.reverse(2389);                                        
    }                                              
}
