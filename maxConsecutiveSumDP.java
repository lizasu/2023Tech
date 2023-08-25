public int maxSubArray(int[] nums) {
        // largest sum; -/+ , subarry => substring
        // max = Integer.MIN_VALUE
        // T[i] = T[i-1] + nums[i] , if nums[i] + T[i-1] > max
        int maxSum = Integer.MIN_VALUE;
        int[] max = new int[nums.length];
        if (nums.length > 0)  {
            max[0] = nums[0];
            maxSum = max[0];
        }
        else return maxSum;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] + max[i-1] > nums[i]) {
                max[i] = nums[i] + max[i-1];
            } else {
                max[i] = nums[i];
            }
            if(maxSum < max[i]) maxSum = max[i];
        }
        return maxSum;
    }
