package challenges;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PascalTriangleTest {

    PascalTriangle tri;
    @BeforeEach
    void setUp() {
        tri = new PascalTriangle();
    }

    @Test
    void generate() {
        tri.generate(5);
    }
}