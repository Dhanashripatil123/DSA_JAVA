public class quick {
        static sort(arr,low,high){
            int pivot = arr[low];
            i = low;
            j = high;
            while(i<j){
                while(arr[i] <= arr[pivot] && i<=high){
                    i++;
                }
                while(arr[i]>arr[pivot] && j>= low){
                   j--;
                }
                if(i<j){
                    int temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;
                }else{
                       int temp = arr[low];
                        arr[j] = arr[low];
                       arr[low] = temp;
                }
            }
        }
       static quickSort(int arr[],int low,int high){
        if(low<high){
             int partiotion=sort(arr,low,high);
             quickSort(arr,low,partiotion-1);
             quickSort(arr,partiotion+1,high);
         }
       }
      public static void main(String[] args) {
              int arr[] = {6,3,9,8,2,5};
              quickSort(arr,0,arr.length-1); 
              printArr(arr);                                   
      }                                            
}
