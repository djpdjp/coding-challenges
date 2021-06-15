package challenges;

import java.util.PriorityQueue;

public class MinimumRefuelingStops {

    public int minRefuelStops(int target, int startFuel, int[][] stations) {
        if(target <= startFuel){
            return 0;
        }
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        int stops =0;
        int location =0;

        while (target > startFuel){
            while(location < stations.length && stations[location][0]<=startFuel){
                priorityQueue.add(stations[location][1]);
                location++;
            }
            if(priorityQueue.isEmpty()){
                return -1;
            }
            startFuel += priorityQueue.poll();
            stops++;
        }
        return stops;
    }
}
