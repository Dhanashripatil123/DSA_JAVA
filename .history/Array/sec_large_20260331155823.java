
public class sec_large {
     static void larger(int arr[]){
            int larger = arr[0];
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]>larger){
                larger=arr[i];
                larger++;
            }
         } 
        System.out.println(larger);
                                         
        }                                              
    public static void main(String[] args) {
                                                  
    }                                              
}
