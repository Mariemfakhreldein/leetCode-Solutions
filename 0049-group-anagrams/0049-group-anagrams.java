class Solution {
    public List<List<String>> groupAnagrams(String[] strings) {
         Map<String, List<String>> sol = new HashMap<>();

        for(String str:strings){
            List<Character> stringToList = str
                    .chars()
                    .mapToObj(e -> (char)e)
                    .sorted()
                    .collect(Collectors.toList());;

            String key = stringToList.stream().map(String::valueOf).collect(Collectors.joining());

            if(!sol.containsKey(key)){
                sol.put(key,new ArrayList<>());
            }
            sol.get(key).add(str);
        }
        
        
        return new ArrayList<>(sol.values());

    }
}