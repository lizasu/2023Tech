public boolean isValid(String s) {
        // Given String S with characters (,),{,},[,]
        // Determine if its valid - open/close brackets.
        // Solution - Start storing into Stack for open brackets
        // When you encounter a close bracket, match it with last open, if it does not match, return false
        // If it matches, remove the bracket and continue
        // ex - nested {[()]} / separate [] {} ()
        char[] brackets = s.toCharArray();
        Stack<Character> openBrackets = new Stack<>();
        for (int i = 0; i < brackets.length; i++) {
            if (brackets[i] == '(' || brackets[i] == '[' || brackets[i] == '{') {
                openBrackets.push(brackets[i]);
            } else {
                if (!openBrackets.empty()) {
                    char lastOpen = openBrackets.pop();
                    if (lastOpen == '(' && brackets[i] == ')') continue;
                    if (lastOpen == '{' && brackets[i] == '}') continue;
                    if (lastOpen == '[' && brackets[i] == ']') continue;
                }   
                return false;
            }
        }

        return openBrackets.empty();
    }
