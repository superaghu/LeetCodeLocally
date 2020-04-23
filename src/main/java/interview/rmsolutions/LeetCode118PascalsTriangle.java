package interview.rmsolutions;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/pascals-triangle/
public class LeetCode118PascalsTriangle {

    //Copied
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();
        if (numRows <= 0) {
            return triangle;
        }
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<Integer>();
            for (int j = 0; j < i + 1; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    row.add(triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j));
                }
            }
            triangle.add(row);
        }
        print(triangle);
        return triangle;
    }

    private void print(List<List<Integer>> triangle) {
        for(List<Integer> list : triangle){
            for(Integer item : list){
                System.out.print(item + " ");
            }
            System.out.println();
        }
    }

    public List<List<Integer>> generate_badSolutionFromAnswers(int numRows) {
        List<List<Integer>> allrows = new ArrayList<>();
        ArrayList<Integer> row = new ArrayList<Integer>();
        for (int i = 0; i < numRows; i++) {
            row.add(0, 1);
            for (int j = 1; j < row.size() - 1; j++) {
                row.set(j, row.get(j) + row.get(j + 1));
            }
            allrows.add(new ArrayList<Integer>(row));
        }
        return allrows;
    }

    public List<List<Integer>> generate_mine(int numRows) {
        if (numRows <= 0) {
            return List.of();
        }
        List<Integer> level1 = List.of(1);
        List<Integer> level2 = List.of(1, 1);
        if (numRows == 1) {
            return List.of(level1);
        }
        if (numRows == 2) {
            return List.of(level1, level2);
        }
        List<List<Integer>> returnValue = new ArrayList<>();
        returnValue.add(level1);
        returnValue.add(level2);

        List<Integer> nextList = level2;
        for (int i = 3; i <= numRows; i++) {
            nextList = nextPascal(nextList);
            returnValue.add(nextList);
        }

        return returnValue;
    }

    private List<Integer> nextPascal(List<Integer> level) {
        int currLevelNumber = level.size();

        List<Integer> nextLevel = new ArrayList<>();
        for (int i = 0; i <= currLevelNumber; i++) {
            if (i == 0) {
                nextLevel.add(level.get(i));
                continue;
            }

            if (i == currLevelNumber) {
                nextLevel.add(level.get(i - 1));
                continue;
            }
            nextLevel.add(level.get(i - 1) + level.get(i));
        }
        return nextLevel;
    }
}
