class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numberIndex = new HashMap<>();
        int []ans = new int[2];
        
        for(int i = 0 ; i< nums.length ; ++i){
            int difference = target-nums[i];
            if(numberIndex.containsKey(difference)){
                ans[0] = i;
                ans[1] = numberIndex.get(difference);
                break;
            }else{
                numberIndex.put(nums[i], i);
            }
        }
        return ans;
    }
}