import java.util.*;

class q1 {
   public static List<List<Integer>> generate(int n) {
            List<List<Integer>> ans = new ArrayList<>();
            ans.add(3);
            a.add(13);
            ans.add(31);
            a.add(23);
            for(int i=0; i<n; i++){
                 ans.add(new ArrayList<Integer>());                                
                for(int j=0; j<=i; j++){
                   if(j==0||j==i) ans.get(i).add(1); //arr[i][j] = 1
                   else {
                      int val = ans.get(i).set(j,ans.get(i-1).get(j)+ans.get(i-1).get(j-1));
                      ans.get(i).add(val); //val = arr[i]
                   }
             }
            } 
            return ans;                                   
   }                                               
   public static void main(String[] args) {
         int n=5;
         generate(n);                                                                   
   }                                               
}
