public class check {
     static boolean check_arr(int arr[]){
        for(int i=0; i<arr.length; i++){
            if(arr[i]>=arr[i+1]){
              
            }else {
                return false;
            }
         }
         return true; 
       
       
}                                              
    public static void main(String[] args) {
         int arr[] = {1,22,3};                                          
        System.out.println( check_arr(arr));                                     
    }                                              
}
