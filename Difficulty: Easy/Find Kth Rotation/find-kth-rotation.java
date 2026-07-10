class Solution {
    public int findKRotation(int arr[]) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            // Array already sorted
            if (arr[low] <= arr[high])
                return low;

            int mid = low + (high - low) / 2;

            // Left half is sorted
            if (arr[low] <= arr[mid]) {
                low = mid + 1;
            }
            // Right half is sorted
            else {
                high = mid;
            }
        }

        return 0;
    }
}