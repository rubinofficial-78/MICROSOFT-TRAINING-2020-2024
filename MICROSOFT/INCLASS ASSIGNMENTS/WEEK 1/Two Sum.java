class Solution {
    public int[] twoSum(int[] nums, int target) {
        int result[] = new int[2];
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        int len = nums.length;
        for(int index = 0 ; index < len ; index++){
            if(map.containsKey(target-nums[index])){
                result[1] = index;
                result[0] = map.get(target-nums[index]);
            }
            map.put(nums[index], index);
        }
        return result;
    }
}
