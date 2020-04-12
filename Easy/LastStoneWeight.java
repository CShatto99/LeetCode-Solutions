/* We have a collection of stones, each stone has a positive integer weight.

Each turn, we choose the two heaviest stones and smash them together.  Suppose the stones have weights x and y with x <= y.  The result of this smash is:

If x == y, both stones are totally destroyed;
If x != y, the stone of weight x is totally destroyed, and the stone of weight y has new weight y-x.
At the end, there is at most 1 stone left.  Return the weight of this stone (or 0 if there are no stones left.) */

class Solution {
    public int lastStoneWeight(int[] stones) {
        
        // create a priority queue to store the stones
        // standard priority queues are built from min heaps. We need a max heap so use Collections.reverseOrder()
        Queue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        
        // insert all of the initial stones into the queue
        for(Integer n : stones)
            pq.offer(n);
        
        // while there are sill stones to smash together
        while(pq.size() > 1) {
            
            // x and y are the current stones being smashed together
            int x, y;
            
            // remove the two heaviest stones
            y = pq.poll();
            x = pq.poll();
            
            // if the two heaviest stones do not cancel out, put the result of smashing them together in the queue
            if(y > x)
                pq.offer(y-x);
        }
        
        // if the last two stones cancelled out, return a weight of zero, otherwise return the weight of the last stone
        return pq.size() == 0 ? 0 : pq.poll();
    }
}
