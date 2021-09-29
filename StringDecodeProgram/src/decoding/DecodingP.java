package decoding;

import java.util.regex.Pattern;

public class DecodingP {
	
	String encodeVal;
	String decodeVal;
	ValidTest vt;
	String[] arr;
	
	public DecodingP(String encodeVal) {
		vt = new ValidTest(encodeVal);
//		arr = encodeVal.split("");
//
//		System.out.println(arr.length);
//		for(int i = arr.length-1 ; i >= 0 ; i--) {
//			System.out.println(arr[i]);
//		}
	}

//	public String getdeP(String encodeVal) {
//		System.out.println("====== getdeP start ======");
////		vt.splitString(encodeVal);
//		if(vt.isValid(encodeVal)) {
//			decodeVal = "유효성 통과한 인코딩 데이터";
//		}else { 
//			decodeVal = "유효성 통과 못한 인코딩 데이터";
//		}
//		return decodeVal;
//	}
	
	public void getdeP(String encodeVal) {
		arr = encodeVal.split("");
//		for(String array : arr) {
//			if(Pattern.matches("^[0-9]*$", array)) {
//				System.out.println(array+ " 는 숫자입니다.");
//			}else if(Pattern.matches("^[a-zA-Z]*$", array)){
//				System.out.println(array+ " 는 영어입니다.(대소문자)");
//			}else if(Pattern.matches("[\\[\\]]", array)) {
//				System.out.println(array+ " 는 괄호입니다....");
//			}else{
//				System.out.println(array);
//			}
//		}
		// 어떻게 디코드 할까요 돌아버리겠ㅅ뉑용
		for(int i = arr.length-1 ; i >= 0 ; i--) {
			if(Pattern.matches("[\\[]", arr[i])) {				
				System.out.println(arr[i-1]);
				for(int j = 0; j< (int)arr[i-1]; j++) {
					System.out.print(arr[i]);
				}
			}
		}
		
		
	}
}
