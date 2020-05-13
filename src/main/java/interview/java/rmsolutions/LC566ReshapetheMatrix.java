package interview.java.rmsolutions;

//https://leetcode.com/problems/reshape-the-matrix/
public class LC566ReshapetheMatrix {
    //Copied
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int n = nums.length, m = nums[0].length;
        if (r * c != n * m) {
            return nums;
        }
        int[][] res = new int[r][c];
        for (int i = 0; i < r * c; i++) {
            res[i / c][i % c] = nums[i / m][i % m];
        }
        return res;
    }

    public int[][] matrixReshape_mine(int[][] nums, int r, int c) {
        if (nums.length * nums[0].length != r * c) {
            return nums;
        }

        int[][] output = new int[r][c];

        int x = 0, y = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                output[x][y++] = nums[i][j];
                if (y == c) {
                    x++;
                    y = 0;
                }
            }
        }
        return output;
    }
}
