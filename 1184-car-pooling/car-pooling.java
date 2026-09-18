class Solution {

    public boolean carPooling(int[][] trips, int capacity) {

        int maxLocation = 0;

        // Find maximum drop-off location
        for (int[] trip : trips) {
            maxLocation = Math.max(maxLocation, trip[2]);
        }

        // Difference array
        int[] passengers = new int[maxLocation + 1];

        // Add and remove passengers
        for (int[] trip : trips) {

            int numPassengers = trip[0];
            int from = trip[1];
            int to = trip[2];

            passengers[from] += numPassengers;
            passengers[to] -= numPassengers;
        }

        // Prefix sum + capacity check
        for (int i = 0; i < passengers.length; i++) {

            if (i > 0) {
                passengers[i] += passengers[i - 1];
            }

            if (passengers[i] > capacity) {
                return false;
            }
        }

        return true;
    }
}