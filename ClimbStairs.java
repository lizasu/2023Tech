public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        // ith step = number of ways to reach T(i - 1) + number of ways to reach T(i - 2)
        Integer[] T = new Integer[n];
        T[0] = 1;
        T[1] = 2;
        for(int i = 2; i < n; i++) {
            T[i] = T[i - 1] + T[i - 2];
        }
        return T[n - 1];
}
