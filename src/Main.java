import java.util.ArrayList;
import java.util.List;

public class Main {

    static int missingNumber(int[] arr) {
        int n = arr.length + 1;

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        int missingSum = (n * (n + 1)) / 2;

        return missingSum - sum;
    }

    static List<Integer> missingMultipleNumber(int[] arr) {
        // Find the highest number
        int n = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > n) {
                n = arr[i];
            }
        }

        // Find existing numbers
        boolean[] present = new boolean[n + 1];
        for(int i = 0; i < arr.length; i++) {
            present[arr[i]] = true;
        }

        // Find the missing numbers
        List<Integer> missingNumbers = new ArrayList<>();
        for (int i = 1; i < arr.length; i++) {
            if (present[i] == false) {
                missingNumbers.add(i);
            }
        }

        return missingNumbers;
    }


    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,7,8,9};
        System.out.println(missingNumber(arr));

        int[] arr2 = {1,3,4,5,7,8,9};
        System.out.println(missingMultipleNumber(arr2));
    }
}