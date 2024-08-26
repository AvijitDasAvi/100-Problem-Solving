public class MissingNumber {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6, 8 };
        MissingNumber m = new MissingNumber();
        int result = m.missingNumber(array);
        System.out.println("The missing number is " + result);
    }

    public int missingNumber(int[] array) {
        int n = array.length + 1;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : array) {
            actualSum += num;
        }
        for (int i = 0; i < n; i++) {
            actualSum = actualSum + array[i];
        }
        return expectedSum - actualSum;
    }
}
