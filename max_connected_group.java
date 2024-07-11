import java.util.*;

public class Solution {

    // Directions for moving in the grid (up, down, left, right)
    private static final int[][] DIRECTIONS = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public int MaxConnection(int[][] grid) {
        int n = grid.length;
        if (n == 0) return 0;

        // Step 1: Identify all connected components of 1's and label them
        int label = 2; // Start labeling from 2 to avoid confusion with 0 and 1
        Map<Integer, Integer> componentSize = new HashMap<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    int size = dfs(grid, i, j, n, label);
                    componentSize.put(label, size);
                    label++;
                }
            }
        }

        // Step 2: Evaluate the effect of changing each 0 to 1
        int maxSize = componentSize.values().stream().max(Integer::compare).orElse(0);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 0) {
                    Set<Integer> seenComponents = new HashSet<>();
                    int newSize = 1; // For the cell that is changed from 0 to 1
                    for (int[] direction : DIRECTIONS) {
                        int newX = i + direction[0];
                        int newY = j + direction[1];
                        if (newX >= 0 && newY >= 0 && newX < n && newY < n && grid[newX][newY] > 1) {
                            int componentLabel = grid[newX][newY];
                            if (seenComponents.add(componentLabel)) {
                                newSize += componentSize.get(componentLabel);
                            }
                        }
                    }
                    maxSize = Math.max(maxSize, newSize);
                }
            }
        }

        return maxSize;
    }

    private int dfs(int[][] grid, int i, int j, int n, int label) {
        if (i < 0 || j < 0 || i >= n || j >= n || grid[i][j] != 1) {
            return 0;
        }

        grid[i][j] = label;
        int size = 1;
        for (int[] direction : DIRECTIONS) {
            size += dfs(grid, i + direction[0], j + direction[1], n, label);
        }

        return size;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[][] grid1 = {{1, 1}, {0, 1}};
        System.out.println(sol.MaxConnection(grid1)); // Output: 4

        int[][] grid2 = {{1, 0, 1}, {1, 0, 1}, {1, 0, 1}};
        System.out.println(sol.MaxConnection(grid2)); // Output: 7
    }
}
