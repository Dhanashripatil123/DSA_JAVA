public class bubblesort {
   public static void bubble_sort(int arr[]) {
       int n = arr.length;

        for(int i = 0; i < n - 1; i++) {
            int min = i;

            for(int j = i + 1; j < n; j++) {
                if(arr[j] < arr[min]) {
                    min = j;
                }
            }

          
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }

        for(int num : arr) {
            System.out.print(num + " ");
        }                                             
   }                                                
   public static void main(String[] args) {
                                                  
   }                                               
}
