public class q3 {
    static void spiral_travel(int[][] arr){
       int first_row = 0;
       int last_row = arr.length-1;
       int first_col = 0;
       int last_col = arr[0].length-1;
       
       while(first_row <= last_row && first_col<=last_col){
          for(int j=first_col; j<=last_col; j++){
               System.out.println(arr[first_row][j]);  
               
          }
          first_row++;

          for(int i=first_row; i<=last_row; i++){
               System.out.println(arr[i][last_col]);  
               last_col--;
          }
          for(int j=last_col; j>=first_col; j--){
               System.out.println(arr[last_row][j]);  
               
          }
          last_row--;
          
          for(int i=last_row; i>=first_row; i--){
               System.out.println(arr[i][first_col]);  
               first_col++;
          }
       }

    }                                              
   public static void main(String[] args) {
          int[][] arr= {{6,0,2,7,17},{1,3,7,2,12},{9,19,4,5,2}};
           spiral_travel(arr);                                     
   }                                               
}
