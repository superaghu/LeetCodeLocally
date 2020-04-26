package interview.rmsolutions;

//Asked by Aakash
public class FillColor {

    public void fill(int[][] canvas, int newColor, int x, int y) {
        if (canvas[x][y] != newColor) {
            fillColor(canvas, canvas[x][y], newColor, x, y);
        }
    }

    private void fillColor(int[][] canvas, int indexColor, int newColor, int x, int y) {
        if (x < 0 || x >= canvas.length || y < 0 || y >= canvas[0].length) {
            return;
        }

        if (canvas[x][y] == indexColor) {
            canvas[x][y] = newColor;
            fillColor(canvas, indexColor, newColor, x - 1, y);
            fillColor(canvas, indexColor, newColor, x + 1, y);
            fillColor(canvas, indexColor, newColor, x, y - 1);
            fillColor(canvas, indexColor, newColor, x, y + 1);
        }
    }
}




