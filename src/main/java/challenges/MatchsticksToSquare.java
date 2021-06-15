package challenges;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MatchsticksToSquare {
    boolean[] used;
    int sideLength;
    int[] matchsticks;
    public boolean makesquare(int[] matchsticks) {
        int totalLength = Arrays.stream(matchsticks).sum();
        if (totalLength % 4 != 0) {
            return false;
        }
        sideLength = totalLength / 4;
        used = new boolean[matchsticks.length];
        this.matchsticks = matchsticks;
        return helper( 0, 0, 0);
    }

    private boolean helper( int longEnough, int sides, int index) {
        if (sides == 4) {
            return true;
        }
        if (longEnough == sideLength) {
            return helper( 0, sides + 1, 0);
        }
        if (index >= matchsticks.length) {
            return false;
        }
        for (int i = index; i < matchsticks.length; i++) {
            if (!used[i]) {
                if (longEnough + matchsticks[i] <= sideLength) {
                    used[i] = true;
                    if (helper( longEnough + matchsticks[i], sides, i+1)) {
                        return true;
                    }
                    used[i] = false;
                }
            }
        }

        return false;
    }
}
