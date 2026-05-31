

public class CompareTo {
     static void thisis(String a,String b){
          for(int i=0; i<=a.length(); i++){
            for(int j=0; j<b.length(); j++){
                 if(a.charAt(i)!=b.charAt(j-1)){
                     int diff = Math.abs(i-j);
                     System.out.println(diff);
                 }else if(a.length()>b.length()){
                      int remain = a.charAt(i)-b.charAt(j);
                      System.out.println(remain);
                      break;
                 }
            }
          }
     }
   public static void main(String[] args) {
       String a = "saghav";
       String b = "reet";  
       thisis(a,b);                                           
   }                                               
}
