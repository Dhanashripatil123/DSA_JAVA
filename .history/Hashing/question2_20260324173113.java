import java.util.HashMap;

public class question2 {
    public static void union_of_arr(int arr1[],int arr2[]) {
       HashMap<Integer,Integer> map = new HashMap<>();
       int n1= arr1.length;                                             
       int n2= arr2.length;
       for(int i=0; i<n1; i++){
                                                  
           if(map.containsKey(arr1[i],arr2[j])){ //true
               map.put(nums[i],map.get(nums[i])+1);
           }else{ //false
             map.put(nums[i], 1);
           }
       }                                              
    }                                              
    public static void main(String[] args) {
       int arr1[] = {7,3,9};
       int arr2[] = {6,3,9,2,9,4};
       union_of_arr(arr1, arr2);                                        
    }                                              
}
