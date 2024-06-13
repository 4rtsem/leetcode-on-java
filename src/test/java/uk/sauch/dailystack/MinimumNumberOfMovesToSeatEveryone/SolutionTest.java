package uk.sauch.dailystack.MinimumNumberOfMovesToSeatEveryone;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @Test
    void should_compute_min_moves_to_seat_example_1() {
        // given
        var seats = new int[]{3, 1, 5};
        var students = new int[]{2, 7, 4};
        var expected = 4;

        // when
        var actual = new Solution().minMovesToSeat(seats, students);

        // then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void should_compute_min_moves_to_seat_example_2() {
        // given
        var seats = new int[]{4, 1, 5, 9};
        var students = new int[]{1, 3, 2, 6};
        var expected = 7;

        // when
        var actual = new Solution().minMovesToSeat(seats, students);

        // then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void should_compute_min_moves_to_seat_example_3() {
        // given
        var seats = new int[]{2, 2, 6, 6};
        var students = new int[]{1, 3, 2, 6};
        var expected = 4;

        // when
        var actual = new Solution().minMovesToSeat(seats, students);

        // then
        assertThat(actual).isEqualTo(expected);
    }
}