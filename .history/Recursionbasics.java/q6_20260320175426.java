public class q6 {
     boolean func(int i, String name){
        int n = name.length();
        if(i>=n/2){
           return true;
        }
        if(name.charAt(i)!=name.charAt(n-i-1)){
            return false;
        }
        return func(i+1,name);
     }                                             
   public static void main(String[] args) {
        q6 obj = new q6();
        String name = "Dhanu";
       Sy                                         
   }                                               
}
