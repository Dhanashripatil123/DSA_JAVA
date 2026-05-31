public class check {
     static boolean check_arr(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]>=arr[i-1]){
              
            }else {
                return false;
            }
         }
         return true; 
       
       
}                                              
    public static void main(String[] args) {
         int arr[] = {1,2,2,3,4,5,6};                                          
        System.out.println( check_arr(arr));                                     
    }                                              
}
