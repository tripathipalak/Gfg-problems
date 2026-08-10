class Solution {
    public static int countDigits(int n) {
        // Code here
        String s = Integer.toString(n);
        int count = 0;
        for(int i=0; i<s.length(); i++){
            count = count + 1;
        }
        return (int) count;
    }
}
