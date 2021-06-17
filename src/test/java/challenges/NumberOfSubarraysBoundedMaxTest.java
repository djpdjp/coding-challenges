package challenges;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfSubarraysBoundedMaxTest {
    NumberOfSubarraysBoundedMax boundedMax;
    @BeforeEach
    void setUp() {
        boundedMax = new NumberOfSubarraysBoundedMax();
    }

    @Test
    void numSubarrayBoundedMax() {
      int a = boundedMax.numSubarrayBoundedMax(new int[]{2,1,2,2,4,3}, 2, 3);
      assertEquals(10, a);
    }
}