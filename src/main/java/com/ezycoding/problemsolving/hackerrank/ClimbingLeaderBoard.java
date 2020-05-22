package com.ezycoding.problemsolving.hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*

Alice is playing an arcade game and wants to climb to the top of the leaderboard and wants to track her ranking. 
The game uses Dense Ranking, so its leaderboard works like this:

	1. The player with the highest score is ranked number  on the leaderboard.
	2. Players who have equal scores receive the same ranking number, and the next player(s) receive the immediately following ranking number.

Score: 					100 100 50 40 40 20 10
Alice score: 			5 25 50 120
Rank after each score: 	6 4 2 1

*/

public class ClimbingLeaderBoard {

	static int[] climbingLeaderboard(int[] scores, int[] alice) {
		int[] rank = new int[alice.length];
		Set<Integer> set = new HashSet<>();
		List<Integer> list = new ArrayList<>();
		for (int score : scores) {
			set.add(score);
		}

		int rankIndex = 0;

		for (int i = 0; i < alice.length; i++) {

			set.add(alice[i]);
			list = new ArrayList<>(set);

			Collections.sort(list, Collections.reverseOrder());

			for (int score : list) {
				rankIndex++;
				if (score == alice[i]) {
					rank[i] = rankIndex;
				}
			}
			set.remove(alice[i]);
			rankIndex = 0;
		}
		return rank;
	}

	public static void main(String[] args) {
		int[] scores = {100, 100, 50, 40, 40, 20, 10};
		int[] alice = {5, 25, 50, 120};
		int[] leaderBoard = climbingLeaderboard(scores, alice);
		
		for(int rank: leaderBoard) {
			System.out.println(rank);
		}
	}
}
