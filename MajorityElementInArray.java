public int majorityElement(int[] nums) {
        // Input: nums Array
        // Output: return the majority element , that appears more than n/2 times
        // Always exists; more than 1 => max
        // Solution: Linear scan >> HashMap num, count
        // Sort , and then binary search
        // HashMap<Integer, Integer> count = new HashMap<>();
        // int len = nums.length / 2;
        // int maxCount = -1, maxNum = nums[0];
        // for(int i: nums) {
        //     if (count.containsKey(i)) {
        //         int num_c = count.get(i) + 1;
        //         if (num_c >= len && num_c >= maxCount) {
        //             maxCount = num_c;
        //             maxNum = i;
        //         }
        //         count.put(i, num_c);
        //     } else {
        //         count.put(i, 1);
        //     }
        // }
        // return maxNum;
        Arrays.sort(nums);
        int mid = nums.length / 2;
        return nums[mid];
    }
