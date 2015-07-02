package algorithm.dpTest;

import com.cqupt.algorithm.dp.CoinProblem;

public class CoinProblemTest {
	public static void main(String[] args) {
		CoinProblem coinProblem = new CoinProblem();
		int[] coins = { 2, 3, 5 };
		System.out.println(coinProblem.solution(coins, 11));
	}
}
