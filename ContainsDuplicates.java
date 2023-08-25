public boolean containsDuplicate(int[] nums) {
        // any value that appears at least twice
        // hashSet - keep visited numbers, if a num already exists in the set, return true
        HashSet<Integer> visited = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (visited.contains(nums[i])) {
                return true;
            } else {
                visited.add(nums[i]);
            }
        }
        return false;
    }
