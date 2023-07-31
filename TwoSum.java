public int[] twoSum(int[] nums, int target) {
        // O(n^2) - Brute Force - for every element, loop over next elements to see if target is met
        // for (int i = 0; i < nums.length; i++) {
        //     for (int j = i+1; j < nums.length; j++) {
        //         if (nums[i] + nums[j] == target) {
        //             return new int[] {i, j};
        //         }
        //     }
        // }

        // O(n) Using HashSet
        HashMap targets = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (targets.containsKey(nums[i])) {
                return new int[] {i, (int) targets.get(nums[i])};
            }
            else {
                targets.put(target - nums[i], i);
            }
        }

        return null;
    }
