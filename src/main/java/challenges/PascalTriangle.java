package challenges;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> rtnList = new ArrayList<>();
        if(numRows == 1){
            rtnList.add(new ArrayList<Integer>(List.of(1)));
            return rtnList;
        }else if(numRows == 2) {
            rtnList.add(new ArrayList<Integer>(List.of(1)));
            rtnList.add(new ArrayList<Integer>(List.of(1, 1)));
            return rtnList;
        }

        rtnList.add(new ArrayList<Integer>(List.of(1)));
        rtnList.add(new ArrayList<Integer>(List.of(1, 1)));
        for( int i = 3; i<= numRows; i++){
            List<Integer> temp = new ArrayList<>();
            temp.add(1);
            int wCount = 0, wMax = i-2;
            List<Integer> level = rtnList.get(i-2);
            while(wCount < wMax){
                temp.add(level.get(wCount) + level.get(wCount+1));
                wCount++;
            }
            temp.add(1);
            rtnList.add(temp);
        }

        return rtnList;


    }
}
