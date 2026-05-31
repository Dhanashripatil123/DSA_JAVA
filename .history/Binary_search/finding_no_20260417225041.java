public class finding_no {
    static int find(int arr[],int n,int target){
       int high = arr[0];
        int low = arr[n-1];
        while(high>low){
            int mid = high + low/2;
            if(mid == target){
               return mid;
            }else if(target > mid){
                high = mid+1;
            }else
        }
   }                                               
   public static void main(String[] args) {
        int arr[] = {26,34,56,75,87,90};
        int target = 2;
        int n=arr.length;
        find(arr, n, target);
       
       
   }                                               
}
