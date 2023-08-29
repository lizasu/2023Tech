// Two pointer - sliding window
public int lengthOfLongestSubstring(String s) {
        if (s.length()==0) return 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max=0;
        for (int i=0, j=0; i<s.length(); ++i){
            if (map.containsKey(s.charAt(i))){
                j = Math.max(j,map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i),i);
            max = Math.max(max,i-j+1);
        }
        return max;
    }

// longest substring without repeating characters
    // abcabcbb -- for every character, check if it repeats starting from current going left
    // store last seen index for each character
    // maintain the longest substring including ith character
    // T[i] = T[i-1] + 1 if lastSeen.get(s.charAt(i)) < StartingIndex[i-1]
    // abcabcbb || pwwkew
    // current index: 0 1 2 3 4
    // T: 1, 2, 3, 1, ....
    // lastSeen: a:1, b:1, c:0
    // SubstringStartingIndex: 0, 0, 0, 1, 
    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        int[] longestSubstringLength = new int[len];
        int[] substringStartingIndex = new int[len];
        HashMap<Character, Integer> lastSeen = new HashMap<>();
        if (len <= 1) return len;

        longestSubstringLength[0] = 1;
        substringStartingIndex[0] = 0;
        lastSeen.put(s.charAt(0), 0);
        int maxLength = 0;

        for(int i=1; i <len; i++) {
            Character ch = s.charAt(i);
            if (lastSeen.containsKey(ch)) {
                int last = lastSeen.get(ch);
                if (last < substringStartingIndex[i-1]) {
                    longestSubstringLength[i] = longestSubstringLength[i - 1] + 1;
                    substringStartingIndex[i] = substringStartingIndex[i - 1];
                } else {
                    longestSubstringLength[i] = i - last;
                    substringStartingIndex[i] = last + 1;
                }
            }
            else {
                longestSubstringLength[i] = longestSubstringLength[i - 1] + 1;
                substringStartingIndex[i] = substringStartingIndex[i - 1];
            }
            lastSeen.put(ch, i);
            if (maxLength < longestSubstringLength[i]) {
                maxLength = longestSubstringLength[i];
            }
        }
        return maxLength;
    }
