public class intersection_array {
   static void intersection(int a[],int b[]){
       int visited[] = {0,0,0,0,0,0};
       int arr[];
       for(int i=0; i<a.length; i++){
          for(int j=0; j<b.length; i++){
             if(a[i]==b[j] && visited[j]==0){
                arr.add[a[i]];
                visited[j] = 1;
                bre
             }
          }
       }
   }                                               
   public static void main(String[] args) {
        int a[] = {1,2,2,3,3,4,5,6};                                          
        int b[] = {2,3,3,5,6,6,7};                                          
   }                                               
}
