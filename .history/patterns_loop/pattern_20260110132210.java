 class pattern_print{ 

    void print(int n){
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= 2 * i + 1; j++) {
                System.out.print("*");
            }

            for (int j = 0; j <= n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }

    void print1(int n){
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= 2 * n - (2 * i + 1); j++) {
                System.out.print("*");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
    

  void print2(int n){
            for (int i = 0; i <= n; i++) {
                for (int j = 0; j <= n-i-1; j++) {
                    System.out.print(" ");
                }
                   for(int j=0; j<=2*i+1; j++){
                    System.out.print("*");
                   }
                  
                     for(int j=0; j<=n-i-1; j++){
                         System.out.print(" ");
                     }
                     System.out.println(" ");
                    }
              
                for(int i=0; i<=n; i++){ 
                   for(int j=0; j<=i; j++){
                    System.out.print(" ");
                   }
                   for(int j=0; j<=2*n - (2*i+1); j++){
                    System.out.print("*");
                   }
                     for(int j=0; j<=i; j++){
                         System.out.print(" ");
                     }
                     System.out.println(" ");
                     }
                    }

  void print3(int n){
            for (int i = 0; i <= n; i++) {
                   for(int j=0; j<=2*i+1; j++){
                    System.out.print("*");
                   }
                  
                     for(int j=0; j<=n-i-1; j++){
                         System.out.print(" ");
                     }
                     System.out.println(" ");
                    }
              
                for(int i=0; i<=n; i++){ 
                  
                   for(int j=0; j<=2*n - (2*i+1); j++){
                    System.out.print("*");
                   }
                   for (int j = 0; j <= i; j++) {
                       System.out.print(" ");
                   }
                    System.out.println(" ");
                     }
                    }
}

void print4(){
    for
}

public class pattern{
     public static void main(String[] args) {
      pattern_print obj = new pattern_print();
        //  obj.print(4);                                     
        //  obj.print1(4);                                     
        // obj.print2(4);                                     
         obj.print3(3);                                     
     }                                             
}