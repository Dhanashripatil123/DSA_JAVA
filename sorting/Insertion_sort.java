public class Insertion_sort {
    public static void Insertionsort(int arr[]) {
        int n=arr.length;                                           
        for(int i=0; i<=n-1; i++){
             int j=i;                                     
            while(j>0 && arr[j-1]>arr[j]){
              int temp = arr[j-1];
              arr[j-1]=arr[j]; 
              arr[j]=temp;  
              j--;
            }
        }  
        for(int ele:arr){
           System.out.println(ele);
        }                                        
    }                                              
   public static void main(String[] args) {
      int arr[] = {12,23,2,33,1,3,24,9};
       Insertionsort(arr);
   }                                               
}
