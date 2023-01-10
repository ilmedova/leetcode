public class Solution {
    public int RomanToInt(string s) {
        IDictionary<char, int> numberNames = new Dictionary<char, int>();
        numberNames.Add('I', 1);
        numberNames.Add('V', 5);
        numberNames.Add('X', 10);
        numberNames.Add('L', 50);
        numberNames.Add('C', 100);
        numberNames.Add('D', 500);
        numberNames.Add('M', 1000);

        int sum = 0;
        for(var i = 0; i < s.Count(); i++){
            if(i != s.Count()-1){
                if(s[i] == 'I' && (s[i+1] == 'V' || s[i+1] == 'X')){
                    sum = sum + (numberNames[s[i+1]] - numberNames[s[i]]);
                    i++;
                }
                else if(s[i] == 'X' && (s[i+1] == 'L' || s[i+1] == 'C')){
                    sum = sum + (numberNames[s[i+1]] - numberNames[s[i]]);
                    i++;
                }
                else if(s[i] == 'C' && (s[i+1] == 'D' || s[i+1] == 'M')){
                    sum = sum + (numberNames[s[i+1]] - numberNames[s[i]]);
                    i++;
                }
                else{
                    sum = sum + numberNames[s[i]];
                }
            }
            else{
                sum = sum + numberNames[s[i]];
            }
        }
        return sum;
    }
}