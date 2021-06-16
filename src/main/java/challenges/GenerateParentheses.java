package challenges;

import java.util.LinkedList;
import java.util.List;

public class GenerateParentheses {

    List<String> parens;

    //1 <= n <= 8
    public List<String> generateParenthesis(int n) {
        parens = new LinkedList<>();
        backtrack(n,0,0, "");

        return parens;
    }

    private void backtrack(int pairs, int open, int close, String curr){
        if(pairs == close){
            parens.add(curr);
        }else {
            if(open< pairs){
                backtrack(pairs, open + 1, close, curr + "(");
            }
            if(open > close){
                backtrack(pairs, open, close +1, curr + ")");
            }
        }

    }
}
