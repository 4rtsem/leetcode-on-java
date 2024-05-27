package uk.sauch.topinterview150.MergeSortedArray;


public class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        m -= 1;
        n -= 1;

        while (m + n + 1 >= 0) {
            if (m < 0) {
                nums1[m + n + 1] = nums2[n--];
            } else if (n < 0) {
                nums1[m + n + 1] = nums1[m--];
            } else if (nums1[m] > nums2[n]) {
                nums1[m + n + 1] = nums1[m--];
            } else {
                nums1[m + n + 1] = nums2[n--];
            }
        }
    }
}
