public int search(int[] nums, int target) {
        // Given sorted array
        // binary search
        return binary_search(nums, 0, nums.length - 1, target);
    }

    public int binary_search(int[] nums, int start, int end, int target) {
        if (end - start <= 1) {
            if (nums[start] == target) {
                return start;
            }
            if (nums[end] == target) {
                return end;
            }
            return -1;
        }
        int mid = (start + end) / 2;
        if (nums[mid] == target) {
            return mid;
        }
        else {
            if (nums[mid] > target) {
                return binary_search(nums, start, mid - 1, target);
            } else {
                return binary_search(nums, mid + 1, end, target);
            }
        }
    }
