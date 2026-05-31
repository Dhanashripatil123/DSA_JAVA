

public class selection_sort {
     public static void sorting(int arr[]) {
       int n= arr.length+1;                                          
        for(int i=0; i<=n-2; i++){
              int min = i;                                     
            for(int j=i; j<n-1; j++){
                if(arr[j]<arr[min]){
                  min = j;
                  int temp = arr[min];
                  arr[min] = arr[i];
                  arr[i] = temp;
                }
                
            }
        }
          
        for(int num : arr) {
            System.out.print(num + " ");
        }                                           
   }  
                                           
   public static void main(String[] args) {
       int arr[] = {5,34,12,8,67,9,1,60,};
       sorting(arr);                                           
   }                                               
}

