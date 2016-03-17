/*Find the total area covered by two rectilinear rectangles in a 2D plane.
 *Link: https://leetcode.com/problems/rectangle-area/
 */
public class Solution {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int[] x = { A, E, C, G };
		int[] y = { B, F, D, H };
		Arrays.sort(x);
		Arrays.sort(y);
		int cover = 0;
		if (C < E || G < A || B > H || F > D)
			cover = 0;
		else
			cover = (x[2] - x[1]) * (y[2] - y[1]);
		return (C - A) * (D - B) + (G - E) * (H - F) - cover;
        
    }
}
