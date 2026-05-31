public class sec_q {
   public static void main(String[] args) {
       String str = "rececar";
        int j=str.length()-1;
       
       for(int i=0; i<str.length(); i++){
           
               if(str.charAt(i)==str.charAt(j)){
                   System.out.println("string is palidrome");
               }else{
                  System.out.println("string is not palidrome");                                 
               }

           }
       }
   }                                                 

