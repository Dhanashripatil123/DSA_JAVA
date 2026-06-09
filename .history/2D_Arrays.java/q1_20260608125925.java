public class q1 {
     public static void main(String[] args) {
         int[][] arr= {{6,0,2,7,7},{1,3,7,2,2},{9,9,4,5,2}};
                                                   
          int max = 0;
         int row = -1;
      for(int i=0; i<arr.length; i++){
             int sum = 0;                                       
         for(int j=0; j<arr[0].length; j++){
            sum += arr[i][j];
           
         }
         if (sum > max) {
             max = sum;  
             row = i;                                            
         }
         
      } 
      System.out.println(max);
      
                                      
     }                                             
}
