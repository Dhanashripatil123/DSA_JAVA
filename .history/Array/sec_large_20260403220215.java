
public class sec_large {
     static int larger(int arr[]){
            int larger = arr[0];
            int slarger = -1;
        for(int i=0; i<arr.length-1; i++){
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
         int arr[] = {23,12,3,41};                                          
        System.out.println( larger(arr));                                         
    }                                              
}
