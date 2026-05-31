public class q3 {
//       void division(int n){
//          for(int i=1; i<=n; i++){
//              if(n%i==0){
//                System.out.println(i);
//              }
//          }
//       } 

      void division(int n){
         list<int> ls;                                         
         for(int i=1; i<=sqrt(n); i++){
             if(n%i==0){
               ls.push_back(i);
               if((n/i)!=i){
                    ls.push_back(n/i);
               }
             }
         }
         sort(ls.begin())
      }   
      public static void main(String[] args) {
           q3 obj= new q3();
            obj.division(36);
      }                                         
}
