public class Solution {
    public bool IsValid(string s) {
        Dictionary<char, char> dict = new Dictionary<char, char>()
        {
            {'(', ')'},
            {'{', '}'},
            {'[', ']'}
        };
        bool result = false;
        bool history_not_found = false;
        List<char> history = new List<char>();
        if(s.Length%2 == 0){
            for(var i=0; i < s.Length; i++){
                if(dict.ContainsKey(s[i])){
                    if(dict[s[i]] == s[i+1] && i+1 != s.Length){
                        result = true;
                        i++;
                    }
                    else{
                        history.Add(s[i]);
                        result = false;
                    }
                }
                else{
                    if(dict.ContainsValue(s[i]) && history.Count > 0){
                        var key = dict.FirstOrDefault(x => x.Value == s[i]).Key;
                        if(dict.ContainsKey(key)){
                            if(history.Any()){  
                                if(dict[history.Last()] == s[i]){  
                                    result = true;
                                    history.RemoveAt(history.Count-1);
                                }
                                else{
                                    history_not_found = true;
                                    result = false;
                                }
                            }
                            else{
                                result = false;
                            }
                        }
                    }
                    else{
                        result = false;
                        break;
                    }
                }
            }
        }
        if(history.Count > 1 || history_not_found){
            result = false;
        }
        return result;
    }
}