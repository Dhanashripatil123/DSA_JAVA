import java.util.*;

public class first_q { 
public static void main(String[] args) {
  String str1 = "mcjdndu cdgydga euhds";
   String str2 = "aeiou";

   for(int i=0; i<str1.length(); i++){
      char vowels = 0;
      for(int j = 0; j < str1.length(); j++){
         if(str1.charAt(i)==str2.charAt(j)){
              vowels;
              System.out.println(vowels);
         }
      }
   }
       
  }
}
