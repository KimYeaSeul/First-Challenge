package highScore;

import java.util.Arrays;

public class ValidTest {
	
	public ValidTest() {}
	public ValidTest(int val, String[] strArr, int[] intArr, int[][] arr){
		System.out.println("===========");
		if(strArr.length < val) {
			for( int i = intArr.length ; i< strArr.length ; i++) {
				intArr[i] = 0;
				System.out.print(intArr[i] + strArr.length + val);
			}
		}else {
			for(int i = 0; i<arr.length; i ++) {
				System.out.println(Arrays.toString(arr[i]));
			}
		}
	}
}
