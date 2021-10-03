package decoding;

import java.util.Scanner;

public class DcodingTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String encodeVal;
		String decodeVal;
		
		System.out.print("입력 : ");
		encodeVal = sc.next();
		
		DecodingP dp = new DecodingP(encodeVal);
		decodeVal = dp.getDecodeVal();
		System.out.println("출력 : " + decodeVal);
		
		sc.close();
		
    }
}
