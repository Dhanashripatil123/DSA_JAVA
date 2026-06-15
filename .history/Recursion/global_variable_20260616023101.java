

public class global_variable {
    static int x = 10;

public static void fun() {
        x=20;
        x=90;                                           int x = 20;
}                                              
   public static void main(String[] args) {
      fun();
       x=9;
       System.out.println(x);
//       x=5;
//       System.out.println(x);
//       x=6;

   }
}
