class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] dayCount = new int[temperatures.length];

        Deque<Integer> stack = new ArrayDeque<>();
        

        for (int j = 0; j<temperatures.length;j++) {
            while(!stack.isEmpty() && temperatures[j] > temperatures[stack.peek()]) {
                int prevDay = stack.pop();
                dayCount[prevDay] = j-prevDay;
            }

            stack.push(j);
        }
        return dayCount;
    }
}
