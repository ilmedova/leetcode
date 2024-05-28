package IntegerToRoman;

import java.util.HashMap;

public class Solution {
    public String intToRoman(int num) {
        HashMap<Character, Integer> h = new HashMap<>();
        h.put('I', 1);
        h.put('V', 5);
        h.put('X', 10);
        h.put('L', 50);
        h.put('C', 100);
        h.put('D', 500);
        h.put('M', 1000);
        String result = "";
        int count = 1;
        while(num > 0){
            int last = num%10;
            if(count < 10){
                if(last < 4){
                    for(int i = 1; i <= last; i++){
                        result+="I";
                    }
                }
                if(last < 6){
                    result+="V";
                    for(int i = 5; i <= last;i++){
                        result+="I";
                    }
                }
                if(last < 9){
                    for(int i = 5; i <= last; i++){
                        result+="I";
                    }
                    result+="V";
                }
                if(last > 8){

                }
            }


            count*=10;
        }
//        for(int i = 0; i < s.length(); i++){
//            if(i != s.length()-1 && h.get(s.charAt(i)) < h.get(s.charAt(i+1))){
//                result = result + h.get(s.charAt(i+1)) - h.get(s.charAt(i));
//                i++;
//            }
//            else{
//                result = result + h.get(s.charAt(i));
//            }
//        }
        return result;
    }
}
