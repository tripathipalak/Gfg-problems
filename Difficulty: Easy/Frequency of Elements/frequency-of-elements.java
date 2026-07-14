class Solution {
    public ArrayList<ArrayList<Integer>> countFreq(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        // Add only first occurrence order
        for (int num : arr) {
            if (map.containsKey(num)) {
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(num);
                temp.add(map.get(num));
                ans.add(temp);

                map.remove(num); // Prevent duplicates
            }
        }

        return ans;
    }
}