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
		
		System.out.println("======= 입 력 =======");
		x = sc.nextInt();
		y = sc.nextInt();
		str = sc.next();
		strArr = str.split(",");

		int val = x*y; // 9
//		intArr = Arrays.stream(strArr).mapToInt(Integer::parseInt).toArray(); 
		intArr = new int[val];
		
		System.out.println("====================");
		for( int i = 0; i < intArr.length ; i++ ) {
			if( i < strArr.length ) {
				intArr[i] = Integer.parseInt(strArr[i]);
			}else {
				intArr[i] = 0;
			}
//			System.out.print(intArr[i]);
		}
		
		arr = new int[x][y];
		
//		ValidTest vt = new ValidTest(val, strArr, intArr, arr);
		
		for( int i = 0; i<x ; i++) {
			for(int j = 0; j<y; j++) {
				arr[i][j] = intArr[mV];
				mV++;
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		sc.close();
		
	}

}
