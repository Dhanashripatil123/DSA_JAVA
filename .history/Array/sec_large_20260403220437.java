
public class sec_large {
     static void larger(int arr[]){
            int larger = arr[0];
            int slarger = -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>larger){
                slarger = larger;
                larger = arr[i];
            }else if(arr[i] < larger && arr[i]!=slarger){
                 slarger = arr[i];
            }
         } 
        System.out.println(slarger);
       
}                                              
    public static void main(String[] args) {
         int arr[] = {12,23,455,56,,456};                                          
        larger(arr);                                         
    }                                              
}
