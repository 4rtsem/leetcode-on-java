package uk.sauch.topinterview150.MergeSortedArray;


public class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        var resultPointer = m + n - 1;
        var num1Pointer = m - 1;
        var num2Pointer = n - 1;

        while (resultPointer >= 0) {
            int toInsert;

            if (num1Pointer < 0) {
                toInsert = nums2[num2Pointer--];
            } else if (num2Pointer < 0) {
                toInsert = nums1[num1Pointer--];
            } else if (nums1[num1Pointer] > nums2[num2Pointer]) {
                toInsert = nums1[num1Pointer--];
            } else {
                toInsert = nums2[num2Pointer--];
            }
            nums1[resultPointer--] = toInsert;
        }
    }
}
