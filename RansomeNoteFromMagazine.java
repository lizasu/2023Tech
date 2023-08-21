public boolean canConstruct(String ransomNote, String magazine) {
        // create HashMap of all letters in magazine with count
        // for each character in ransomNote, reduce count from the hashmap if exists, otherwise return false
        HashMap<Character, Integer> dict = new HashMap<Character, Integer>();
        for (char ch: magazine.toCharArray()) {
            int count = 0;
            if (dict.containsKey(ch)) {
                count = dict.get(ch);
            }
            dict.put(ch, count + 1);
        }

        for (char ch: ransomNote.toCharArray()) {
            if (dict.containsKey(ch)) {
                int count = dict.get(ch);
                if (count <= 0) {
                    return false;
                }
                dict.put(ch, count - 1);
            } else {
                return false;
            }
        }

        return true;
    }
