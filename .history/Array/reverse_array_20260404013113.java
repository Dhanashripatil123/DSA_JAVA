public class reverse_array {
    static void reverse(int arr[]){
        int temp = arr[0];
        for(int i=1; i<arr.length; i++){
            arr[i-1] = arr[i];
        }
        arr[n-1]=temp;
    }                                              
   public static void main(String[] args) {
         int arr[] = {2,11,23,1,2,9};
         reverse(arr);
   }                                               
}
