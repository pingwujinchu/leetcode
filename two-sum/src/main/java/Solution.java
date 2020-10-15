class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map keyMap = new HashMap();
        for(int i = 0 ; i < nums.length ; i ++){
            if (keyMap.containsKey(target - nums[i])){
                return new int[]{keyMap.get(target - nums[i]), i};
            }
            keyMap.put(target - nums[i], i)
        }
        return null;
    }
}