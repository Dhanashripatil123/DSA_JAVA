
public class sec_large {
     static int larger(int arr[]){
            int larger = arr[0];
            int slarger = -1;
        for(int i=1; i<arr.length; i++){
            if(arr[i]>larger){
                slarger = larger;
                larger = arr[i];
            }else if(arr[i] < larger && arr[i]!=slarger){
                 slarger = arr[i];
            }
         } 
         return slarger;
       
}                                              
    public static void main(String[] args) {
         int arr[] = {3,4,23,23,5};                                          
        System.out.println( larger(arr));                                         
    }                                              
}
