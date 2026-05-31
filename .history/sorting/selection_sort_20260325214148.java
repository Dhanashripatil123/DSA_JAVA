package sorting;

public class selection_sort {
                                                
   public static void swap(int arr[]) {
       int n= arr.length;                                          
        for(int i=0; i<=n-2; i++){
              int min = i;                                     
            for(int j=i; j<n-1; j++){
              int temp = arr[min];
              arr[min] = arr[i];
              
            }
        }                                           
   }                                               
   public static void sorting(int arr[]) {
       int n= arr.length;                                          
        for(int i=0; i<=n-2; i++){
              int min = i;                                     
            for(int j=i; j<n-1; j++){
                if(arr[j]<arr[min]){
                  min = j;
                  swap(arr[min],arr[i]);
                }
            }
        }                                           
   }                                               
   public static void main(String[] args) {
       int arr[] = {1,23,12,1,2,23,12,34};
      
       sorting(arr);                                           
   }                                               
}
