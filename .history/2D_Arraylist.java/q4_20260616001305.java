import java.util.ArrayList;

public class q4 {
  public ArrayList<ArrayList<Integer>> multiply(int[][] a, int[][] b){
     int n=a.length;
     int[][] c = new int[n][n];
     for(int i=0; i<n; i++){
      for(int j=0; j<n; j++){
        for(int k = 0; k < n; k++){
           c[i][j] += (a[i][k]*b[k][j]);    
        }
      }
     }
     ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
     for(int i=0; i<n; i++){
        ans.add(new ArrayList<Integer>());
     }
  }
  public static void main(String[] args) {
                                                  
  }                                                
}
