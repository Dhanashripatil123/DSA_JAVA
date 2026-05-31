public class reovezero_arry {
    static void array(int arr[]){
      Arr
       int n=arr.length;
       for(int i=0; i<n; i++){
         if(arr[i]==0){
             temp.add(arr[i]);
         }
       }
       for(int i=0; i<temp.length; i++){
          arr[i] = temp[i];
       }
       for(int i=temp.length; i<n; i++){
          arr[i] =0;
       }
    }                                              
   public static void main(String[] args) {
       int arr[] = {12,2,1,0,3,0,1,0,23};
       
   }                                               
}
