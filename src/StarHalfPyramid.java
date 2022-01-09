public class StarHalfPyramid {
	public static void StarHalfPyramid (int n) {
		int x, y;
		for (x = 0; x < n; x++) {
			for (y = 0; y <= x; y++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
	public static void main (String args[]) {
		int s = 5;
		StarHalfPyramid (s);
	}
	
}
