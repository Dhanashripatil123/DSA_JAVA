
public class sec_large {
     static void larger(int arr[]){
            int larger = arr[0];
            int slarger = -1;
        for(int i=1; i<arr.length; i++){
            if(arr[i]>larger){
                slarger = larger;
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
