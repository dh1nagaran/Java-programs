class Solution {
    public int[] findEvenNumbers(int[] digits) {
        int freq[]=new int[10];
        for(int i=0;i<digits.length;i++)
            freq[digits[i]]+=1;

           List<Integer> result = new ArrayList<>();
        // Loop through all 3-digit even numbers
        for (int num = 100; num < 1000; num += 2) {
            int a = num / 100;           // Hundreds place
            int b = (num / 10) % 10;     // Tens place
            int c = num % 10;            // Units place (even digit)

            // Temporarily decrease the frequency of each digit
            freq[a]--;
            freq[b]--;
            freq[c]--;

            // If all digits are still >= 0, then we can form this number
            if (freq[a] >= 0 && freq[b] >= 0 && freq[c] >= 0) {
                result.add(num);
            }

            // Restore the original frequencies
            freq[a]++;
            freq[b]++;
            freq[c]++;
        }
        int res[]=new int[result.size()];
        for(int i=0;i<res.length;i++)
            res[i]=result.get(i);
        return res;
        
    }
}