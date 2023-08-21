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
