package question3;

import java.util.ArrayList;
import java.util.List;

public class q3 {

	public static void main(String[] args) {

		ArrayList<Integer> array = new ArrayList<>();

		array.add(1);
		array.add(2);
		array.add(3);
		array.add(4);
		array.add(5);

		List<Integer> oddNumbers = array.stream().filter(temp -> temp % 2 != 0).toList();

		List<Integer> squareNumbers = oddNumbers.stream().map(temp -> temp * temp).toList();

		int sum = squareNumbers.stream().mapToInt(temp -> temp).sum();

		System.out.println("Input : " + array);
		System.out.println("Odd Numbers : " + oddNumbers);
		System.out.println("Square numbers : " + squareNumbers);
		System.out.println("Sum : " + sum);
	}

}