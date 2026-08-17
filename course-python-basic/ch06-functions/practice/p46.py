# 전역 total 시작값 0
total = 0

# 함수 정의
def add(n: int) -> None:
    """
    호출하시면 전역변수인 total이 인자만큼 누적합됩니다.

    Returns: None
    """
    global total
    total += n

# 전역 total 시작값 0. 더할 정수들을 리스트로 읽습니다. 예: "1 2 3 4" → nums=[1, 2, 3, 4]
numbers = [int(x) for x in input().split()]

# 반복문으로 요소값을 인자로 하여 함수 호출
for num in numbers:
    add(num)

# 함수를 여러번 호출한 결과의 전역변수 출력
print(total)