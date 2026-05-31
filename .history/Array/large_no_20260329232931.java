

public class large_no {
    public static void main(String[] args) {
        int arr[] = {3,4,2,5,1,0};                                          
        int larger = arr[0];
        for(int i=0; i<arr.length-1; i++){
             arr[i]=larger;
        }  
        for(int e = arr){
            System.out.println(e);
        }
                                               
    }                                               
}
