class Solution {
    static class elements implements Comparable<elements>{
        int value,freq;
        public elements(int a, int b){
            this.value = a;
            this.freq = b;
        }

        public int compareTo(elements e1){
            // descending order
            return e1.freq - this.freq;
        }
    }
    
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;

        PriorityQueue<elements> q = new PriorityQueue<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i<n; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        Set<Integer>keys = map.keySet();
        int result[] = new int[k];
        for(int i:keys){
            q.add(new elements(i,map.get(i)));
        }

        for(int i=0;i<k;i++){
            result[i] = q.peek().value;
            q.remove(); 
        }

        return result;


    }
}