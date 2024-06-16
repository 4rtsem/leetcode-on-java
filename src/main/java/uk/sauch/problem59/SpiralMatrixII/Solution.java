package uk.sauch.problem59.SpiralMatrixII;

public class Solution {
    public int[][] generateMatrix(int n) {
        var result = new int[n][n];

        var value = 0;

        var i = 0;
        var j = 0;

        var direction = Direction.RIGHT;

        while (value < n * n) {
            switch (direction) {
                case Direction.RIGHT -> {
                    if (j < n && result[i][j] == 0) {
                        result[i][j++] = ++value;
                    } else {
                        direction = Direction.DOWN;
                        j--;
                        i++;
                    }
                }
                case Direction.DOWN -> {
                    if (i < n && result[i][j] == 0) {
                        result[i++][j] = ++value;
                    } else {
                        direction = Direction.LEFT;
                        i--;
                        j--;
                    }
                }
                case Direction.LEFT -> {
                    if (j >= 0 && result[i][j] == 0) {
                        result[i][j--] = ++value;
                    } else {
                        direction = Direction.UP;
                        j++;
                        i--;
                    }
                }
                case Direction.UP -> {
                    if (i >= 0 && result[i][j] == 0) {
                        result[i--][j] = ++value;
                    } else {
                        direction = Direction.RIGHT;
                        i++;
                        j++;
                    }
                }
            }
        }

        return result;
    }

    enum Direction {
        RIGHT, DOWN, LEFT, UP
    }
}
