import java.util.*;

public class question3 {

        public static void Intersection_of_arr(int arr1[],int arr2[]) {
       HashSet<Integer> map = new HashSet<>();
       int count =0;
       int n1= arr1.length;                                             
       int n2= arr2.length;
       for(int i=0; i<n1; i++){
            map.add(arr1[i]);
            }

       for(int j=0; j<n2; j++){
            if(map.contains(arr2[j])){
               count++;
               map.remove(arr2[j]);
            }
            }
             System.out.println(count);
            }
             public static void main(String[] args) {
       int arr1[] = {7,3,9,4};
       int arr2[] = {6,3,9,2,9,4};
       Intersection_of_arr(arr1, arr2);                                        
    }                                    
   }                                               

