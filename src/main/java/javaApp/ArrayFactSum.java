package javaApp;
public class ArrayFactSum {

	public static void main(String[] args) {
		System.out.println(sum(new int[] { 1, -2, 3 }));
	}

	public static int sum(int[] numbers) {
		int sum = 0, k = 0, fact = 0;
		for (int i = 0; i < numbers.length; i++) {
			if(numbers[i] < 0) {
				sum += 0;
			}			
			else if (numbers[i] == 0 || numbers[i] == 1)
				sum += 1;
			else {
				for (int j = 1; j < numbers[i]; j++) {
					fact = j * numbers[i];
				}
				sum += fact;
			}
		}
		return sum;
	}
}
