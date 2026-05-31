 static class pattern_print{ 
 public void print1(int n){
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
}

class pattern{
     public static void main(String[] args) {
         pattern_prin                                       
     }                                             
}