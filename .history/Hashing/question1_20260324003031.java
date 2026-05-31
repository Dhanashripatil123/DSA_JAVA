import java.util.*;

public class question1 {
   public static void majorityElement(int nums[]) {
       HashMap<Integer,Integer> map = new HashMap<>();
       int n = nums.length;
       for(int i=0; i<n; i++){
           if(map.containsKey(nums[i])){ //true
               map.put(nums[i],map.get(nums[i])+1);
           }else {//false
               map.put(nums[i], value:1);
           }
       }  
       
       for(int key){

       }
   }                                               
   public static void main(String[] args) {
        int nums[] = {1,3,4,5,1,2,3,4,1};                                          
   }                                               
}
