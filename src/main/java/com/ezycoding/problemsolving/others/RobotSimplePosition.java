package com.ezycoding.problemsolving.others;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RobotSimplePosition {

	static void robotPosition(String move) {
		int x = 0, y = 0;
		char[] cmd = move.toCharArray();
		for (char c : cmd) {
			switch (c) {
			case 'U':
				y++;
				break;
			case 'D':
				y--;
				break;
			case 'L':
				x--;
				break;
			case 'R':
				x++;
				break;
			default:
			}
			/*
			 * if (c == 'U') { y++; } else if (c == 'D') { y--; } else if (c == 'L') { x--;
			 * } else if (c == 'R') { x++; }
			 */
		}
		System.out.println(x + "," + y);
	}

	static void robotPosition2(String move) {
		List<String> cmd = Arrays.asList(move.split(""));

		Map<String, Long> map = cmd.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println((map.get("R") - map.get("L")) + "," + (map.get("U") - map.get("D")));
	}

	public static void main(String[] args) {
		robotPosition("UDDLLRUUUDUURUDDUULLDRRRR");
		// robotPosition2("UDDLLRUUUDUURUDDUULLDRRRR");
	}
}
