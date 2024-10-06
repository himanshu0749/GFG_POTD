class Solution {
    // Function to find the number of islands.
    int n, m;
    int[][] dir = {
        {1, 0}, {-1, 0}, {0, -1}, {0, 1}, // Vertical and horizontal directions
        {1, 1}, {-1, -1}, {1, -1}, {-1, 1} // Diagonal directions
    };

    private void solve(char[][] grid, int i, int j) {
        // Base case: check for boundaries and water
        if (i < 0 || j < 0 || i >= n || j >= m || grid[i][j] == '0') return;

        // Mark the cell as visited by setting it to '0'
        grid[i][j] = '0';

        // Explore all 8 possible directions
        for (int[] d : dir) {
            int newi = i + d[0];
            int newj = j + d[1];
            solve(grid, newi, newj);
        }
    }

    public int numIslands(char[][] grid) {
        n = grid.length; // Number of rows
        if (n == 0) return 0; // Edge case for empty grid
        m = grid[0].length; // Number of columns
        int count = 0;

        // Iterate through each cell in the grid
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                // If we find an island (land cell)
                if (grid[i][j] == '1') {
                    solve(grid, i, j); // Run DFS to mark all connected land
                    count++; // Increment the island count
                }
            }
        }
        return count; // Return the total count of islands
    }
}
