class Solution {
    // method to remove dups from a sorted array in-place, and return the length of the resulting array.
    public int removeDuplicates(int[] nums) {
        int index = 1;
        for(int i = 0; i< nums.length-1; i++)
        {
            if (nums[i] != nums[i+1])
            {
                nums[index++] = nums[i+1];
            }
        }
        return index;
    }
}
