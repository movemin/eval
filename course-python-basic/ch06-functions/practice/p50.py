# 전역 positive_count 시작값 0. 검사할 정수들을 리스트로 읽습니다. 예: "1 -2 3" → nums=[1, -2, 3]
numbers = [int(x) for x in input().split()]
positive_count = 0

# 함수 정의
def check(n: int) -> None:
    """
    호출하시면 인자가 양수일 경우에만 전역변수에 1이 더해집니다.

    Args:
        n (int): 정수
    """
    global positive_count
    if n > 0:
        positive_count += 1

# 입력 리스트의 요소를 인자로 하는 함수 반복문으로 호출
for number in numbers:
    check(number)

# 호출된 결과의 전역변수 출력
print(positive_count)