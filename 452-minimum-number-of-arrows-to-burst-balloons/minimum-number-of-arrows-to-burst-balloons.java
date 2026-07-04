class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, new MyComparator());

        int arrows = 1;
        int end_pt = points[0][1];

        for (int i = 1; i < points.length; i++) {

            if (points[i][0] > end_pt) {
                arrows++;
                end_pt = points[i][1];
            }
        }

        return arrows;
    }

    static class MyComparator implements Comparator<int[]> {

        @Override
        public int compare(int[] a, int[] b) {
            return Integer.compare(a[1], b[1]);
        }
    }
}