class Solution {
    public static int findMean(int[] arr) {

        int sum = 0;

        for (int num : arr) {
            sum += num;
        }

        return sum / arr.length;
    }
}