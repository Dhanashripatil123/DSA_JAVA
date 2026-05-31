public class search_reverse {
    static int reverse(int[] arr,int tar){
        int n = arr.length;                                          
        int high = 0;
        int low = n-1; 
        
        while(low>high){
           int mid = (low+high)/2;
           if(tar == arr[mid]) return mid;
           else if(tar < arr[mid]) low=mid+1;
           else high = mid-1; 
        }
        
    }                                              
   public static void main(String[] args) {
      int[] arr = {90,87,76,67,45,34,23,12};
      int tar = 34;
      reverse(arr,tar);                                            
   }                                               
}
