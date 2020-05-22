package com.ezycoding.problemsolving.others;

public class RobotDirectionalMovement {

	static void robotPosition(String cmd, char initDir) {
		char currDir = initDir;
		int x = 0, y = 0;
		for (int i = 0; i < cmd.length(); i++) {
			char c = cmd.charAt(i);
			if (c == 'E' || c == 'W' || c == 'N' || c == 'S') {
				currDir = c;
			} else {
				if (c == 'F') {
					if(currDir == 'E') {
						x++;
					} else if(currDir == 'W') {
						x--;
					} else if(currDir == 'N') {
						y++;
					} else if(currDir == 'S') {
						y--;
					}
				} else if (c == 'B') {
					if(currDir == 'E') {
						x--;
					} else if(currDir == 'W') {
						x++;
					} else if(currDir == 'N') {
						y--;
					} else if(currDir == 'S') {
						y++;
					}
				}
			}
		}
		System.out.print(x+":"+y);
	}

	public static void main(String[] args) {
		robotPosition("FBFFEF",'N');
	}
}
