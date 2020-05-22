package com.ezycoding.problemsolving.others;

public class RobotClockAntiClockRotation {

	static void robotPosition(String cmd) {
		char currDir = 'E';
		int angel = 0;
		int x = 0, y = 0;
		for (int i = 0; i < cmd.length(); i++) {
			char c = cmd.charAt(i);
			if (c == 'C' || c == 'A') {
				if (c == 'C') {
					angel += -90;
				} else {
					angel += 90;
				}
				angel = angel % 360;

				if (angel == 0) {
					currDir = 'E';
				} else if (angel == 90 || angel == -270) {
					currDir = 'N';
				} else if (angel == 180 || angel == -180) {
					currDir = 'W';
				} else if (angel == 270 || angel == -90) {
					currDir = 'S';
				}
			} else {
				if (c == 'F') {
					if (currDir == 'E') {
						x++;
					} else if (currDir == 'W') {
						x--;
					} else if (currDir == 'N') {
						y++;
					} else if (currDir == 'S') {
						y--;
					}
				} else if (c == 'B') {
					if (currDir == 'E') {
						x--;
					} else if (currDir == 'W') {
						x++;
					} else if (currDir == 'N') {
						y--;
					} else if (currDir == 'S') {
						y++;
					}
				}
			}

		}
		System.out.print(x + ":" + y);
	}

	public static void main(String[] args) {
		robotPosition("ACFB");
	}
}
