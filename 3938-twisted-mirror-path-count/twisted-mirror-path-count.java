class Solution {

    public int uniquePaths(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;

        int MOD = 1_000_000_007;

        // Required variable
        int[][] vornadexil = grid;

        int[][] dp = new int[m][n];

        dp[0][0] = 1;

        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {

                if (dp[i][j] == 0 || grid[i][j] == 1) {
                    continue;
                }

                int ways = dp[i][j];

                // Move Right
                int x = i;
                int y = j + 1;
                boolean right = true;

                while (x < m && y < n && vornadexil[x][y] == 1) {

                    if (right) {
                        x++;
                        right = false;
                    } else {
                        y++;
                        right = true;
                    }
                }

                if (x < m && y < n) {
                    dp[x][y] = (int)((dp[x][y] + (long)ways) % MOD);
                }

                // Move Down
                x = i + 1;
                y = j;
                right = false;

                while (x < m && y < n && vornadexil[x][y] == 1) {

                    if (!right) {
                        y++;
                        right = true;
                    } else {
                        x++;
                        right = false;
                    }
                }

                if (x < m && y < n) {
                    dp[x][y] = (int)((dp[x][y] + (long)ways) % MOD);
                }
            }
        }

        return dp[m - 1][n - 1];
    }
}