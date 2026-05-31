import java.util.ArrayList;

public class floor_array {
        static ArrayList<Integer> floor_(int arr[],int n,int target){
        ArrayList<Integer> mylist = new ArrayList<>();                                          
        int high = n-1;
        int low = 0;
        int idx1 = -1;
        int idx2 = -1;

        while(low<=high){
            int mid = (high + low)/2;
            if(arr[mid] > target){
               high = mid - 1;
            }else if(arr[mid] < target){
                low = mid+1;
            }else{
                idx1 = mid;
                high = mid - 1;   
            }
         }
         mylist.add(idx1);
          
         while(low<=high){
            int mid = (high + low)/2;
            if(arr[mid] > target){
               high = mid - 1;
            }else if(arr[mid] < target){
                low = mid+1;
            }else{
                idx2 = mid;
                low = mid + 1;                                 
            }
         }
            
             mylist.add(idx2);

            return mylist;
   }                                                           
      public static void main(String[] args) {
                                                  
      }                                            
}
