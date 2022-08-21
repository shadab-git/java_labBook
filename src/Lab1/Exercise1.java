package Lab1;

//Exercise 1:Create a method to find the sum of the cubes of the digits
//of an n digit number

public class Exercise1 {
	public int num;

	public Exercise1() {

	}

	public Exercise1(int num) {
		this.num = num;
	}

	public int sumOfDigitCubes() {
		int sum = 0;
		
		//finding digits
		while (num != 0) {
			sum = sum + (num % 10) * (num % 10) * (num % 10);

			num = num / 10;
		}

		return sum;
	}

	public static void main(String[] args) {
		Exercise1 e1 = new Exercise1(431);

		System.out.println(e1.num);
		System.out.println(e1.sumOfDigitCubes());
	}
}
