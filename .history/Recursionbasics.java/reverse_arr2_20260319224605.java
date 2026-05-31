
public class reverse_arr2 {
     void swap(int l, int r, int[] arr){
         int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;                                           
     }                                                
   void func(){
       if(i>=n/2){
           return ;
       }
       swap(a[i],a[n-i-1]);
       func(i+1);
       }                                           
   }                                               
   public static void main(String[] args) {
                                                    
   }                                               
}
