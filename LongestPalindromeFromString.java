    public int longestPalindrome(String s) {
        // Longest Palindrome that can be built using letters from s
        // find number of characters that are present even number of times
        // case sensitive
        int[] allChars = new int[128];
        for (char ch: s.toCharArray()) {
            allChars[ch] ++;
        }
        int res = 0;
        for (int i = 0; i < 128; i++) {
            res += 2 * (allChars[i]/2);
        }
        return res < s.length() ? res + 1 : res;
    }
