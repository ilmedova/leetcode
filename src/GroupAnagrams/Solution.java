package GroupAnagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> s = new HashMap<>();
        Arrays.stream(strs).forEach(str -> s.put(Arrays.stream(str.split("")).sorted().reduce((s1, s2) -> s1+s2).toString(), new ArrayList<>()));
        Arrays.stream(strs).forEach(str -> {
            if(s.containsKey(Arrays.stream(str.split("")).sorted().reduce((s1, s2) -> s1+s2).toString())){
                List<String> value = s.get(Arrays.stream(str.split("")).sorted().reduce((s1, s2) -> s1+s2).toString());
                value.add(new String(str));
                s.put(Arrays.stream(str.split("")).sorted().reduce((s1, s2) -> s1+s2).toString(), value);
            }
        });
        List<List<String>> r = new ArrayList<>();
        s.keySet().forEach(k -> {
            r.add(s.get(k));
        });
        return r;
    }
}
