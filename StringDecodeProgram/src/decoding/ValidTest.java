package decoding;

import java.util.regex.Pattern;

public class ValidTest {

	String encodeVal;
	String[] arr;
	String[] bracket;
	int[] bracketIndex;
	int numOfBracket=0;

	String errVal="";
	
	public ValidTest() { } 
	
	public ValidTest(String encodeVal){
		splitString(encodeVal); // encodeVal을 문자열 배열로 나누어 반환
		lengthTest(encodeVal); // 문자열 유효성 검사 시작 : 길이 -> 문자열 규칙	
		arrOfBracket(); // 괄호 배열 및 괄호인덱스 값 배열 생성
	}
	
	public String[] splitString(String str) {
		arr = str.split("");
		return arr;
	}

	public void lengthTest(String str) {
		if(str.length() > 0 && str.length() < 128 ) { // 문자열 길이가 맞는지 확인
			if( !stringTest(str)) { // 문자열이 규칙과 맞는지 확인
				errorV(errVal);	
			}
		} else if(str.length() <= 0 ){
			errorV(" 문자열을 입력하세요.");			
		}
		else if(str.length() >= 128 ){
			errorV(" 문자열을 128자 이내로 입력하세요.");			
		}
	}
	
	public boolean stringTest(String str) {
		
		if(arr[0].equals("[") || arr[0].equals("]")) {
			errVal += "문자열 맨 앞에 괄호가 올 수 없습니다.";
		}else if(((!str.matches(".*[\\[\\]].*"))) && (str.matches("^.*[0-9].*$"))) {
			errVal += "문자열에 괄호가 없는데 숫자가 있을 수 없습니다.";
		}else if((!str.matches("^.*[a-z].*$"))) {
			errVal += "문자열에 문자를 넣어주세요.";
		}else if(str.matches(".*[\\-].*")){
			errVal += "음수는 올 수 없습니다.";
		}else {
			for(int i=0; i<arr.length; i++) {
				if(Pattern.matches("[\\[]", arr[i])) {
					// [ 일때 앞에는 무조건 숫자, 뒤에는 무조건 문자가 와야됨
					if(!Pattern.matches("^[0-9]*$", arr[i-1]) || !Pattern.matches("^[a-z]*$", arr[i+1])) {
						errVal += arr[i-1] + arr[i] + arr[i+1]+"는 올바르지 않습니다.";
					}else {
						numOfBracket++;
					}
				}else if(Pattern.matches("[\\]]", arr[i])) {
					numOfBracket++;
				}
			}
		}
		
		if(!errVal.isEmpty()) {
			return false;
		}else return true;
	}

	// TODO : 괄호 갯수가 맞지 않을 때 예외처리 필요 ex) [[[] , [[] ...
	public void arrOfBracket(){
		bracket = new String[numOfBracket];
		bracketIndex = new int[numOfBracket];
		int q = 0;
		for(int j = 0; j < numOfBracket; j++) {
			for( int i = q; i < arr.length ; i++) {
				if(Pattern.matches("[\\[\\]]", arr[i])){
					q = i+1;
					bracket[j] = arr[i];
					bracketIndex[j] = i;
					break;
				}
			}
		}
	}
	
	public void errorV(String str) {
		System.out.println(str);
		System.out.println("====== 프로그램을 다시 시작해 주세요. ======");
		System.exit(0);
	}
}
