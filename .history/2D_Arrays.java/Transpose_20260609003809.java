//Transpose the array

public class Transpose{
  private static void print(int [][] arr){
     for(int i=0; i<=arr.length; i++){
        for(int ele:arr[i]){
          System.out.print(ele);
        }
        System.out.println();
     }
  }
  public static void main(String[] args) {
    int[][] arr = { { 6, 0, 2, 7, 9 }, { 1, 3, 7, 2, 5 }, { 9, 1, 4, 5, 2 } };
   print(arr);
   //transponse
   for(int i=0; i<arr.length; i++){
      for(int j = 0; j < arr[0].length; j++){
         int temp = arr[i][j];
         arr
      }
   }
  }                                                
}