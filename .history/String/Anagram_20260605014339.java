import java.util.Arrays;

public class Anagram {
    static boolean ana1(String str1,String str2){
       if(str1.length()!=str2.length()) return false;
       char[] arr1 = str1.toCharArray();
       char[] arr2 = str1.toCharArray();
       Arrays.sort(arr1);
       Arrays.sort(arr2);
      
       for(int i=0; i<arr1.length; i++){
           if(arr1[i]==arr2[j]){

           }
       }
       return true;
    }                                              
    public static void main(String[] args) {
       String str1 = "race" ;
       String str2 = "care" ;
       System.out.println(ana1(str1,str2));
    }                                              
}
