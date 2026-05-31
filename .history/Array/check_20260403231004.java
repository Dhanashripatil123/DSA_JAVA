public class check {
     static void check_arr(int arr[]){
        for(int i=0; i<arr.length; i++){
            if(arr[i]>arr[i+1]){
               System.out.println();
            }else if(arr[i] < larger && arr[i]!=slarger){
                 slarger = arr[i];
            }
         } 
        System.out.println(slarger);
       
}                                              
    public static void main(String[] args) {
         int arr[] = {12,23,455,56,67,456};                                          
        larger(arr);                                         
    }                                              
}
