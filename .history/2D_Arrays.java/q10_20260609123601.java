//rotate the matrix

public class q10 {
    public static void main(String[] args) {
      int[][] arr = {{6,0,2,7,17},{1,3,7,2,12},{9,19,4,5,2}};
        for(int i=1; i<arr.length; i++){
          for(int j = 0; j<i; j++){
              int temp = arr[i][j];
              arr[i][j] = arr[j][i];
              arr[j][i] = temp;
          }                                         
        }


        //reverse each row 
        for(int i=0; i<arr.length; i++){
         for(int j = arr[0].length-1; j>0; i--){
           System.out.println();
         }                                        
        }
       
    }                                              
}
