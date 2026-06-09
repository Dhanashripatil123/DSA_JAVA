public class q2 {
  public static void main(String[] args) {
      int[][] arr= {{6,0,2,7,7},{1,3,7,2,2},{9,9,4,5,2}};
      
     
      for(int i=0; i<arr.length; i++){
                                               
           for(int j=0; j<arr[0].length; j++){
                 int max = arr[i][j];                                   
                if(max>arr[i][j]){
                    System.out.println(max);
                } 
           }

      }
  }                                                
}
