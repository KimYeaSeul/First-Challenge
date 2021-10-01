package decoding;

import java.util.regex.Pattern;

public class DecodingP {
	
	String encodeVal;
	String decodeVal1;
	String decodeVal2;
	ValidTest vt;
	String[] arr; // 문자열배열
	String[] arr2; // 괄호배열
	int[] arr3; // 인덱스 배열

	String val = "";
	int p = 0;
	
	public DecodingP(String encodeVal) {
		vt = new ValidTest(encodeVal); // 유효성 검사
		arr = vt.splitString(encodeVal);
//
//		System.out.println(arr.length);
//		for(int i = arr.length-1 ; i >= 0 ; i--) {
//			System.out.println(arr[i]);
//		}
		vt.isValid();
		arr2 = vt.bracket;
		arr3 = vt.bracketIndex;
		
		deP4(arr);
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
	
	public void deP(String[] encodeVal) {
		for(int i = 0; i < arr2.length-1 ; i++ ) {
			if(!arr2[i].equals(arr2[i+1])) { // [] 
				System.out.print(arr3[i]);
				System.out.println(arr3[i+1]);
				String val = ""; 
				for(int j=arr3[i]+1 ; j < arr3[i+1] ; j++) {
					val += arr[j];
					System.out.println(val);
				}
				int loopVal = Integer.parseInt(arr[i-1]);
				String newVal = "";
				for(int k = 0 ; k < loopVal+1 ; k++) {
					newVal += val;
				}
				System.out.println(newVal);
//				decodeVal
			}
		}
	}
	
	int pV;
	String newVal = "";
	boolean flag;
	public void deP2(String[] encodeVal) {
//		int len = arr2.length / 2;
//		for(int i = 0; i < len ; i++ ) {
		for(int i = 0; i < arr2.length; i++) {
			System.out.println("i값은 : " + i);
			if(flag) { break; }
			for(int j = i+1 ; j < arr2.length-1 ; j++ ) {
				System.out.println("j값은 : " + j);
//				if(i >= arr2.length-p) {
				pV = j+p;
				System.out.println("j+p값은 : " + pV);
				if(pV >= arr2.length-1) {
					System.out.println("k123값은 : " + arr2[arr2.length-1]);
					arr2[arr2.length-1] = "0";
					flag=true;
					break;
				}else {
//					int st = arr3[j-2];
//					int end = arr3[j-1];
					for(int w=pV-1; w==0;w--) {
						if(arr2[pV].equals("]") && arr2[w].equals("[")){
							System.out.println("k값은 : " + arr2[pV]);
//							for(int l=arr3[j-1]+1 ; l < arr3[pV] ; l++) {
//								val += arr[l]+newVal;
//								System.out.println("괄호안 반복문자는 " + val);
//							}
//							int tttt = arr3[pV-1];
//							int loopVal = Integer.parseInt(arr[tttt-1]);
//							for(int k = 0 ; k < loopVal ; k++) {
//								newVal += val;
//							}
//							System.out.println("괄호안 반복문자는 " + newVal);
//							
//							if((end-st) != 1) {
//								for( int n = st+1; n < end-1; n++ ) {								
//									System.out.println("dmfidmfidmfi"+arr[n]);
//									newVal = arr[n]+newVal;
//								}
//								System.out.println("dmfidmfidmfi   "+newVal);
//							}
//							arr2[pV] = "0";
//						}else {
//							System.out.println("으");
						}
					}
				}
			}
			p += 3;
			
//			if(!arr2[i].equals(arr2[i+1])) { // [] 
//				System.out.print(arr3[i]);
//				System.out.println(arr3[i+1]);
//				

//				int loopVal = Integer.parseInt(arr[i-1]);
//				String newVal = "";
//				for(int k = 0 ; k < loopVal+1 ; k++) {
//					newVal += val;
//				}
//				System.out.println(newVal);
////				decodeVal
//			}
		}
	}
	
	int st;
	int end;
	String vall="";
	public void deP3(String[] encodeVal) {
		for(int i = 0; i < arr2.length; i++) {
			System.out.println("i =" + i);
			if(arr2[i].equals("]")) {
				for(int w=i-1; w >= 0;w--) {
					System.out.println("w = " +w);
					if(arr2[w].equals("[")){
						if(w == 0) {
//							for(int k = 0; k < arr3[w]-1 ; k++) {
//								vall += arr[k];
							System.out.println("w=0 arr2[w] " + arr3[w] );
//							}
						}else {
							st = arr3[w];
							end = arr3[w]-2;
							for(int j = st+1; j<end; j++) {
								vall += arr[j];
							}
	//						vall += newVal;
							System.out.println("vall  " + vall );
	//						System.out.println("arr2[w] " + arr2[w] );
							arr2[w] = "0";
							flag = true;
							break;
						}
					}
				}
			}	
		}
	}
	
	String newVval="";
	int loopVal;
	public void deP4(String[] encodeVal) {
		for(int i = 1; i < arr2.length-1 ; i++ ) {
			if(arr2[i].equals("[") && arr2[i+1].equals("]")) { // [] 
				val = arr[arr3[i] + 1];
				int tttt = arr3[i]-1;
				int loopVal = Integer.parseInt(arr[tttt]);
				for(int k = 0 ; k < loopVal ; k++) {
					newVval += val;
				}
				System.out.println(val);
				System.out.println(newVval);
//				if((arr3[i]-arr3[i-1])>2) {
//					int a = arr3[i];
//					int b = arr3[i-1];
//					for(int c = arr3[i]-2 ; c >= arr3[i-1]+1; c-- ) {
//						newVval = arr[c]+newVval;
//						System.out.println(newVval);
//					}
//				}
				arr2[i] = "0";
				arr2[i+1] = "0";
			}
		}
		int len = (arr2.length/2)-1;
//		System.out.println("len = "  + len);
		for(int i = len ; i >=0 ; i-- ) {
//			System.out.println(arr2[i]);
			if(arr2[i].equals("[")) {
				int a = Integer.parseInt(arr[arr3[i]-1]) ;
				System.out.println(a);
				String nnnvvv = "";
				if(!Character.isDigit(arr[arr3[i]+1].charAt(0))) {
					newVval = arr[arr3[i]+1] + newVval;
					System.out.println(arr[arr3[i]+1] + "  newvvv " + newVval);
				}
				
				for(int l = 0 ; l < a; l++) {
					nnnvvv +=newVval;
				}
				newVval = nnnvvv;
				
				
//				for(int l = len; l < arr2.length; l++) {
//					if(arr2[l].equals("]")) {
//						int aa = arr3[i]-1;
//						int bb = Integer.parseInt(arr[aa]);
////						
////						int a = arr3[i];
////						int b = arr3[i-1];
//						if(Character.isDigit(arr[0].charAt(0))) {
//							System.out.println("arr3[i] " + arr3[i]);
//							System.out.println("arr[i] " + arr[i]);
//							if(i==0) { break; }
//							else {
//								for(int c = arr3[i]-2 ; c > arr3[i-1]; c-- ) {
//									newVval = arr[c]+newVval;
//								}
//								System.out.println(newVval);
//							}
//////							if((arr3[i]-arr3[i-1])>2) {
//////							}
////						}
////							for(int c = arr3[i]-2 ; c >= arr3[1]; c-- ) {
////								newVval = arr[c]+newVval;
////								System.out.println(newVval);
////							}
////							System.out.println(arr3[i] + " " + arr3[i-1]);
//						}
//							
////						for( int n = 0; n < bb; n++) {
////							System.out.println("this is l    "+ bb);
////							newVal += newVval;
////						}
////						
						System.out.println("this is newVval    "+ newVval);
						arr2[i] = "0";
//						arr2[l] = "0";
//						break;
//					}
//				}
			}
				
		}
		if(!Character.isDigit(arr[0].charAt(0))) {
			newVval = arr[0] + newVval;
			System.out.println("this is last newVval    "+ newVval);
		}
	}
	
	public void getdeP(String encodeVal) {
//		
//		// 어떻게 디코드 할까요 돌아버리겠ㅅ뉑용
//		for(int i = arr.length-1 ; i >= 0 ; i--) {
//			if(Pattern.matches("[\\[]", arr[i])) {				
//				System.out.println(arr[i-1]);
//				for(int j = 0; j< (int)arr[i-1]; j++) {
//					System.out.print(arr[i]);
//				}
//			}
//		}		
	}
}
