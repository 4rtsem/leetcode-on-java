package uk.sauch.topinterview150.MergeSortedArray;


public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        if (n == 0) return;

        if (m == 0) {
            System.arraycopy(nums2, 0, nums1, 0, nums2.length);
            return;
        }

        int[] result = new int[nums1.length];

        var resultPointer = 0;
        var num1Pointer = 0;
        var num2Pointer = 0;

        do {
            if (nums1[num1Pointer] != 0 && nums1[num1Pointer] < nums2[num2Pointer]) {
                result[resultPointer++] = nums1[num1Pointer++];
            } else {
                result[resultPointer++] = nums2[num2Pointer++];
            }
        } while (resultPointer < result.length);

        System.arraycopy(result, 0, nums1, 0, nums1.length);
    }
}
