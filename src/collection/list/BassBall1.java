package collection.list;

import java.util.ArrayList;
import java.util.Scanner;

public class BassBall1 {

	public static void main(String[] args) {
		ArrayList<Integer> numList = new ArrayList<>();
		for (int i = 0; i < 4; i++) {
			int ranNum = (int) (Math.random() * 9) + 1;
			if (numList.indexOf(ranNum) == -1) {
				numList.add(ranNum);
			} else {

				i--;
			}
		}

		System.out.println("numList : " + numList);
//		int[] nums = new int[] { 1, 2, 3 };
		int bCnt = 0;
		int sCnt = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("번호 입력 : ");
		String [] numStr = scan.nextLine().split(",");
		int[]nums = new int[4];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = Integer.parseInt(numStr[i]);
		}
		while(sCnt!=3) {
		for (int i = 0; i < nums.length; i++) {
			if (numList.indexOf(nums[i]) != -1) {
				if (i==numList.indexOf(nums[i])) {
					sCnt ++;
				}else {
					bCnt++;
				}
			} 
			}
		if(sCnt + bCnt ==0) {
			System.out.println("아웃!");
		}else {
			System.out.println(sCnt + "S, " + bCnt + "B");
		}
		}
			System.out.println("gameover : "+ numList);
	
//		for (int i = 0; i < nums.length; i++) {
//			if (numList.indexOf(nums[i]) != -1) {
//				if (i==numList.indexOf(nums[i])) {
//					System.out.println("1S");
//				}else {
//					System.out.println("1B");
//				}
//			} else {
//				System.out.println("out");
//			}
//		}

	}
}
