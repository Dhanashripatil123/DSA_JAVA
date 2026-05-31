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
        int[] arr = {2, 3, 4, 1, 5};

        reverse_arr obj = new reverse_arr();
        obj.funct(0, arr.length - 1, arr);

        // print array
        for (int i : arr) {
            System.out.print(i + " ");                                        
   }                                                 
}
