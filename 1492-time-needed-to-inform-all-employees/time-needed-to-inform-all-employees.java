class Solution {
    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {

        int maxTime = 0;

        // Calculate the time required for every employee
        for (int i = 0; i < n; i++) {
            maxTime = Math.max(maxTime, dfs(i, manager, informTime));
        }

        return maxTime;
    }

    public int dfs(int employee, int[] manager, int[] informTime) {

        // Head has no manager, so it takes 0 time to reach the head
        if (manager[employee] == -1) {
            return 0;
        }

        // Find the time required to reach the manager
        int managerTime = dfs(manager[employee], manager, informTime);

        // Time required to reach this employee
        return managerTime + informTime[manager[employee]];
    }
}