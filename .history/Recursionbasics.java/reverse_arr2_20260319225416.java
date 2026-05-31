
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
        int[] arr = {2, 3, 4, 1, 5};

        reverse_arr obj = new reverse_arr();
        obj.funct(0, arr.length - 1, arr);

       
    for (int i : arr) {
 System.out.print(i + " ");                                              
   }                                               
}
