public class finding_no {
   public static int find(int arr[],int n, ){
       int high = arr[0];
        int low = arr[n-1];
        while(high>low){
            int mid = high + low/2;
            if(mid == target){
               return mid;
            }
        }
   }                                               
   public static void main(String[] args) {
        int arr[] = {2,5,3,4,1,2};
        int target = 2;
        int n=arr.length;
       
       
   }                                               
}
