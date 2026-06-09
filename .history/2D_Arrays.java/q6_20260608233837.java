//print matrix in snake pattern (columns)
public class q6 {
  public static void main(String[] args) {
      int[][] arr = {{6,0,2,7,17},{1,3,7,2,12},{9,19,4,5,2}};                                                         
      for(int j=0; j<arr[0].length; j++){
        if(j%2==0){
         for(int i=0; i<arr.length; i++){
            System.out.print(arr[i][j]);
         }
        }
        else{
          for(int i=arr.length-1; i; i++){
            System.out.print(arr[i][j]);
         }                                        
        }                                        
    }                                              
  }                                                
}
