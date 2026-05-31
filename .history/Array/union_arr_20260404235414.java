import java.util.HashSet;

public class union_arr {
   static void union(int arr[],int arr2[]){
      HashSet<Integer>set = new HashSet<Integer>();
      for(int i=0; i<arr.length; i++){
         set.insert(arr[i]);
      }

      for(int i=0; i<arr2.length; i++){
         set.insert(arr2[i]);
      }
   }                                               
    public static void main(String[] args) {
       int arr[] = {1,1,2,3,4,5};
       int arr2[] = {2,3,4,4,5,6};
       

    }                                              
}
