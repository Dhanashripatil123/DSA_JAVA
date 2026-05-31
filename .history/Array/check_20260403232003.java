public class check {
     boolean check_arr(int arr[]){
        for(int i=0; i<arr.length; i++){
            if(arr[i]>=arr[i+1]){
              
            }else {
                return false;
            }
         }
         return true; 
       
       
}                                              
    public static void main(String[] args) {
         int arr[] = {12,23,455,56,67,456};                                          
         System.out.print(check_arr(arr));                                       
    }                                              
}
