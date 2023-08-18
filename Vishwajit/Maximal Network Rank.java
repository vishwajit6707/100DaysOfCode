// leetcode link - https://leetcode.com/problems/maximal-network-rank/
// data structure used - graph.

// approah - 1. create hashtable to store all the nodes connected to single node.
//           2. using nested loop calculate all the possible maximum vaules for each pairs.
//           3. if the nodes are connected consider the common edge as one.
//           4. return the max value.

class Solution {
    public int maximalNetworkRank(int n, int[][] roads) {
        HashMap<Integer,Set<Integer>> map = new HashMap<>();
        for(int i = 0; i<n ; i++){
            map.put(i,new HashSet<>());
        }
        for(int i = 0; i<roads.length; i++){
            map.get(roads[i][1]).add(roads[i][0]);
            map.get(roads[i][0]).add(roads[i][1]);
        }
        int max = -1;
        for(int i = 0; i<n ; i++){
            for(int j = i+1; j<n; j++){
                int conn = 0;
                if(map.get(i).contains(j)) conn = 1;
                max = Math.max(map.get(i).size() + map.get(j).size() - conn, max);
            }
        }
        return max;
    }
}
