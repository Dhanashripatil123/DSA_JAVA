public class squrt {
     static void squrt_1(int n){
        int root=0;                                          
        for(int i=0; i<=n; i++){
          if(i*i>n) break;
          root = i;    
        }
     }                                             
     public static void main(String[] args) {
         int n=5;
         squrt_1(n);

     }                                             
}
