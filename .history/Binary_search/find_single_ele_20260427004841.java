public class find_single_ele {
    static int single_element(int[] arr){
       int n= arr.length;
       if(n==1) return arr[0];
       if(arr[0]!=arr[1]) return arr[0];
       if(arr[n-1]!=arr[n]) return arr[n];
       int lo=1; 
       int high=n-1;
       while(lo<high){
           int mid = lo+(lo+high)/2;
           if(arr[mid]!=arr[mid-1] && arr[mid]!=arr[mid-1]) return mid;
           int f=mid;
           int s=mid;
           if(arr[mid]==arr[mid-1]) f = mid-1;
           else s = mid+1;
           int leftcount = f-lo;
           int rightcount = high-s;
           if(leftcount %2== 0) lo=s+1;
           else high = f-1;
       }
       return 
    }                                             
   public static void main(String[] args) {
           int[] arr = {1,1,2,2,3,3,4,5,5,6,6};
           System.out.println(single_element(arr));                                       
   }                                               
}
