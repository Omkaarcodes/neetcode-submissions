class Solution {
    public int trap(int[] height) {
        int leftPointer = 0;
        int rightPointer = height.length-1;

        int area = 0;

      int leftMax  = height[leftPointer];
      int rightMax = height[rightPointer];


        while (leftPointer < rightPointer) {

            if (leftMax < rightMax) {

                leftPointer++;
                leftMax = Math.max(leftMax, height[leftPointer]);
                area+= leftMax - height[leftPointer];

                
                
            }
            else {
                
                rightPointer--;
                rightMax = Math.max(rightMax, height[rightPointer]);
                area+=rightMax - height[rightPointer];
                
            }


    }
    return area;
    }
}
