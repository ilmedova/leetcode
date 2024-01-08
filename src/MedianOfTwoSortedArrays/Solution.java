package MedianOfTwoSortedArrays;

public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] temp = new int[nums1.length + nums2.length];

        int i = 0, j = 0, k = 0;
        while(k < temp.length){
            if(j >= nums2.length){
                temp[k] = nums1[i];
                i++;
            }
            else if (i >= nums1.length) {
                temp[k] = nums2[j];
                j++;
            }
            else if (nums1[i] < nums2[j]) {
                temp[k] = nums1[i];
                i++;
            }
            else{
                temp[k] = nums2[j];
                j++;
            }
            k++;
        }

        if(temp.length > 0){
            if(temp.length % 2 == 1) {
                return temp[(temp.length/2)];
            }
            else {
                return (temp[(temp.length/2)-1] + temp[(temp.length/2)])/2.0;
            }
        }

        return 0;
    }
}
