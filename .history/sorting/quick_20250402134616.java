import sorting.quichsort;

public class quick {

     public static void quickSort(int arr[],int si,int ei) {
         //last element  
         int pidx=partition(arr,si,ei);
         quickSort(arr, si , pidx-1); //left                                     
         quickSort(arr,  , pidx-1); //left                                     
     }   
       
     public static void partition(int arr[],int si,int ei) {
                                                  
     }
      public static void main(String[] args) {
              int arr[] = {6,3,9,8,2,5};
              quickSort(arr,0,arr.length-1);                                    
      }                                            
}
