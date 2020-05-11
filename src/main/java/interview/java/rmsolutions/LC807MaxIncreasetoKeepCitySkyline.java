package interview.java.rmsolutions;

//https://leetcode.com/problems/max-increase-to-keep-city-skyline/
public class LC807MaxIncreasetoKeepCitySkyline {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int[] rowMaxes = new int[grid.length];
        for (int i = 0; i < grid.length; i++) {
            rowMaxes[i] = getRowMax(grid, i);
        }

        int[] colMaxes = new int[grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            colMaxes[i] = getColMax(grid, i);
        }

        int returnValue = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                returnValue += Math.min(rowMaxes[i], colMaxes[j]) - grid[i][j];
            }
        }
        return returnValue;
    }

    private int getRowMax(int[][] grid, int rowNumber) {
        int max = Integer.MIN_VALUE;
        for (int columnNumber = 0; columnNumber < grid.length; columnNumber++) {
            if (grid[rowNumber][columnNumber] > max) {
                max = grid[rowNumber][columnNumber];
            }
        }
        return max;
    }

    private int getColMax(int[][] grid, int columnNumber) {
        int max = Integer.MIN_VALUE;
        for (int rowNumber = 0; rowNumber < grid[0].length; rowNumber++) {
            if (grid[rowNumber][columnNumber] > max) {
                max = grid[rowNumber][columnNumber];
            }
        }
        return max;
    }
}
