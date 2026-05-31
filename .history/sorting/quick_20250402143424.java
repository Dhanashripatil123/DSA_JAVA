import sorting.quichsort;

public class quick {

     public static void quickSort(int arr[],int si,int ei) {
         if(si>=ei){
             return;
         }                                         
         //last element  
         int pidx=partition(arr,si,ei);
         quickSort(arr, si , pidx-1); //left                                     
         quickSort(arr, pidx+1 , ei); //right 

     }   
       
     public static void partition(int arr[],int si,int ei) {
             int pivot = arr[ei]; 
             int i = si-1; //to make plase for smaller than pivot
             
             for(int j=0; j<ei; j++){
                 if(arr[j] <= pivot){
                     i++;
                     //swap
                     int temp = arr[j];
                     arr[j] =arr [i];
                     arr[]                             
                 }
             }
     }
      public static void main(String[] args) {
              int arr[] = {6,3,9,8,2,5};
              quickSort(arr,0,arr.length-1);                                    
      }                                            
}
