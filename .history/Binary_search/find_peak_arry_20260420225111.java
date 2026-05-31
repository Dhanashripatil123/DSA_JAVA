 class find_peak_arry{
    static int find_peak_moutain_arry(int[] arr){
        int low = 0;
        int high = arr.length-1;
        while(low>=high){
            int mid = (low+high)/2;
            if(arr[mid]>arr[mid+1]&&arr[mid]>arr[mid-1]) return mid;
           else low = mid+1;
        }
        return -1;
    }                                            
   public static void main(String[] args) {
         int[] arr={1,2,5,8,6,3,-1};
         System.out.println(find_peak_moutain_arry(arr));
   }                                               
 }