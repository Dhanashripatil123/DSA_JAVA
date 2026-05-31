public class sort{  

public static void mergesort(int arr[],int si,int ei){
       if
      //kaam
      int mid = si + (ei-si)/2;
      mergesort(arr, si, mid);
      mergesort(arr, mid+1, ei);
      merge(arr,si,mid,ei);
}

public static void merge(int arr[],int si,int mid, int ei) {
       
}
public static void main(String args[]){
       int arr[]={6,8,2,4,5};
       mergesort(arr, 0, arr.length-1);
}
}