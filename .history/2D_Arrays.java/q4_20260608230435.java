//print matrix in snake pattern

public class q4 {
   public static void main(String[] args) {
       int[][] arr = {{6,0,2,7,17},{1,3,7,2,12},{9,19,4,5,2}};                                            
      for(int i=0; i<arr.length; i++){
        for(int ele: arr[i]){
          if(i%2!=0){
            System.out.println(ele); 
          }
          System.out.println(ele+" ");
        }
      
      }                                            
   }                                               
}
