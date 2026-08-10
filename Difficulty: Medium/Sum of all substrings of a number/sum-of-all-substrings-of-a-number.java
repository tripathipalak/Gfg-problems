class Solution {
    public static int sumSubstrings(String s) {
        // code here
        int sum = 0;
        for(int i=0; i<s.length(); i++) {
            for(int j=i; j<s.length(); j++) {
                int result = Integer.parseInt(s.substring(i, j+1));
                sum += result;
            }
        }
        return sum;
    }
}