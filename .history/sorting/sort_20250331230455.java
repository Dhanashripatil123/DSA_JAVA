public class sort{  

public static void mergesort(int arr[],int si,int ei){
      //kaam
      int mid = si + (ei-si)/2;
      mergesort(arr, si, mi);
}

public static void main(String args[]){
       int arr[]={6,8,2,4,5};
       mergesort(arr, 0, arr.length-1);
}
}