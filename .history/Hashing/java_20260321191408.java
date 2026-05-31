import java.util.HashSet;

public class java {
    public static void main(String[] args) {
       HashSet<Integer> set = new HashSet<Integer>();  
       
       set.add(1);
       set.add(2);
       set.add(3);
       set.add(3);
       set.add(1);
       set.add(1);
       
       //size
       System.out.println("size of set is: "+set.size());

       if(set.contains(1)) {
          System.out.println("set contain 1"); 
       }
       if(!set.contains(6)) {
          System.out.println("does not set contain 6"); 
       }

       set.remove(1);
       if (!set.contains(1)) {
         System.out.println("does not contain 1-we delete 1");
       }
    }                                               
}
