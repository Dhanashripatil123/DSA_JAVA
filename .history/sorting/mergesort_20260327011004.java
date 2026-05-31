public class mergesort {
    void merge(arr,low,){

    }                                              
   void merge_sort(int arr[],int low,int high){
       if(low == high){
           return;
           int mid = (low+high)/2;
           merge_sort(arr, low, mid);
           merge_sort(arr, mid+1, high);
           merge(arr,low,mid,high);
       }
   }                                               
  public static void main(String[] args) {
                                                  
  }                                                
}
