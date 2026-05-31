public class rotate_dplace_array {
   static void rotate_array(int arr[],int d){
        int temp[] = {1,2,3};
        int n=arr.length;
       for(int i=d; i<n; i++){
          arr[i-d] = arr[i];
       }

       for(int i=n-d; i<n; i++){
          arr[i] = temp[i-(n-d)];
       }

       for(int i=0; i<d; i++){
        arr[n-d+i] = temp[i];
       }
   }                                             
    public static void main(String[] args) {                                            
       int arr[] = {12,2,1,23,12};
       rotate_array(arr,2);
       for(int i:arr){
           Syste
       }                                         
    }                                              
}
