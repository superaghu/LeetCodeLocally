package interview.exercises;

public class FillColor {


//4, (1,3)
//
//
//        1 0 0 2 2 0
//        0 0 0 2 2 2
//        1 2 3 2 2 2
//        0 1 1 1 3 2
//
//
//    Go to the pixel
//    If its different color, change it and mark it to be done
//    Verify adjacent pixes (horizontal and vertical)
//    If they are of same color, queue them
//while queue is not empty, iterate
//
//    go to the pixel
//while that pixel is different
//    change it
//    and recursively verify the adjacent pixels
//    until all adjacent pixels are different color or its the end of the canvas
//
//
//    int[][] canvas;
//    public void fillColor(int newColor, int x, int y ){
//        if(canvas[x][y] != newColor){
//            fill(canvas[x][y], newColor, x, y);
//        }
//    }
//
//    private void fill(int indexColor, int newColor, int x, int y){
//        if(x < 0 || x > canvas.length || y <0 || y > canvas[0].length){
//            return;
//        }
//
//        if(canvas[x][y] == indexColor){
//            canvas[x][y] = newColor;
//            fill(newColor, x-1, y);
//            fill(newColor, x+1, y);
//            fill(newColor, x, y-1);
//            fill(newColor, x, y+1);
//        }
//    }
//
//
//
//    //Find the common point in linked list
//  1 -> 2 -> 5 -> 7 -> 2 -> 5
//          |
//          4 ->  3 -> 6
//
//    L1 length 6
//    L2 length 7
//
//    walk L2 to be same length of L1
//
//
//  10 length
//  100 length
//
//    O(max(L1, L2);
//
//
//    List
//
//    //
//
//  10
//          2 2 2 3 4 5 6 8 9


}
