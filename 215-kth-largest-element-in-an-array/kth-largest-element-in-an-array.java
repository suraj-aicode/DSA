class Solution {
    public int findKthLargest(int[] nums, int k) {
         PriorityQueue<Integer> PQ = new PriorityQueue<>();
        for (int no : nums)
        {
            PQ.offer(no);
            if(PQ.size() > k)
                PQ.poll();
        }
        return PQ.peek();
    }
}