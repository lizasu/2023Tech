public String addBinary(String a, String b) {
        // Given two binary strings, Return their sum
        // a = 11, b = 01 ; Bit wise adition rules: 1 + 1 = 10, 0 + 1 = 1, 1 + 0 = 1, 0 + 0 = 0
        StringBuilder sum = new StringBuilder("");
        int indexA = a.length() - 1;
        int indexB = b.length() - 1;
        int carry = 0;
        int digitSum = 0;
        while(indexA >= 0 || indexB >=0 || carry > 0) {
            digitSum = carry;
            if (indexA >= 0) digitSum += a.charAt(indexA--)-'0';
            if (indexB >= 0) digitSum += b.charAt(indexB--)-'0';
            if(digitSum > 1) carry = 1;
            else carry = 0;
            sum.insert(0, digitSum%2);
        }
        return sum.toString();
    }
