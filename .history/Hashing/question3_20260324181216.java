public class question3 {
   public static void main(String[] args) {
        public static void union_of_arr(int arr1[],int arr2[]) {
       HashSet<Integer> map = new HashSet<>();
       int n1= arr1.length;                                             
       int n2= arr2.length;
       for(int i=0; i<n1; i++){
            map.add(arr1[i]);
            }

       for(int i=0; i<n2; i++){
            map.add(arr2[i]);
            }
             System.out.println(map.size());
            }
                                             
   }                                               
}
