
public class reverse_arr2 {
     void swap(int i){
         int temp = arr[i];
        arr[i] = arr[n-i-1];
        arr[n-i-1] = temp;                                           
     }                                                
   void func(int i){
       int n;                                           
       if(i>=n/2){
           return ;
       }
       swap(a[i],a[n-i-1]);
       func(i+1);
       }                                           
   }                                               
   public static void main(String[] args) {
       

        reverse_arr2 obj = new reverse_arr2();
        obj.func(0099);

       
    for (int i; i<) {
        System.out.print(i + " ");                                              
   }                                               
}
