import java.util.*;

public class Hasmap {
   public static void main(String[] args) {
      //country(key) , population(value);                                             
       HashMap<String,Integer> map = new HashMap<>();
       

       //Insertion
       map.put("India",120);
       map.put("Us", 30);
       map.put("China", 1220);

       System.out.println(map);
   }                                               
}
