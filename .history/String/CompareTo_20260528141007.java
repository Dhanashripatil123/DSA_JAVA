

public class CompareTo {
     static void compareTo1(String a,String b){
          for(int i=0; i<=a.length(); i++){
            for(int j=0; j<b.length(); j++){
                 if(a.charAt(i)!=b.charAt(j)){
                     int diff = Math.abs(i=j);
                     System.out.println(diff);
                 }else if(a.length()>b.length()){
                      int remain = a.charAt(i)-b.charAt(j);
                      System.out.println(remain);
                 }
            }
          }
     }
   public static void main(String[] args) {
       String a = "saghav";
       String b = "reet";  
       a.compareTo(a)                                           
   }                                               
}
