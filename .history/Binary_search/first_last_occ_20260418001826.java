import java.util.ArrayList;

public class first_last_occ {
     static int last(int arr[],int n,int target){
        ArrayList<Integer> mylist = new ArrayList<>();                                          
        int high = n-1;
        int low = 0;
        int idx1 = -1;
        int idx2 = 1;

        while(low<=high){
            int mid = (high + low)/2;
            if(arr[mid] > target){
               high = mid - 1;
            }else if(arr[mid] < target){
                low = mid+1;
            }else{
                idx1 = mid;
                idx2 = mid;
                 low = mid + 1;                                 
                int l1 = high = mid - 1;   
                mylist.add(l,l1);                              
            }
         }
     return idx1;  
     
   }                                               
   public static void main(String[] args) {
        int arr[] = {26,34,56,56,56,56,56,75,87,90};
        int target = 56;
        int n=arr.length;
        System.out.println(last(arr, n, target));
}                                               
}
