//print elements of 2D array column-wise

public class q3 {
  public static void main(String[] args) {
     int[][] arr= {{6,0,2,7,17},{1,3,7,2,12},{9,19,4,5,2}};
     
     for(int j=0; j<arr[0].length; j++){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
     }
  }                                                 
}
