class Solution {
    ArrayList<Integer> findUnion(int[] a, int[] b) {
       ArrayList<Integer> ans = new ArrayList<>();
       Arrays.sort(a);
       Arrays.sort(b);
       int i=0,j=0;
       while(i<a.length && j<b.length){// Skip duplicates in 'a'
            if (i > 0 && a[i] == a[i - 1]) {
                i++;
                continue;
            }
            // Skip duplicates in 'b'
            if (j > 0 && b[j] == b[j - 1]) {
                j++;
                continue;
            }
           
           if(a[i]>b[j]){
               ans.add(b[j]);
               j++;
           } 
           else if(a[i]<b[j]){
               ans.add(a[i]);
               i++;
           }
           else if(a[i]==b[j]){
               ans.add(a[i]);
               i++;
               j++;
           }
       }
       while(i<a.length){
           if(i == 0 || a[i] != a[i - 1]) ans.add(a[i]);
           i++;
       }
       while(j<b.length){
           if (j == 0 || b[j] != b[j - 1]) ans.add(b[j]);
            j++;
       }
       return ans;
    }
}