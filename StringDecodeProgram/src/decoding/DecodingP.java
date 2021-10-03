package decoding;

import java.util.regex.Pattern;

public class DecodingP {
	
	String encodeVal="";
	String decodeVal="";
	ValidTest vt;
	String[] arr; // 문자열배열
	String[] bracket; // 괄호배열
	int[] bracketIndex; // 인덱스 배열

	String val = ""; // 반복되는 문자 추출
	
	public DecodingP(String encodeVal) {
		vt = new ValidTest(encodeVal); // 유효성 검사
		arr = vt.arr; // 문자열 배열
		bracket = vt.bracket; // 괄호 배열
		bracketIndex = vt.bracketIndex; // 인덱스 배열
	}
	
	// TODO : Upgrade Code
	public String getDecodeVal() {
		
		// 최초 반복 값 구하기
		for(int i = 1; i < bracket.length-1 ; i++ ) { 
			if(bracket[i].equals("[") && bracket[i+1].equals("]")) { // 괄호 배열이 [] 모양으로 연속으로 올 때
				val = arr[bracketIndex[i] + 1];
				int tttt = bracketIndex[i]-1; 
				int loopVal = Integer.parseInt(arr[tttt]); // [ 앞에 있는 숫자를 반복숫자로 인식해서
				for(int k = 0 ; k < loopVal ; k++) { 
					decodeVal += val; // 반복되는 숫자 구하기
				}
				
				// 숫자 구한 후 괄호 탐색 시 혼선이 생기지 않도록 초기화
				bracket[i] = "0"; 
				bracket[i+1] = "0";
			}
		}
		
		// 최초 반복값 이후 괄호 배열의 반을 잘라서 탐색
		int len = (bracket.length/2)-1;
		
		for(int i = len ; i >=0 ; i-- ) {
			if(bracket[i].equals("[")) { // 왼쪽으로 반복문을 돌 때, [ 를 만나면 
				int loopVal = Integer.parseInt(arr[bracketIndex[i]-1]); // 앞에 있는 숫자를 반복 숫자로 인식
				String newVal = ""; // 반복되는 값
				// 최초 decodeVal 앞에 문자가 있을때 문자열 넣어주기 ex) 3[ab4[c]]
				String nnewVal = "";
				if(!Character.isDigit(arr[bracketIndex[i]+1].charAt(0))) { 
					for(int j = bracketIndex[i]+1; j < bracketIndex[i+1]-1 ; j++) {
						nnewVal += arr[j];
					}
					decodeVal = nnewVal + decodeVal;
				}
				
				for(int l = 0 ; l < loopVal; l++) {
					newVal +=decodeVal;
				}
				decodeVal = newVal;				
				bracket[i] = "0";
			}
				
		}
		
		// 맨 앞에 문자열이 문자일 때
		if(Pattern.matches("^[a-z]*$", arr[0])) {
			decodeVal = arr[0] + decodeVal;
		}
		// 맨 뒤에 문자열이 문자일 때
		if(Pattern.matches("^[a-z]*$", arr[arr.length-1])) {
			decodeVal = decodeVal+arr[arr.length-1];
		}
	
		return decodeVal;
	}
}
