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

    @Test
    void should_reverse_bits_example_2() {
        // given
        // 11111111111111111111111111111101
        final var input = -3;
        // 10111111111111111111111111111111
        final var expected = -1073741825;

        // when
        final var actual = new Solution().reverseBits(input);

        // then
        assertThat(actual).isEqualTo(expected);
    }

    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE - 1);
        System.out.println(Integer.toBinaryString(Integer.MAX_VALUE - 1));
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.toBinaryString(Integer.MAX_VALUE));
        System.out.println(Integer.MAX_VALUE + 1);
        System.out.println(Integer.toBinaryString(Integer.MAX_VALUE + 1));

        System.out.println(Integer.MIN_VALUE - 1);
        System.out.println(Integer.toBinaryString(Integer.MIN_VALUE - 1));
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.toBinaryString(Integer.MIN_VALUE));
        System.out.println(Integer.MIN_VALUE + 1);
        System.out.println(Integer.toBinaryString(Integer.MIN_VALUE + 1));

        // Math.pow(2,31) - 1          ; 01111111111111111111111111111110
        // Math.pow(2,31)              ; 01111111111111111111111111111111
        // (Math.pow(2,31) + 1) * (-1) ; 10000000000000000000000000000000

        // Math.pow(2,31)              ; 01111111111111111111111111111111
        // (Math.pow(2,31) + 1) * (-1) ; 10000000000000000000000000000000
        // Math.pow(2,31) * (-1)       ; 10000000000000000000000000000001
    }
}