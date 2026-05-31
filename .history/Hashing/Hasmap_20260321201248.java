import java.util.*;

public class Hasmap {
   public static void main(String[] args) {
      //country(key) , population(value);                                             
       HashMap<String,Integer> map = new HashMap<>();
       

       //Insertion
       map.put("India",120);
       map.put("Us", 90);
       map.put("chaina", 900);
       System.out.println(map);
       map.put("chaina", 1900);
       System.out.println(map);

       if(map.containsKey("Chaina")){
          System.out.println("key is present in the map");
       }else {
           System.out.println("key is not present in the map");                                        
       }

       System.out.println(map.get("china"));
       System.out.println(map.get("Indonesia"));

       int arr[] = {12,15,18};
       for(int i=0; i<3; i++){
           System.out.println(arr[i]);
       }

       for(int n:arr){
          System.out.println(n);
       }

       for(Map.Entry<String,Integer> e:map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
       }

       Set<String
   }                                               
}
