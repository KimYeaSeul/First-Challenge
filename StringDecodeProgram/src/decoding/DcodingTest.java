package decoding;

import java.util.Scanner;

public class DcodingTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String encodeVal;
		String decodeVal;
		
		System.out.print("입력 : ");
		encodeVal = sc.next();
		
		System.out.println(encodeVal.length());
		
		DecodingP dp = new DecodingP(encodeVal);
//		decodeVal = dp.getdeP(encodeVal);
		System.out.println(" DcodingTest File ");
//		dp.getdeP(encodeVal);
//		System.out.println(decodeVal);
		
		sc.close();
		
	}

}
