

public class fourth_q {
     static void firstletter(String str){
        
            if(Character.isUpperCase(str.charAt(0))){
             str= str.toUpperCase();
         }else{
              str= str.toLowerCase();                                    
         }
         System.out.println(str);
        }
       
        
                                                 
     public static void main(String[] args){
           String str = "aBHBSHnxjn";
            firstletter(str);
     }                                             
}
