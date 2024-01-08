package ZigZagConversion;

public class Solution {

    public void convert(String s, int numRows) {
        int numColumns = s.length()/numRows;
        char[][] arr = new char[numRows][numColumns];
        int k = 0;
        for(int i = 0; i < numColumns; i++){
            for(int j = 0; j < numRows; j++){
                arr[j][i] = s.charAt(k);
                k++;
            }
        }

        for(int i = 0; i < numRows; i++){
            for(int j = 0 ; j < numColumns; j++){
                System.out.print(" " + arr[i][j]);
            }
            System.out.println();
        }
    }
}
