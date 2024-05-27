package uk.sauch.topinterview150.ReverseBits;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @Test
    void should_reverse_bits_example_1() {
        // given
        // 0b00000010100101000001111010011100
        final var input = 43261596;
        // 0b00111001011110000010100101000000
        final var expected = 964176192;

        // when
        final var actual = new Solution().reverseBits(input);

        // then
        assertThat(actual).isEqualTo(expected);
    }
}