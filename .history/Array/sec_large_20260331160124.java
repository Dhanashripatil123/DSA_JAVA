
public class sec_large {
     static void larger(int arr[]){
            int larger = arr[0];
            int slarger = 
        for(int i=0; i<arr.length; i++){
            if(arr[i]>larger && arr[i]==larger){
                larger=arr[i];
                larger++;
            }
         } 
        System.out.println(larger);
}                                              
    public static void main(String[] args) {
         int arr[] = {1,4,5,20};                                          
         larger(arr);                                          
    }                                              
}
