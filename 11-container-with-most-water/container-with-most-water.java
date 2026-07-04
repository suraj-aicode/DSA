class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int maxSum = 0;

        while (i < j) {
            int area = Math.min(height[i], height[j]) * (j - i);
            // System.out.println(
            //         "Height at i" + height[i] + " Height at j" + height[j] + "Base =" + (j - i) + " Area = " + area);
            if (maxSum < area) {
                maxSum = area;
            }

            if(height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return maxSum;
    }
}