import java.util.ArrayList;

public class reovezero_arry {
//     static void array(int arr[]){
//       ArrayList <Integer> temp = new ArrayList<Integer>();
//        int n=arr.length;
//        for(int i=0; i<n; i++){
//          if(arr[i]!=0){
//              temp.add(arr[i]);
//          }
//        }
//        for(int i=0; i<temp.size(); i++){
//           arr[i] = temp.get(i);
//        }

//        for(int i=temp.size(); i<n; i++){
//           arr[i] = 0;
//        }
//     }                                              
//    public static void main(String[] args) {
//        int arr[] = {12,2,1,0,3,0,1,0,23};
//         array(arr);
//         for(int i=0; i<arr.length; i++){
//           System.out.println(arr[i]);
//         }
   //}   
   
   //**********************optimal solution **************** */
     static void array(int arr[]){
         int j = -1;
         for(int i=0; i<arr.length; i++){
           if(arr[i] == 0){
              j=i;
            break;                                     
           }
         }

         for(int i=j+1; i<arr.length; i++){
            if(arr[i]!=0){
              int temp = arr[i];
                 arr[i] = arr[j];
                 arr[j] = temp;
                 j++;
            } 
         }
 }
      public static void main(String[] args) {
          int arr[] = {1,0,2,3,4,0,4};
          array(arr);
          for()
      }
}
