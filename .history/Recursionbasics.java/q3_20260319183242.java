public class q3 {
    void num(int i,int n){
        if(i>1){
            return ; 
        }

        System.out.println(i);
        num(i-1, n);
   }                                                 
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      System.out.print("Enter number: ");
      int n = sc.nextInt();

      q3 obj = new q3();
      obj.num(1, n);                                          
   }                                                                     
}
