import java.util.*;

public class first_q { 
public static void main(String[] args) {
  String str1 = "mcjdndu cdgydga euhds";
  int count = 0;

   for(int i=0; i<str1.length(); i++){
       char ch = str1.charAt(i);
       if(ch=='a' || ch=='e' || ch=='o' ||ch=='u' ){
         count++;
       };
  }
       
  }
}
