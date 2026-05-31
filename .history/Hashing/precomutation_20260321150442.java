

public class precomutation {
     public static void main(String[] args) {
        int n;
        System.out.println(n);
        int arr[n];         
        for(int i=0; i<n; i++){
           System.out.println(arr[i]);
        }
        
        //precompute
        int hash[13] = {0};
        for(int i=0; i<n; i++){
           hash[arr[i]]+=1;
        }
        
        int q;
        System.out.println(q);
        while(q--){
           int number;
           System.out.println(number);

           hash[number];
        }
        return 0;
     }                                             
}
