// class Recursionbasics{
       
//        public static void printDec(int n){
//             if(n==1){
//                 System.out.println(1); 
//                 return;                                 
//             }                                      
//             System.out.println(n+"");
//             printDec(n-1);                                     
//        }

//        public static void main(String[] args) {
//                int n = 10;
//                 printDec(n);
//        }  
// }

// class Recursionbasics{
       
//        public static void printDec(int n){
//             if(n==1){
//                 System.out.println(n); 
//                 return;                                 
//             } 
//             printDec(n - 1);                                     
//             System.out.println(n+"");
                                                
//        }

//        public static void main(String[] args) {
//                int n = 10;
//                 printDec(n);
//        }  
// }

// class Recursionbasics{
       
//        public static int fact(int n){
//             if(n==0){
//                    return 1;                                 
//             } 
//             int fnm= fact(n-1);
//             return n*fnm;                           
//            }

//        public static void main(String[] args) {
//                int n = 5;
//                 int result = fact(n);
//                 System.out.println(result);
//        }  
// }

// class Recursionbasics{
       
//        public static int sumnaturalno(int n){
//             if(n==1){
//                    return 1;                                 
//             } 
//             int fnm = sumnaturalno(n-1);
//             return n += fnm;                           
//            }

//        public static void main(String[] args) {
//                int n = 5;
//                 int result = sumnaturalno(n);
//                 System.out.println(result);
//        }  
// }

// public class Recursionbasics{
//        public static int fib(int n) {
//                if (n==0) {
//                      return 0; 
//                }

//                if (n==1) {
//                      return 1; 
//                }

//               // if (n==0 || n==1) {
//               //        return n;
//               // }

//              int fnm1 = fib(n-1);
//              int fnm2 = fib(n-2);
//              int fn =  fnm1+fnm2;
//              return fn;
//        }
//        public static void main(String[] args) {
//               int n=25;
//               int result= fib(n);
//               System.out.println(result);
//        }
// }

// public class Recursionbasics{
//       public static boolean sortedarray(int arr[], int i) {
           
//             if(i == arr.length-1){
//                   return true;
//             }

//             if(arr[i]>arr[i+1]){
//                   return false;
//             }

//             return sortedarray(arr, i + 1);
//       }
//       public static void main(String[] args) {
//             int arr[]={1,2,3,4,5};
//             System.out.println(sortedarray(arr,0));
//       }
// }

public class Recursionbasics{
      public static int firstoccu(int arr[] ,int key, int i) {
            if(i==arr.length){
                  return -1;
            }

            if(arr[i]==key){
                 return i;
            }
            return firstoccu(arr,key,i+1);
      }
      public static void main(String[] args) {
            int arr[] = {2,3,4,5,6};
           
           System.out.println(firstoccu(arr, 2, 0));
      }
}

// public class Recursionbasics{
//       public static int squr(int x,int n) {
//            if(n==0){
//                return 1;
//            }
//       //      int xnm1 = squr(x,n-1); 
//       //      int xm = x*xnm1;
//       //      return xm;

//            return x*squr(x,n-1);
//       }
//       public static void main(String[] args) {
//             System.out.println(squr(2,10));
//       }
// }

public class Recursionbasics{

      public static void mykey(int key, int i,int arr[]) {
               if(i == arr.length){
                         return;                         
               } 

               if(arr[i] == key){
                     System.out.print(i + " ");
               }  
               mykey(key, i+1, arr);  
      }                                           
      public static void main(String[] args) {
             int arr[] = {1,2,3,4,5,6,7,8,9,10};
             int key = 2;
             mykey(key,0,arr); 
             System.out.println();                                   
      }                                            
}