import java.util.HashSet;

public class union_arr {
   static void union(int arr[],int arr2[]){
      HashSet<Integer>set = new HashSet<Integer>();
      for(int i=0; i<arr.length; i++){
         set.add(arr[i]);
      }

      for(int i=0; i<arr2.length; i++){
         set.insert(arr2[i]);
      }
      union(set.size());
        for(int i:set){
            union(i++) = i;
        }
        union.add(it);
   }                                               
    public static void main(String[] args) {
       int arr[] = {1,1,2,3,4,5};
       int arr2[] = {2,3,4,4,5,6};
       union(arr, arr2);

    }                                              
}
