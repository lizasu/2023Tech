public static boolean findSumOfThree(int[] nums, int target) {
      
      // Replace this placeholder return statement with your code
      Arrays.sort(nums);
      for (int i  = 0; i < nums.length; i++) {
         int target_num = target - nums[i];
         int left = i + 1, right = nums.length - 1;
         while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target_num) {
               return true;
            }
            if (sum > target_num) {
               right --;
            } else {
               left++;
            }
         }
      }
      return false;
   }


public List<List<Integer>> threeSum(int[] nums) {
        // return all triplets such that they add up to 0
        // brute force : for every i, look at every j > i, look at every k > j
        // Sort the numbers, look for target on the right using two pointers
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if(i > 0 && nums[i] == nums[i-1]) continue; 
            int left = i + 1;
            int right = nums.length - 1;
            while(left < right) {
                int sum = nums[left] + nums[right] + nums[i];
                if (sum == 0) {
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    right--;
                    left++;
                }
                else if (sum > 0) {
                    right --;
                } else {
                    left ++;
                }
            }
        }
        return new ArrayList<>(res);
    }
