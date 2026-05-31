
public class reverse_arr2 {
     void swap(int i){
         int temp = i;
        i = n-i-1;
        n-i-1 = temp;                                           
     }                                                
   void func(int i){
       int n;                                           
       if(i>=n/2){
           return ;
       }
       swap(i,n-i-1);
       func(i+1);
       }                                           
   }                                               
   public static void main(String[] args) {
       
        int n=0099;
        reverse_arr2 obj = new reverse_arr2();
        obj.func(0099);

       
    for (int i; i<=0; i++) {
        System.out.print(i + " ");                                              
   }                                               
}
