public class string_Intering {
  public static boolean equals(String s1,String s2){
      if(s1.length()!=s2.length()) return false;
      for(int i=0; i<s1.length(); i++){
         if(s1.charAt(i)!=s2.charAt(i)) return 
      }
  }
  public static void main(String[] args) {
    String s1 = "dhanshri";
    String s2 = new String("dhanshri");
    //System.out.println(s1==s2);
    System.out.println(s1.equals(s2)); // true check character by charater
    equals(s1, s2);
  }                                                
}
