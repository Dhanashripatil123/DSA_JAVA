public class Anagram {
    static boolean ana1(String str1,String str2){
       if(str1.length()!=str2.length()) return false;
       char[] arr1 = str1.toCharArray();
       char[] arr2 = str1.toCharArray();
       arr1.sort();
       arr1.sort();
       for(int i=0; i<arr1.length; i++){
          
       }
       return true;
    }                                              
    public static void main(String[] args) {
       String str1 = "race" ;
       String str2 = "care" ;
       System.out.println(ana1(str1,str2));
    }                                              
}
