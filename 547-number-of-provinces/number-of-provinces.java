class Solution {
    public int findCircleNum(int[][] isConnected) {
        List<List<Integer>> ls = new ArrayList<>();
        for(int i=0; i<isConnected.length; i++){
            ls.add(new ArrayList<>());
        }

        for(int i=0; i<isConnected.length; i++){
            for(int j=0; j<isConnected[i].length; j++){
                if(i!=j && isConnected[i][j]==1){
                    ls.get(i).add(j);
                }
            }
        }
        int count = 0;
        boolean vis[] = new boolean[isConnected.length];
        for(int i=0; i<ls.size(); i++){
            if(!vis[i]){
                count++;
                helper(ls, vis, i);
            }
        }
        return count;

    }
    public void helper(List<List<Integer>> ls, boolean vis[], int key){
        Queue<Integer> q = new LinkedList<>();
        q.add(key);
        while(!q.isEmpty()){
            int curr = q.remove();
            if(!vis[curr]){
                vis[curr] = true;
                for(int i=0; i<ls.get(curr).size(); i++){
                    int e = ls.get(curr).get(i);
                    if(!vis[e]){
                        q.add(e);
                    }
                }
            }
        }
    }
}