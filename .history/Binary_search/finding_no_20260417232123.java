public class finding_no {
//     static int find(int arr[],int n,int target){
//         int high = n-1;
//         int low = 0;
//         int idx = -1;
//         while(low<=high){
//             int mid = (high + low)/2;
//             if(arr[mid] > target){
//                high = mid - 1;
//             }else if(arr[mid] < target){
//                 low = mid+1;
//             }else{
//                 idx = mid;
//                 high = mid - 1;                                 
//             }
//          }
//      return idx;  
//    }                                               
//    public static void main(String[] args) {
//         int arr[] = {26,34,56,75,87,90};
//         int target = 56;
//         int n=arr.length;
//         System.out.println(  find(arr, n, target));
       
       
  // }   
  
  public static void main(String[] args) {
      static int find(int arr[], int n, int target) {
          int high = n-1;
          int low = 0;
          while(low<=high){
             int mid = (high + low)/2;
             if(arr[mid]==target) return mid;
             else if(arr[mid]<target) low=mid+1;
             else high = 
          }
      }  
      
      public static void main(String[] args) {
            int arr[] = {26,34,56,75,87,90};
            int target = 56;
            int n=arr.length;
            System.out.println(find(arr, n, target));
                                               
      }                                         
  }
}
