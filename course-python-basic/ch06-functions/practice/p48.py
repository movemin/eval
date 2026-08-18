# 첫 값=초기 잔액, 나머지=증감액. 예: "1000 100 -50 200" → balance=1000, changes=[100,-50,200]
parts = input().split()
balance = int(parts[0])
changes = [int(x) for x in parts[1:]]

# 함수 정의
def apply(amount: int) -> None:
    """
    호출하시면 전역변수인 잔액이 증감액이라는 변수에 
    리스트로 입력한 값만큼 증감됩니다.

    Args:
        amount (int): 단일 입출금 금액 (음수: 출금, 양수: 입금)

    Returns:
        None: 반환값 없음
    """
    global balance  # 전역변수의 값의 변경은 global을 선언해줘야 변경이 가능하다
    balance += amount

# 반복문으로 리스트 요소를 인자로하는 함수 호출
for amount in changes:
    apply(amount)

# 함수 호출을 함으로써 변경된 잔액 출력
print(balance)