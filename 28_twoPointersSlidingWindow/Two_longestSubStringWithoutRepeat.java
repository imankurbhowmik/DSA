public class Two_longestSubStringWithoutRepeat {
    public static void main(String[] args) {

    }

    public static int lengthOfLongestSubstring(String s) {
        int[] hash = new int[256];
        for(int i=0; i<256; i++) {
            hash[i] = -1;
        }
        int l=0;
        int r=0;
        int n = s.length();
        int maxLength = 0;
        while(r<n) {
            if(hash[s.charAt(r)] != -1) {
                if(hash[s.charAt(r)] >= l) {
                    l = hash[s.charAt(r)] + 1;
                }
            }
            int length = r-l+1;
            maxLength = Math.max(length, maxLength);
            hash[s.charAt(r)] = r;
            r++;
        }
        return maxLength;
    }
}