class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] sol = new int[nums.length];
        int prevProd = 1;
        
        sol[0] = 1;
        for(int i = 1; i<nums.length; ++i){
            prevProd *= nums[i-1];
            sol[i] =  prevProd;   
        }
        
        prevProd = 1;
        for(int i = nums.length-2 ; i >= 0 ; --i){
            prevProd *= nums[i+1];
            sol[i] *= prevProd;
        }
        
        return sol;
        
    }
}