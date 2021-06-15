package challenges;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatchsticksToSquareTest {

    MatchsticksToSquare matchsticks;
    @BeforeEach
    void setUp() {
        matchsticks = new MatchsticksToSquare();
    }

    @Test
    void makesquare() {
        assertTrue(matchsticks.makesquare(new int[]{1,1,2,2,2}));
        assertFalse(matchsticks.makesquare(new int[]{1,1,2,4,5}));
        assertFalse(matchsticks.makesquare(new int[]{3, 3, 3, 3, 4}));

    }
}