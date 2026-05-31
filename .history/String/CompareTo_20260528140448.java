

public class CompareTo {
     static void compareTo(String a,String b){
          for(int i=0; i<=a.length(); i++){
            for(int j=0; j<b.length(); j++){
                 if(a.charAt(i)!=b.charAt(j)){
                     int diff = Math.abs(i=j);
                     System.out.println(diff);
                 }else if
            }
          }
     }
   public static void main(String[] args) {
       String a = "raghav";
       String b = "greet";  
       System.out.println(a.compareTo(b));                                            
   }                                               
}
