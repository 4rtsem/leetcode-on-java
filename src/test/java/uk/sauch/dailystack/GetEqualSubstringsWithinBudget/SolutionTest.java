package uk.sauch.dailystack.GetEqualSubstringsWithinBudget;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    // Explanation: "abc" of s can change to "bcd".
    // That costs 3, so the maximum length is 3.
    @Test
    void should_equal_substring_example_1() {
        // given
        final var s = "abcd";
        final var t = "bcdf";
        final var maxCost = 3;

        final var expected = 3;

        // when
        final var actual = new Solution().equalSubstring(s, t, maxCost);

        // then
        assertThat(actual).isEqualTo(expected);
    }

    // Explanation: Each character in s costs 2 to change to character in t,
    // so the maximum length is 1.
    @Test
    void should_equal_substring_example_2() {
        // given
        final var s = "abcd";
        final var t = "cdef";
        final var maxCost = 3;

        final var expected = 1;

        // when
        final var actual = new Solution().equalSubstring(s, t, maxCost);

        // then
        assertThat(actual).isEqualTo(expected);
    }

    //  Explanation: You cannot make any change, so the maximum length is 1.
    @Test
    void should_equal_substring_example_3() {
        // given
        final var s = "abcd";
        final var t = "acde";
        final var maxCost = 0;

        final var expected = 1;

        // when
        final var actual = new Solution().equalSubstring(s, t, maxCost);

        // then
        assertThat(actual).isEqualTo(expected);
    }

}


