import java.util.*;

class q1 {
   public List<List<Integer>> generate(int n) {
            List<List<Integer>> ans = new ArrayList<>();
            for(int i=0; i<n; i++){
                 ans.add(new ArrayList<>());                                
                for(int j=0; j<=i; j++){
                   if(j==0||j==i) ans.get(i).set(j,1);
             }
            }                                    
   }                                               
   public static void main(String[] args) {
                                                 
   }                                               
}
