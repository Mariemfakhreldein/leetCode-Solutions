class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> noDuplicate = new HashSet<>();
        boolean containsDuplicate = false;
        for(int num : nums){
            if(!noDuplicate.add(num)){
                containsDuplicate = true;
                break;
            }
        }
        return containsDuplicate;
        
    }
}