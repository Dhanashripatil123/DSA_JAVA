

public class large_no {
        static int larger(int arr[]){
            int larger = arr[0];
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]>larger){
                larger=arr[i];
               
            }
        }                                         
        }                                          
    public static void main(String[] args) {
        int arr[] = {7,4,2,5,1,0};                                          
       
        System.out.println(larger);
      
                                               
    }                                               
}
