

public class Recursionbasics{

      void func(int key, int i) {
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