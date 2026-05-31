public class q6 {
     boolean func(int i, ){
        int n = arr.length;
        if(i>n/2){
           return true;
        }
        return func(i+1);
     }                                             
   public static void main(String[] args) {
        q6 obj = new q6();
        String name = "Dhanu";
        obj.func(0);                                          
   }                                               
}
