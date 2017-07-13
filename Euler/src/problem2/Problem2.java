package problem2;

public class Problem2 {

	public static void main(String[] args) {
			
		
		int previousNum = 2;		
		long sum = 2;
		int currentNum = 3;
		while (currentNum < 4000000) {
			if (currentNum % 2 == 0) {
				sum += currentNum;
			}
			int backUpPreviousNum = previousNum;
			previousNum = currentNum;
			currentNum += backUpPreviousNum;
		}

		System.out.println(sum);

	}

}
