import java.util.ArrayList;

public class floor_array {
        static ArrayList<Integer> floor_arry(int arr[],int n,int x){
        ArrayList<Integer> mylist = new ArrayList<>();                                          
        int high = n-1;
        int low = 0;
        int idx1 = -1;
        int idx2 = -1;

        while(low<=high){
            int mid = (high + low)/2;
            if(arr[mid] >= x ){
               high = mid - 1;
            }else{
                idx1 = mid;
                high = mid - 1;   
            }
         }
         mylist.add(idx1);
          
         while(low<=high){
            int mid = (high + low)/2;
            if(arr[mid] >= x){
               high = mid - 1;
            }else{
                idx2 = mid;
                low = mid + 1;                                 
            }
         }
            
             mylist.add(idx2);

            return mylist;
   }                                                           
      public static void main(String[] args) {
          int arr[] = {1,3,4,5,6,7,10,10,7};
        int x=4;
        int n=arr.length;
        System.out.println(floor_arry(arr, n, x));
}                                                      
      }                                            

