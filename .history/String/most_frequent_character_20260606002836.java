import java.util.Arrays;

public class most_frequent_character {
     static char mfc(String s){
    //     int n = s.length();
    //     int maxfreq = -1;
    //     char ans = s.charAt(0); 
    //     for(int i=0; i<n; i++){
    //          int freq = 1;
    //          char ch = s.charAt(i);                                    
    //        for(int j=i+1; j<n; j++){
    //            if(s.charAt(j)==ch) freq++;
    //        }
    //        if(freq>maxfreq){
    //             maxfreq = freq;
    //             ans = ch;                                    
    //        }else if(freq==maxfreq && ch<ans){
    //           ans=ch;
    //        }
    //     }
    //     return ans;

    //  int n = s.length();
    //  int maxfreq = -1;
    //  char ans = s.charAt(0);
    //  char[] arr = s.toCharArray();
    //  Arrays.sort(arr);

    //  int i=0; int j=0;
    //  while(j<n){
    //     if(arr[i]==arr[j]){
    //        j++;
    //     }else{
    //        int freq = j-i;
    //        if(freq>maxfreq){
    //            maxfreq = freq;
    //            ans = arr[i];
    //        }
    //        i=j;
    //     }
    //  }
    //  int freq = j-i;
    //        if(freq>maxfreq){
    //            maxfreq = freq;
    //            ans = arr[i];
    //        }
    //        return ans;
     
    int n = s.length();
    int[] freq = new int[26];
    for(int i=0; i<n; i++){
       char ch = s.charAt(i);
       int idx = ch-97;
       freq[idx]++;
    }
    int maxfreq = 0;
    char ans = s.charAt(0);
    for(int i=0; i<26; i++){
       if(freq[i]>maxfreq){
         maxfreq = freq  
       }
    }
    



     }                                             
    public static void main(String[] args) {
      String s = "character";
    System.out.println(mfc(s));


    }                                              
}
