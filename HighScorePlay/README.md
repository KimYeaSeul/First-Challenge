# Find High Score !
#### 프로젝트 설명
- 2차원 배열(가로 x, 세로 y)로 이루어진 말판이 있습니다.
- 플레이어1은 왼쪽상단, 플레이어2는 오른쪽 상단에 말을 두고 시작합니다.
- 말은 자기 위치에서 아래 3칸(왼쪽아래, 아래, 오른쪽아래) 중에 한곳으로만 이동할수 있다.
- 두 말이 이동한 위치에 적힌 숫자(점수 s)의 총 합이 게임의 점수이다.
- 이때 얻을 수 있는 가장 높은 점수를 구하는 코드를 작성해주세요.

#### 규칙
- 말판의 범위는 2 < x , y < 50
- 각 칸의 점수의 범위는 -100 < s < 100
- 말은 말판 밖으로 나갈 수 없다.
- 두 말이 같은 칸으로 이동할 수는 있지만, 점수는 한명에게만 주어진다.
- 입력처리
	- 첫번째 입력 : 가로 x 값
	- 두번째 입력 : 세로 y 값
	- 세번째 입력 : 맵데이터 ,로 구분된 점수 s 값
	
#### 예제 입출력 
> 입력 :  
  3  
  4  
  3,1,1,2,5,1,1,5,5,2,1,1 
> >	 원래 출력 : 24   
> >  코드 출력 :   
    3 1 1 2   
    5 1 1 5   
    5 2 1 1   

#### 프로세스
- [X] 2차원 배열로 말판만들기
- [X] 말판 내 점수 값 받기 
	- 배열 수 보다 작을 시 0으로 채워주기
	- 배열 출력
- [ ] 중복값 및 규칙(로직) 찾기
	- 배열의 주소값으로 접근하는 방법 못찾음
	- 어떻게 값을 가지고 와야 하는지..
	- 행렬 덧셈? 이진트리 응용?
- [ ] 플레이어1, 2에 대한 로직..