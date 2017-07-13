package problem1;

import java.util.stream.IntStream;

public class Problem1 {
	
	public static void main(String[] args) {
		
		int answer = IntStream.range(1, 1000).filter(a -> a % 3 == 0 || a % 5 == 0).sum();
		
		System.out.println(answer);
	}

}
