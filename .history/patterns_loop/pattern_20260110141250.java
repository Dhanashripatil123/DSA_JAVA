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


void print4(int n){
    for(int i=0; i<=2*n-1; i++){
       int start = i;
       if(i>=n){
          start = 2*n-i;
       }
       for(int j=0; j<=start; j++){
           System.out.print("*");
       } 
       System.out.println(" ");
    }
}

void print5(int n){
    for(int i=0; i<=2*n-1; i++){
        int start = 0;
        if(i%2==0){
            start = 1;
        }
       for(int j=0; j<=i; j++){
           System.out.print(start+" ");
           
           start = 1-start;
       } 
       System.out.println(" ");
    }
}

void print6(int n){
    int space = 2*(n-1)
    for(int i=1; i<=n; i++){
        //number
      for(int j=1; j<=i; j++){
           System.out.print(j);
       } 
       //space
       for (int j = 1; j <= space; j++) {
           System.out.print(" ");
       }
       //number
       for (int j = i; j >= 1; j--) {
           System.out.print(j);
       }

       System.out.println(" ");
    }
}
 }

public class pattern{
     public static void main(String[] args) {
      pattern_print obj = new pattern_print();
        //  obj.print(4);                                     
        //  obj.print1(4);                                     
        // obj.print2(4);                                     
        // obj.print3(3);                                     
        // obj.print4(3);                                     
        //obj.print5(4);                                     
         obj.print6(5);                                     
     }                                             
}