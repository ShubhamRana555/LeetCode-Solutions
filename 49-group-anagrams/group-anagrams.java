class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        HashMap<String, List<String>> mp = new HashMap<>();
    
        for(String str: strs){
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedString = new String(charArray);

            if(!mp.containsKey(sortedString)){
                mp.put(sortedString, new ArrayList<>());
            }
            mp.get(sortedString).add(str);
        }

        for(List<String> group: mp.values()){
            res.add(group);
        }
        return res;
    }
}