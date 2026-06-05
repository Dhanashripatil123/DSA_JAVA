import java.util.Scanner;

public class Output {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
     // int[][] arr = new int[3][4];
      // int [][] arr = new int[3][4];
     int[][] arr= {{6,0,2,7},{1,3,7,2},{9,9,4,5}};

      // System.out.println(arr.length + " " + arr[0].length);
      // for(int i=0; i<3; i++){
      //    for(int j=0; j<4; j++){
      //      arr[i][j] = sc.nextInt();
      //    }
      //    System.out.println();
      // }   
      
      //max eement of array of 2D array
      int max = 0;
      for(int i=0; i<3; i++){
         for(int j=0; j<4; j++){
        if(arr_max>j){
         max = arr[i][j];
        }
            
         }
      } 
      System.out.println(max);

      // int sum = 0;
      // for(int i=0; i<3; i++){
      //    for(int j=0; j<4; j++){
      //      sum+=arr[i][j];
            
      //    }
    
      // } 
      // System.out.println(sum);                                           
   }                                               
}
