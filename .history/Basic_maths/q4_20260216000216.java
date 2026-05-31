public class q4 {
      void prime(int n){
          int count=0;                                        
        for(int i=1; i<=n; i++){
          if(n%i==0){
             count++;
          }
}
          if(count == 2){
             System.out.println(true);
          }else{
             System.out.println(false);                                     
          }
        }
                                                
     public static void main(String[] args) {
         q4 obj = new q4();
         obj.prime(2);                                         
     }                                             
}
