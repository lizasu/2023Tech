public int evalRPN(String[] tokens) {
        // Input: tokens = ["2","1","+","3","*"]
        // Output: 9
        // Explanation: ((2 + 1) * 3) = 9

        // Input: tokens = ["4","13","5","/","+"]
        // Output: 6
        // Explanation: (4 + (13 / 5)) = 6

        // Input: tokens = ["10","6","9","3","+","-11","*","/","*","17","+","5","+"]
        // Output: 22
        // Explanation: ((10 * (6 / ((9 + 3) * -11))) + 17) + 5
        // = ((10 * (6 / (12 * -11))) + 17) + 5
        // = ((10 * (6 / -132)) + 17) + 5
        // = ((10 * 0) + 17) + 5
        // = (0 + 17) + 5
        // = 17 + 5
        // = 22

        Stack<Integer> tokensStack = new Stack<>();
        for (String s: tokens) {
            if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
                int right = tokensStack.pop();
                int left = tokensStack.pop();
                int res = 0;
                if (s.equals("+")) {
                    res = left + right;
                }
                if (s.equals("-")) {
                    res = left - right;
                }
                if (s.equals("*")) {
                    res = left * right;
                }
                if (s.equals("/")) {
                    res = left / right;
                }
                tokensStack.push(res);
            } else {
                tokensStack.push(Integer. valueOf(s));
            }
        }
        return tokensStack.pop();
    }
