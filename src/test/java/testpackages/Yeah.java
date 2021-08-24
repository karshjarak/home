package testpackages;

public class Yeah {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int[][][] b = new int[3][][];

		int[][] arr = { { 1, 2 }, { 3, 4 }, { 2, 7 } };

		int[][][] b = { { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } } };
		
		Object[] c = new Object[4];
		 c[0] = new String();
		 

//		b[0] = new int[2][];
//		b[1] = new int[2][];
//		b[2] = new int[2][];
//
//		b[0][0] = new int[2];
//		b[0][1] = new int[2];
//		b[1][0] = new int[2];
//		b[1][1] = new int[2];
//		b[2][0] = new int[2];
//		b[2][1] = new int[2];
//
//		b[0][0][0] = 1;
//		b[0][0][1] = 2;
//		b[0][1][0] = 3;
//		b[0][1][1] = 4;
//		
//		b[1][0][0] = 11;
//		b[1][0][1] = 22;
//		b[1][1][0] = 33;
//		b[1][1][1] = 44;
//		
//		b[2][0][0] = 111;
//		b[2][0][1] = 222;
//		b[2][1][0] = 333;
//		b[2][1][1] = 444;

		for (int[][] array : b) {

			for (int[] array2 : array) {

				for (int array3 : array2)

					System.out.println(array3);
			}
		}

		for (int i = 0; i < b.length; i++) {

			for (int j = 0; j < b[i].length; j++) {

				for (int k = 0; k < b[i][j].length; k++) {

					System.out.println(b[i][j][k]);

				}
			}

		}
	}
}
