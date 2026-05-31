public class finding_no {
    static int find(int arr[],int n,int target){
       int high = 0;
        int low = arr[n-1;
        int idx = -1;
        while(high>=low){
            int mid = high + low/2;
            if(arr[mid] == target){
                idx = mid; 
               return mid;
            }else if(target > arr[mid]){
                high = mid+1;
            }else{
                 low = mid - 1;                                 
            }
         }
     return idx;  
   }                                               
   public static void main(String[] args) {
        int arr[] = {26,34,56,75,87,90};
        int target = 26;
        int n=arr.length;
        System.out.println(  find(arr, n, target));
       
       
   }                                               
}
