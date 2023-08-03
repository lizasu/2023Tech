class Solution {
    public boolean isPalindrome(String s) {
        // reads same forward and backward; case insensitive; remove non-alphanumeric characters
        // "A man, a plan, a canal: panama"
        // "race a car"

        // Brute Force - compare start and end index
        char[] chArr = s.toCharArray();
        for(int i = 0, j=chArr.length - 1; i < j;) {
            if (!Character.isLetterOrDigit(chArr[i])) { // skip if its not alpha numeric
                i++;
                continue;
            }
            if (!Character.isLetterOrDigit(chArr[j])) { // skip if its not alpha numeric
                j--;
                continue;
            }

            if (Character.toLowerCase(chArr[i]) != Character.toLowerCase(chArr[j])) return false;
            i++;
            j--;
        }
        return true;

        // More cleaner will be to have startIndex, endIndex
        // Use while Loop
        // CharAt()
        // isLetterOrDigit || toLowerCase
    }
}
