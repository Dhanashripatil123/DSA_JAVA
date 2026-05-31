public class remove_duplicate {
    static int remove(int arr[]){
      int i=0;
      for(int j=1; j<arr.length; j++){
           if(arr[j]!=arr[i]){
               arr[i+1]=arr[j];
               i++;
           }
      }
      return (i+1);
}                                              
   public static void main(String[] args) {
     int arr[] = {2,3,3,1,6};   
    remove(arr);
     for(int arr:i){
       System.out.println(i);
      }
   }                                               
}
