class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int val = nums[nums.length / 2];
int count = 0;

for (int num : nums) {
    if (num == val) {
        count++;
    }
}

return count == 1;
    }
}