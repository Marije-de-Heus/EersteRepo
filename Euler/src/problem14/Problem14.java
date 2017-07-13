package problem14;

public class Problem14 {

	
	public static void main(String[] args) {
		
		int longestChain = 0;
		for (int i = 1; i < 1000000; i++) {
			int currentChain = determineChain(i, 0);
			if (currentChain > longestChain) {
				longestChain = currentChain;
			}
			
		}
		System.out.println(longestChain);

	}

	private static int determineChain(long currentNumber, int sum) {
		if (currentNumber == 1) {
			return sum + 1;
		}
		
		if (currentNumber % 2 == 0) {
			return determineChain(currentNumber / 2, sum + 1);
		}
		
		return determineChain(3*currentNumber + 1, sum + 1);
	}	
}
