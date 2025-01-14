package chap02_기본자료구조;

import java.util.Scanner;

//배열 요소의 최댓값 나타내기(값을 입력 받는다)

public class MaxOfAraay {
	//배열 a의 최댓값 구하여 반환
	static int maxOf(int[]a){
		int max = a[0];
		for(int i =1; i<a.length; i++) {
			if(a[i] > max)
				max = a[i];
		}
		return max;
	}

	public static void main(String[] args) {
		System.out.println("키의 최댓값을 구합니다");

		Scanner input = new Scanner(System.in);
		System.out.println("사람 수 : " );
		int num = input.nextInt();

		int[] height = new int[num];

		for(int i =0;i<num;i++) {
			System.out.print("height[" + i + "] : ");
			height[i] = input.nextInt();
		}
		System.out.println("최댓값은 " + maxOf(height)+ "입니다");
	}
}
