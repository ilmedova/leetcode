package FindPlayersWithZeroOrOneLosses;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        HashMap<Integer, Integer> h = new HashMap<>();
        for(int i = 0; i < matches.length; i++){
            if(h.get(matches[i][0]) == null){
                h.put(matches[i][0], 0);
            }
            if(h.get(matches[i][1]) == null){
                h.put(matches[i][1], 1);
            }
            else{
                h.put(matches[i][1], h.get(matches[i][1])+1);
            }
        }
        List<List<Integer>> r = new ArrayList<>();
        r.add(h.entrySet().stream().filter(e -> e.getValue() == 0).map(e -> e.getKey()).sorted().collect(Collectors.toList()));
        r.add(h.entrySet().stream().filter(e -> e.getValue() == 1).map(e -> e.getKey()).sorted().collect(Collectors.toList()));
        return r;
    }
}
