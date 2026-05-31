public class reverse_arr {
     void swap(int l, int r, int[] arr){
         int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;                                           
     }   

     void funct(int l, int r, int[] arr){
         if(l>=arr.length){
          swap(arr[l],arr[r]);
         }
         funct(l+1,r-1);
      }
                                              
   public static void main(String[] args) {
                                              
   }                                                 
}
