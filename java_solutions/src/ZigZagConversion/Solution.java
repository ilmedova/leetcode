package ZigZagConversion;

public class Solution {

    public String convert(String s, int numRows) {
        if(numRows < 2){
            return s;
        }
        int counter = 0;
        boolean fullRow = true;
        int gap = numRows - 2;
        int numColumns = 0;
        while(counter <= s.length()){
            if(fullRow){
                fullRow = false;
                counter+=numRows;
                gap = numRows - 2;
            }
            else{
                gap--;
                counter++;
                if(gap==0){
                    fullRow = true;
                }
            }
            numColumns++;
        }
        char[][] arr = new char[numRows][numColumns];
        counter = 0;
        fullRow = true;
        gap = numRows - 2;
        for(int i = 0; i < numColumns; i++){
            if(counter == s.length()){
                break;
            }
            if(fullRow || gap == 0){
                fullRow = false;
                gap = numRows - 2;
                for(int j = 0; j < numRows; j++){
                    arr[j][i] = s.charAt(counter);
                    counter++;
                    if(counter == s.length()){
                        break;
                    }
                }
            }
            else{
                for(int j = 0; j < numRows; j++){
                    if(j == gap){
                        arr[j][i] = s.charAt(counter);
                        counter++;
                    }
                    if(counter == s.length()){
                        break;
                    }
                }
                gap--;
                if(gap == 0){
                    fullRow = true;
                }
            }
        }

        s = "";
        for(int i = 0; i < numRows; i++){
            for(int j = 0 ; j < numColumns; j++){
                System.out.print(arr[i][j]);
                if(arr[i][j] != 0){
                    s+=arr[i][j];
                }
            }
            System.out.println();
        }
        return s;
    }
}
