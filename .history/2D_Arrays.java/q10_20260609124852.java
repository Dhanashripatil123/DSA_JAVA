//rotate the matrix

public class q10 {
      private static void print(int [][] arr){
     for(int i=0; i<arr.length; i++){
        for(int ele:arr[i]){
          System.out.print(ele+" ");
        }
        System.out.println();
     }
  }                                                
    public static void main(String[] args) {
      int[][] arr = {{6,0,2,7,17},{1,3,7,2,12},{9,19,4,5,2}};
      print(arr);
        for(int i=1; i<arr.length; i++){
          for(int j = 0; j<i; j++){
              int temp = arr[i][j];
              arr[i][j] = arr[j][i];
              arr[j][i] = temp;
          }                                         
        }

      //reverse each row 
       for(int i=0; i<arr.length; i++){
    int left = 0;
    int right = arr[i].length - 1;

    while(left < right){
        int temp = arr[i][left];
        arr[i][left] = arr[i][right];
        arr[i][right] = temp;

        left++;
        right--;
    }
    print(arr);
}
       
    }                                              
}
