class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> startingPoints = new HashSet<>();
        Set<Integer> existence = new HashSet<>();
        int sol = 0;

        for(int num: nums){
            if(!existence.contains(num)){

                if(!existence.contains(num-1)){
                    startingPoints.add(num);
                }
                
                startingPoints.remove(num+1);
                existence.add(num);
            }
        }
        
        int len;
        
        for(int num:startingPoints){
            len = 1;
            while(existence.contains(num+1)){
                num++;
                len++;
            }
            
            sol = Math.max(len,sol);
        }
        
        return sol;
      
    }
}