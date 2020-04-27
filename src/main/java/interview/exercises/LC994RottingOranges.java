package interview.exercises;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/rotting-oranges/
public class LC994RottingOranges {
    class Position {
        final int x;
        final int y;

        Position(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public int orangesRotting(int[][] grid) {
        if (!freshOrangeExist(grid)) {
            return 0;
        }

        List<Position> positions = findAllSpoiledOranges(grid);
        int minutes = 0;
        while (positions.size() != 0) {
            minutes++;
            positions = checkStatus(positions, grid);
        }

        if (freshOrangeExist(grid)) {
            return -1;
        }
        return minutes-1;
    }

    private List<Position> checkStatus(List<Position> positions, int[][] grid) {
        List<Position> newPositions = new ArrayList<>();
        for (Position position : positions) {
            grid[position.x][position.y] = 2;
            final Position left = new Position(position.x - 1, position.y);
            final Position right = new Position(position.x + 1, position.y);
            final Position up = new Position(position.x, position.y - 1);
            final Position down = new Position(position.x, position.y + 1);
            if (isFreshOrange(left, grid)) {
                newPositions.add(left);
            }
            if (isFreshOrange(right, grid)) {
                newPositions.add(right);
            }
            if (isFreshOrange(up, grid)) {
                newPositions.add(up);
            }
            if (isFreshOrange(down, grid)) {
                newPositions.add(down);
            }
        }

        return newPositions;
    }

    private boolean isFreshOrange(Position position, int[][] grid) {
        if (position.x >= 0 && position.x < grid.length && position.y >= 0 && position.y < grid[0].length) {
            return grid[position.x][position.y] == 1;
        }
        return false;
    }

    private List<Position> findAllSpoiledOranges(int[][] grid) {
        List<Position> positions = new ArrayList<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 2) {
                    positions.add(new Position(i, j));
                }
            }
        }
        return positions;
    }

    private boolean freshOrangeExist(int[][] grid) {
        for (int[] ints : grid) {
            for (int j = 0; j < grid[0].length; j++) {
                if (ints[j] == 1) {
                    return true;
                }
            }
        }
        return false;
    }
}
