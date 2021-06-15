package challenges;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Replace0With5Test {

    Replace0With5 replace;
    @BeforeEach
    void setUp() {
        replace = new Replace0With5();
    }

    @Test
    void convertfive() {
        assertEquals(1554, replace.convertfive(1004));
        assertEquals(121, replace.convertfive(121));
    }
}