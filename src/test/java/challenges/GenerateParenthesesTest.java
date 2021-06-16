package challenges;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GenerateParenthesesTest {

    GenerateParentheses paren;
    @BeforeEach
    void setUp() {
        paren = new GenerateParentheses();
    }

    @Test
    void generateParenthesis() {
//        Input: n = 3
//        Output: ["((()))","(()())","(())()","()(())","()()()"]
//        Input: n = 1
//        Output: ["()"]
        List<String> three = paren.generateParenthesis(3);
        assertTrue(three.containsAll(List.of("((()))","(()())","(())()","()(())","()()()")));
        assertEquals(5, three.size());
        List<String> two = paren.generateParenthesis(2);
        assertTrue(two.containsAll(List.of("(())","()()")));
        assertEquals(2, two.size());
        List<String> one = paren.generateParenthesis(1);
        assertTrue(one.contains("()"));
        assertEquals(1, one.size());
        List<String> eight = paren.generateParenthesis(8);
        assertEquals(1430, eight.size());
    }
}