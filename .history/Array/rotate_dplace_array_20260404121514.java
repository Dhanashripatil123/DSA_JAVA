public class rotate_dplace_array {
   static void rotate_array(int arr[],int d){
         int temp = arr[d]; 
         int n=arr.length;  
         for(int i=0; i<n; i++){
            arr[i-d] = arr[i];
         }
         arr[n-d] = temp;
   }                                             
    public static void main(String[] args) {                                            
       int arr[] = {12,2,1,23,12};
       rotate_array(arr,2);                                         
    }                                              
}
