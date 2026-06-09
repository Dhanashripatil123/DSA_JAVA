public class q1 {
     public static void main(String[] args) {
         int[][] arr= {{6,0,2,7},{1,3,7,2},{9,9,4,5}};
                                                   
          int max = 0;
          int sum = 0;
      for(int i=0; i<arr.length; i++){
         for(int j=0; j<arr[0].length; j++){
            sum += arr[i][0];
            if(sum>max){
               
            }
         }
      } 
      System.out.println(max);                                           
     }                                             
}
