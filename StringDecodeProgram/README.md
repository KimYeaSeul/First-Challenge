# String Decoding Program !
#### 프로젝트 설명
- 상품코드를 인코딩하는 프로그램을 만들었습니다. 
- acccacccaccc => a4[c]a4[c]a4[c] => 3[a4[c]]
- 인코딩된 문자열의 디코딩 문자열을 반환하는 프로그램을 작성해주세요.

#### 규칙
- 입력되는 문자열은 숫자, 문자, 괄호로만 이루어져 있다.
- 입력되는 문자열의 길이 L은 0 < L < 128
- 숫자는 양의 정수이며 문자에는 숫자가 포함되지 않는다. ( 3a, 2[4] X )
	
#### 예제 입출력 
> 입력 :  3[a]z
> > 출력 : aaaz

> 입력 : 3[a4[c]]
> > 출력 : accccaccccacccc

> 입력 : 3[ab4[c]]
> > 출력 : abccccabccccabcccc

> 입력 : 3[a3[c]3[b]2[d]]
> > 출력 : acccbbbddacccbbbddacccbbbdd
 
