

import java.util.Scanner;

public class precomutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input size
        int n = sc.nextInt();

        int[] arr = new int[n];

        // input array
        for(int i = 0; i < n; i++){
            System.out.print("give the your value");                                      
            arr[i] = sc.nextInt();
        }

        // precompute (hash array)
        int[] hash = new int[4];

        for(int i = 0; i < n; i++){
            hash[arr[i]]++;
        }

        // queries
        int q = sc.nextInt();

        while(q > 0){
            int number = sc.nextInt();

            System.out.println(hash[number]); // frequency

            q--;
        }
    }
}