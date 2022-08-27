class Solution {
    public int lengthOfLongestSubstring(String s) {
    
      Set<Character> unique = new HashSet<>();

        int l = 0, r = 0, bound = s.length();
        int res = 0;
        while(r<bound && l < bound){
            if(unique.add(s.charAt(r))){
                r++;
            }else{
                res = Math.max(res, unique.size());
                unique.remove(s.charAt(l++));
            }
        }

        res = Math.max(res, unique.size());

        return res;
      
    }
}