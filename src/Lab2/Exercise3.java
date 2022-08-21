package Lab2;

import java.util.Arrays;

/*
 * Exercise 3: Create a method which accepts an integer array, reverse the numbers in
 *  the array
 *  and returns the resulting array in sorted order
 */
public class Exercise3 {
	public int[] getSorted(int[] arr) {

		for (int i = 0; i < arr.length; i++) {

			// convert to string
			String str = Integer.toString(arr[i]);

			// reverse the string
			String s = "";
			for (int j = str.length() - 1; j >= 0; j--) {
				s = s + str.charAt(j);
			}

			int num = Integer.parseInt(s);

			arr[i] = num;

		}
		// sort
		Arrays.sort(arr);
		return arr;
	}

	public static void main(String[] args) {
		Exercise3 e3 = new Exercise3();

		int[] a = { 12, 43, 45, 67, 87, 1, 0, 6, 3, 13 };

		e3.getSorted(a);

		for (int item : a) {
			System.out.println(item);
		}
	}
}
