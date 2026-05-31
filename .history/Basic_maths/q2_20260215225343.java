public class q2 {
      int reverse(int n){
        int reverse=0;
        int dup = n;                                           
        while(n>0){
            n = n%10;
            reverse = (reverse*10)+lastele;
            n=n/10;
        }
        System.out.print(reverse);
         return reverse;
      }       
                                        
    public static void main(String[] args) {
        q2 obj = new q2();
        obj.reverse(2389);                                        
    }                                              
}
