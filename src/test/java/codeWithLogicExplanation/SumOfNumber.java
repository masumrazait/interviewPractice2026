package codeWithLogicExplanation; // Declares the package name (March). Helps organize classes.

public class SumOfNumber { // Defines the class SumOfNumber
	public static void main(String[] args) { // Main method: program entry point
		int num = 9876; // Initialize the number you want to process (example: 9876)

		// Outer loop: keep running until num becomes a single digit (<= 9)
		while (num > 9) {
			int sum = 0; // Reset sum for this iteration

			// Inner loop: calculate sum of digits of num
			while (num > 0) {
				sum += num % 10; // Add last digit to sum
				num = num / 10; // Remove last digit from num
			}

			// After summing digits, assign sum back to num
			num = sum;
		}

		// Print the final single-digit result
		System.out.println(num);
	}
}