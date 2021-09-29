package highScore;

import java.util.Arrays;
import java.util.Scanner;

public class HighScoreTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x; // 말판 가로
		int y; // 말판 세로
		int[][] arr; // 말판 배열
		String str;  // 문자열 입력받는 변수
		String[] strArr; // 문자열 맵데이터 ,로 나누어서 저장하는 배열
		int[] intArr; // 저장된 문자열을 숫자로 저장하는 배열
		int mV = 0; // 순서 변수
		
		str = sc.next();
		strArr = str.split(",");
//		intArr = Arrays.stream(strArr).mapToInt(Integer::parseInt).toArray(); 
		intArr = new int[strArr.length];
		System.out.println(strArr.length);
		
		for( int i=0; i<strArr.length; i++) {
			intArr[i] = Integer.parseInt(strArr[i]);
			System.out.print(intArr[i]);
		}
		
		System.out.println("===========");
		x = sc.nextInt();
		y = sc.nextInt();
		
		arr = new int[x][y];		
		
		if(strArr.length != (x*y)) {
			System.out.println("문자열길이가 안맞아요");
		}else {
			for( int i = 0; i<x ; i++) {
				for(int j = 0; j<y; j++) {
					// 둘이 길이가 맞아야함. 예외처리좀 ㅠ
					arr[i][j] = intArr[mV];
					mV++;
				}
			}
			
			for(int i = 0; i<arr.length; i ++) {
				System.out.println(Arrays.toString(arr[i]));
			}
		}
		
//		for(int i = 2; i<10; i++) {
//			for( int j = 1; j < 10 ; j++) {
//				arr[i-2][j-1] = i*j;
//			}
//		}
//		
//		
		
		
		sc.close();
		
	}

}
