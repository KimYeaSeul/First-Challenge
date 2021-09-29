package decoding;

import java.util.regex.Pattern;

public class ValidTest {

	// 다 구현하고  static써보기.! 왜써야하는지 생각해보고
	
	String encodeVal;
	private boolean isValid = true;
	String[] arr;
	
	public ValidTest() { } // 기본생성자 만든 이유는?
	
	public ValidTest(String encodeVal){
		splitString(encodeVal);
		stringTest(encodeVal);
		dataTest(encodeVal);
		lengthTest(encodeVal);		
	}
	
	public void splitString(String str) {
		arr = str.split("");
	}
	
	public void stringTest(String str) {
		for(String array : arr) {
			if(Pattern.matches("^[0-9]*$", array)) {
				// 숫자가 양의 정수인지 확인하는 함수
				System.out.println(array+ " 는 숫자입니다.");
				isValid = true;
			}else if(Pattern.matches("^[a-zA-Z]*$", array)){
				System.out.println(array+ " 는 영어입니다.(대소문자)");
				isValid = true;				
			}else if(Pattern.matches("[\\[\\]]", array)) {
				// [ 일때 앞에는 무조건 숫자, 뒤에는 무조건 문자가 와야됨
				// ] 일때 
				System.out.println(array+ " 는 괄호입니다....");
				isValid = true;
			}else{
				System.out.println(array);
			}
		}
	}
	
	public void dataTest(String str) {
		System.out.println("dataTest");
		if(isValid) isValid = true;		
	}
	
	public void lengthTest(String str) {
		if(str.length() > 0 && str.length() < 128 ) {
			System.out.println(" ==== 정상적 길이 ====");			
			isValid = true;
		} else if(str.length() <= 0 ){
			isValid = false;
			System.out.println(" 문자열을 입력하세요.");			
		}
		else if(str.length() >= 128 ){
			isValid = false;
			System.out.println(" 문자열을 128자 이내로 입력하세요.");			
		}
	}
	
	public boolean isValid(String str) {
		if(isValid) {
			System.out.println("isValid true");
			encodeVal = str;
		} else {
			System.out.println("isValid false ");
			encodeVal = "Wrong String!!";
		}
		
		return isValid;
	}
	
	public void getEncodeVal() {
		System.out.println(encodeVal);
	}
}
