class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            Character key = s.charAt(i);
            if(map.containsKey(key)){
                map.put(key, map.get(key)+1);
            }
            else{
                map.put(key, 1);
            }
        }
        for(int i=0; i<t.length(); i++){
            Character key = t.charAt(i);
            if(!map.containsKey(key)){
                return false;
            }
            else{
                int count = map.get(key);
                if(count > 1){
                    map.put(key, count-1);
                }
                else{
                    map.remove(key);
                }
            }
        }
        return map.isEmpty();
    }
}