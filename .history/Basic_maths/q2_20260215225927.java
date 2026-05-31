public class q2 {
      int reverse(int n){
        int reverse=0;
        int dup = n;                                           
        while(n>0){
            int id = n%10;
            reverse = (reverse*10)+id;
            n=n/10;
        }
         if(dup==reverse){
            System.out.println("true");
         }else{
            System.out.println();
         }
            {

         }
      }       
                                        
    public static void main(String[] args) {
        q2 obj = new q2();
        obj.reverse(2389);                                        
    }                                              
}
