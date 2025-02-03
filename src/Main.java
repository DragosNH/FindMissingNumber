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

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,7,8,9};
        System.out.println(missingNumber(arr));
    }
}