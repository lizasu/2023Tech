public boolean isAnagram(String s, String t) {
        // Brute Force
        // Go over s - store characters, count into HashMap
        // Go Over t - check for character, update the count by -1
        // check the hashMap for any characters that does not have 0
        HashMap<Character, Integer> count = new HashMap<>();
        for (int i= 0; i < s.length(); i++) {
            Character ch = s.charAt(i);
            if (count.containsKey(ch)) {
                count.put(ch, count.get(ch) + 1);
            } else {
                count.put(ch, 1);
            }
        }
        for (int i =0; i < t.length(); i++) {
            Character ch = t.charAt(i);
            if (!count.containsKey(ch))
                return false;
            if (count.get(ch) <= 0)
                return false;
            count.put(ch, count.get(ch) - 1);
        }
        for (char k: count.keySet()) {
            if (count.get(k) != 0)
                return false;
        }
        return true;

        // Sort both; compare each element
        
    }
