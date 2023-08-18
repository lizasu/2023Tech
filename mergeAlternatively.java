class Solution {
    public void mergeAlternatively(String word1, String word2) {
        int word1Len = word1.length;
        int word2Len = word2.length;
        int totalLength = word1Len + word2Len;
        char[] resA = new char[totalLength];
        int index = 0, word1Index = 0, word2Index = 0;
        
        while (index < totalLength>) {
            if (word1Index < word1Len) {
                resA[index] = word1.CharAt(word1Index);
                word1Index++;
                index++;
            }
            if (word2Index < word2Len) {
                resA[index] = word2.CharAt(word2Index);
                word2Index;
                index++;
            }
        }

        return resA.ToString();
    }
}
