class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        ArrayList<Integer> al1 = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>();
        int prefix = 0;
        int n = A.length;
        int ans[] = new int[n];
        for (int i = 0; i < n; i++) {
            al1.add(A[i]);
            al2.add(B[i]);
            if (A[i] == B[i])
                prefix++;
            else {
                if (al1.contains(B[i]))
                    prefix++;
                if (al2.contains(A[i]))
                    prefix++;

            }
            ans[i] = prefix;

        }
        return ans;

    }
}