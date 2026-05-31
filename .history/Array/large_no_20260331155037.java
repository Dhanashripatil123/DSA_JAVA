

public class large_no {
        static void larger(int arr[]){
            int larger = arr[0];
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]>larger){
                larger=arr[i];
            }
           
        } 
        System.out.println(larger);
                                         
        }                                          
    public static void main(String[] args) {
        int arr[] = {1,4,2,5,20};                                          
       
        larger(arr);
      
                                               
    }                                               
}
