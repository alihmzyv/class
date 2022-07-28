package july2822;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class DiagonalDifferenceTest {

    @org.junit.jupiter.api.Test
    void diagonalDifferenceTest1() {
        assertEquals(2, DiagonalDifference.diagonalDifference(new int[][]{{1, 2, 3}, {4, 5, 6}, {9, 8, 9}}));
    }

    @Test
    void diagonalDifferenceTest2() {
        assertEquals(15, DiagonalDifference.diagonalDifference(new int[][]{{11, 2, 4}, {4, 5, 6}, {10, 8, -12}}));
    }
}