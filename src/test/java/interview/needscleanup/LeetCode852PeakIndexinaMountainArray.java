package interview.needscleanup;

//https://leetcode.com/problems/peak-index-in-a-mountain-array/
public class LeetCode852PeakIndexinaMountainArray {

    public int peakIndexInMountainArray(int[] A) {
        int max = A[0];
        for (int i = 1; i < A.length; i++) {
            if (A[i] > max) {
                max = A[i];
            } else {
                return i - 1;
            }
        }
        return -1;
    }
}
