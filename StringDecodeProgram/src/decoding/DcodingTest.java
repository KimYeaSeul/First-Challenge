package decoding;

import java.util.Arrays;
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
//		System.out.println(dp);
//		System.out.println(" DcodingTest File ");
//		dp.getdeP(encodeVal);
//		System.out.println(decodeVal);
		
		sc.close();
		
		//괄호를 찾고 괄호 다음의 괄호를 찾고 그 안에 문자열을 괄호 앞에 있는숫자만큼 반복    3[a4[c]]
//		 3[a3[c]3[b]2[d]] 3[a3[c3[b]]] 3[3[a3[c]3[b]2[d]]]
		
//		int[] arr = {3,1,6,5,2,8,4};
//        int[] newArr = null;
//        int elementToBeDeleted = 5;
//        System.out.println("Original Array is: "+Arrays.toString(arr));
//
//        for (int i = 0; i < arr.length-1; i++) {
//            if(arr[i] == elementToBeDeleted){
//                newArr = new int[arr.length - 1];
//                for(int index = 0; index < i; index++){
//                    newArr[index] = arr[index];
//                }
//                for(int j = i; j < arr.length - 1; j++){
//                    newArr[j] = arr[j+1];
//                }
//                break;
//            }
//        }
//        System.out.println("New Array after deleting element = "+elementToBeDeleted+" and shifting: "+ Arrays.toString(newArr));
    }
}
