public class mergesort {
    void merge(int arr,int low,int mid,int high){
       int temp;

       int left = low;
       int right = mid+1;
       
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
      int arr[] = {3,2,45,12,9,0,2,1};
      merge_sort(arr);                                            
  }                                                
}
