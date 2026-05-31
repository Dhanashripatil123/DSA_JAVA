import java.util.*;

public class question2 {
    public static void union_of_arr(int arr1[],int arr2[]) {
       HashMap<Integer,Integer> map = new HashMap<>();
       int n1= arr1.length;                                             
       int n2= arr2.length;
       for(int i=0; i<n1; i++){
        for(int j=0; j<n2; j++){
            if(map.containsKey(arr1[i])){ //true
               map.put(arr1[i],map.get(arr2[i])+1);
           }else{ //false
             map.put(arr1[i], 1);
             map.put(arr2[j], 1);
           }                                       
        }                                          
          
       } 
       for(int key:map.keySet()){
            if(map.get(key) > n/3){
              System.out.println(key);
            }
       }                                             
    }                                              
    public static void main(String[] args) {
       int arr1[] = {7,3,9};
       int arr2[] = {6,3,9,2,9,4};
       union_of_arr(arr1, arr2);                                        
    }                                              
}
