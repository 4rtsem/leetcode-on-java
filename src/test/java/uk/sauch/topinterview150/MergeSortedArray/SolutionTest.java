package uk.sauch.topinterview150.MergeSortedArray;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {


    @Test
    void should_merge_example_1() {
        // given
        final var nums1 = new int[]{1, 2, 3, 0, 0, 0};
        final var m = 3;
        final var nums2 = new int[]{2, 5, 6};
        final var n = 3;

        final var expected = new int[]{1, 2, 2, 3, 5, 6};

        // when
        new Solution().merge(nums1, m, nums2, n);

        // then
        assertThat(nums1).isEqualTo(expected);
    }
}