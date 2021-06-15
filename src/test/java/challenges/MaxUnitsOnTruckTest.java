package challenges;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaxUnitsOnTruckTest {

    MaxUnitsOnTruck maxUnitsOnTruck;

    @BeforeEach
    void setUp() {
        maxUnitsOnTruck = new MaxUnitsOnTruck();
    }

    @Test
    void maximumUnits() {
        assertEquals(8, maxUnitsOnTruck.maximumUnits(new int[][]{{1, 3}, {2, 2}, {3, 1}}, 4));
        assertEquals(91, maxUnitsOnTruck.maximumUnits(new int[][]{{5, 10}, {2, 5}, {4, 7}, {3, 9}}, 10));
        assertEquals(88, maxUnitsOnTruck.maximumUnits(new int[][]{{5, 10}, {2, 5}, {4, 7}}, 20));
    }
}