public class squrt {
//***************** time complexity(n(root n)) */
//      static int squrt_1(int n){
//         int root=0;                                          
//         for(int i=0; i<=n; i++){
//           if(i*i>n) break; 
//           root = i;    
//         }
//         return root;
//      }                                             
//      public static void main(String[] args) {
//          int n=9;
//          System.out.println(squrt_1(n));

//      }  

// ******************************* Binary Search ************************ 
//******************************** time complexity (n(log(n)))  */

static int squrt_1(int n){
     int lo=1; 
     int high=n;
     while(lo>high){
         int mid = (lo+high)/2;
         if(mid*mid = n) return mid;
         else if(mid*mid > n) lo=high-1;
     }
}
public static void main(String[] args) {
    int n=25;
    System.out.println(squrt_1(n));                                              
}
}

