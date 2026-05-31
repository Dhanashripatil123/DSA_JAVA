

public class q2 {
                                             
      int reverse(int n){
        int reverse = 0;
        int lastele;                                           
        while(n>0){
            lastele = n%10;
            reverse = (reverse*10)+
            n=n/10;
            System.out.print(lastele);
        }
         return reverse;
      }       
                                        
    public static void main(String[] args) {
        q2 obj = new q2();
        obj.reverse(2389);                                        
    }                                              
}
