public class reverse_arr2 {

    void func(int i, int[] arr) {
        int n = arr.length;

        if (i >= n / 2) {
            return;
        }
  int temp = arr[i];
        arr[i] = arr[n - i - 1];
        arr[n - i - 1] = temp;

        func(i + 1, arr);
    }

    public static void main(String[] args) {

        int[] arr = {2, 3, 4, 1, 5};

        reverse_arr2 obj = new reverse_arr2();
        obj.func(0, arr);

       
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}