public class q1 {
       int count;  
                                             
//      int math(int n){
//          count = 0;
//          while (n>0) {
           
//             count = count+1;
//             n=n/10;                                      
//          }
//          System.out.println(count);
//          return count;

//}

//           ****another way***
  int count(int n){
      int count = (int)(log10(n)+1);
      System.out.println(count);
      return count;
  }
                                                 
    public static void main(String[] args) {
        q1 obj = new q1(); 
         //obj.math(7789);                                       
         obj.count(7789);                                       
    }                                              
}
