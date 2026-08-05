class Solution {
    public int trap(int[] height) {
        int area = 0;
       for (int i  = 0; i<height.length; i++) {
        int left = height[i];
        int right = height[i];
        for (int j = 0; j <i; j++) {
            left = Math.max(height[j], left);
        }

        for (int j = i+1; j <height.length; j++) {
            right = Math.max(height[j], right);
        }

        area+=Math.min(left,right)-height[i];

       }
    return area;



    }
}
