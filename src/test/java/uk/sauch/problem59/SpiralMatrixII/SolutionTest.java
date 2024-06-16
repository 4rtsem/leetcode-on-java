package uk.sauch.problem59.SpiralMatrixII;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @Test
    void should_generate_matrix_example_1() {
        // given
        var expected = new int[][]{
                {1, 2, 3},
                {8, 9, 4},
                {7, 6, 5}
        };

        // when
        var actual = new Solution().generateMatrix(3);

        // then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void should_generate_matrix_example_2() {
        // given
        var expected = new int[][]{{1}};

        // when
        var actual = new Solution().generateMatrix(1);

        // then
        assertThat(actual).isEqualTo(expected);
    }
}