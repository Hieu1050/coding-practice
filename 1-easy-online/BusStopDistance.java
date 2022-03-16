/*
https://leetcode.com/problems/distance-between-bus-stops/
A bus has n stops numbered from 0 to n - 1 that form a circle. We know the distance between all pairs of neighboring stops where distance[i] is the distance between the stops number i and (i + 1) % n.
The bus goes along both directions i.e. clockwise and counterclockwise.
Return the shortest distance between the given start and destination stops.

Input: distance = [1,2,3,4], start = 0, destination = 1
Output: 1
Explanation: Distance between 0 and 1 is 1 or 9, minimum is 1.

Input: distance = [1,2,3,4], start = 0, destination = 2
Output: 3
Explanation: Distance between 0 and 2 is 3 or 7, minimum is 3.
*/
public class BusStopDistance {
    public static void main(String[] args) {
        int [] distance = {1,2,3,4};
        Solution(distance, 0, 1);
    }
    public static int Solution (int[]distance, int start, int destination){
        if (destination < start){
            int tmp = destination;
            destination = start;
            start = tmp;
        }
        int total = 0, clockwise = 0;
        for (int i = 0; i < distance.length; i++) {
            total += distance[i];
            if (start <= i && i < destination){
                clockwise += distance[i];
            }
        }
        return Math.min(clockwise, total-clockwise);
    }
}
