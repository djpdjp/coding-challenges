package challenges;

import java.util.PriorityQueue;

public class MaxUnitsOnTruck {

    public int maximumUnits(int[][] boxTypes, int truckSize) {
        PriorityQueue<Container> priorityQueue = new PriorityQueue<>((o1, o2) -> o2.units - o1.units);

        for (int[] boxType : boxTypes) {
            priorityQueue.add(new Container(boxType[0], boxType[1]));
        }
        int units = 0;
        while (truckSize > 0){
            if(priorityQueue.isEmpty()){
                break;
            }
            Container temp = priorityQueue.poll();
            int amount = Math.min(temp.number, truckSize);
            units += amount * temp.units;
            truckSize -= amount;
        }

        return units;
    }

    private static class Container {

        Integer number;
        Integer units;

        public Container(int num, int u){
            this.number = num;
            this.units = u;
        }


    }

}
