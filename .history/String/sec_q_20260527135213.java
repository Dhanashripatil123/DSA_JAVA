public class sec_q {

    static boolean palidrom(int j,String str){
         for(int i=0; i<str.length(); i++){
           if(str.charAt(i)==str.charAt(j)){
                  return tru
               }else{
                  System.out.println("string is not palidrome");                                 
               }

           }
    }
   public static void main(String[] args) {
       String str = "rececar";
        int j=str.length()-1;
        palidrom(j, str);
      
       }
   }                                                 

