public class q2 {
  public static void main(String[] args) {
      int[][] arr= {{6,0,2,7,17},{1,3,7,2,12},{9,19,4,5,2}};
      
     
      for(int i=0; i<arr.length; i++){
                int max = arr[0][0];                                      
           for(int j=0; j<arr[0].length; j++){
               if(max<arr[i][j]){
                    max = arr[i][j];
                } 
           }
           if(max){

           }
           System.out.println(max);

      }
  }                                                
}
