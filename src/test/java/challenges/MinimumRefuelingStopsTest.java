package challenges;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumRefuelingStopsTest {
    MinimumRefuelingStops stops;

    @BeforeEach
    void setUp() {
        stops = new MinimumRefuelingStops();
    }

    @Test
    void minRefuelStops() {
        assertEquals(0, stops.minRefuelStops(1, 1, new int[][]{}));
        assertEquals(-1, stops.minRefuelStops(100, 1, new int[][]{{10,100}}));
        assertEquals(2, stops.minRefuelStops(100, 10, new int[][]{{10,60},{20,30},{30,30},{60, 40}}));
    }
}