public class q3 {
    static void spiral_travel(int[][] arr){
       int first_row = arr[0][4];
       int last_row = arr[4][0];
       int first_col = arr[0][4];
       int last_col = arr[0][4];
       
       while(first_row<=last_row && first_col<=last_col){
          if(int j=first_row; j<=last_col; j++){
               System.out.println(arr[first_row][j]);  
               first_row++;
          }
          if(int i=last_col; i<=last_row; i++){
               System.out.println(arr[i][last_col]);  
               last_col--;
          }
          if(int j=last_row; j<=first_col; j--){
               System.out.println(arr[last_row][j]);  
               last_row--;
          }
          if(int i=first_col; j<=first_row; j--){
               System.out.println(arr[first_row][j]);  
               first_col++;
          }
       }

    }                                              
   public static void main(String[] args) {
          int[][] arr= {{6,0,2,7,17},{1,3,7,2,12},{9,19,4,5,2}};
           spiral_travel(arr);                                     
   }                                               
}
