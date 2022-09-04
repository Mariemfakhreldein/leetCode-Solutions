class Solution {
    public boolean isAnagram(String s, String t) {
        int [] frequency = new int[26];
        for(char c : s.toCharArray()){
            frequency[c-'a']++;
        }
        
        for(char c : t.toCharArray()){
            frequency[c-'a']--;
        }
        
        boolean isAnagram = true;
        for(int count: frequency){
            if(count != 0)
            {
                isAnagram = false;
                break;
            }
        }
        return isAnagram;
    }
}