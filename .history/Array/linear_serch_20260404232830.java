public class linear_serch {
      static int findout(int arr[], int num){
         for(int i=0; i<arr.length; i++){
             if(arr[i] == num){
                 return i;
             }
         }
         return -1;
      }                                            
     public static void main(String[] args) {
         int arr[] = {6,7,8,4,1};
        System.out.println( findout(arr,4));                                       
     }                                             
}
