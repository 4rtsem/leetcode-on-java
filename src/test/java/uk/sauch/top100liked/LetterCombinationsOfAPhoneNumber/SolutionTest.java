package uk.sauch.top100liked.LetterCombinationsOfAPhoneNumber;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @Test
    void should_letter_combinations_example_1() {
        // given
        final var input = "23";
        final var expected = List.of("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf");

        // when
        final var actual = new Solution().letterCombinations(input);

        // then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void should_letter_combinations_example_2() {
        // given
        final var input = "";

        // when
        final var actual = new Solution().letterCombinations(input);

        // then
        assertThat(actual).isEmpty();
    }

    @Test
    void should_letter_combinations_example_3() {
        // given
        final var input = "2";
        final var expected = List.of("a", "b", "c");

        // when
        final var actual = new Solution().letterCombinations(input);

        // then
        assertThat(actual).isEqualTo(expected);
    }
}