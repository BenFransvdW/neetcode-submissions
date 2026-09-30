class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.merge(nums[i], 1, Integer::sum);
        }

        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a,b) -> 
        Integer.compare(a[0], b[0]));

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int num = entry.getKey();
            int freq = entry.getValue();

            if (minHeap.size() < k) {
                minHeap.offer(new int[]{freq, num});
            } else if (freq > minHeap.peek()[0]) {
                minHeap.poll();
                minHeap.offer(new int[]{freq, num});
            }
        }
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = minHeap.poll()[1];
        }
        return result;
    }
}
