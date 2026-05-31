public class bubblesort {
   public static void bubble_sort(int arr[]) {
       int n = arr.length;

        for(int i = n-1; i >= 1; i--){ 
             for(int j = i + 1; j < i; j++) {
                if(arr[j] < arr[i]) {
                     j++;
                }else{
                     int temp = arr[j];
                   arr[j] = arr[i];
                   arr[i] = temp; 
                }
            }
            for (int num : arr) {
                                                              System.out.print(num + " ");
            }
           
        }

                                                
   }                                                
   public static void main(String[] args) {
          int arr[] = {5,34,12,8,67,9,1,60,1,6,0};
          bubble_sort(arr);                                           
   }                                               
}
