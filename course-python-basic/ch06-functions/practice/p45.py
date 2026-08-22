# 함수 정의
# 함수는 호출할 때 살아있으므로 맨 위에 올려놓음으로써 가독성 강화
def increase():
    """
    호출하시면 전역변수 count가 1씩 늘어납니다.

    Returns: None    
    """
    global count
    count += 1  # 변수 값 변경은 읽기와 다르게 전역변수 선언해줘야 가능

# 전역 count 시작값 0. 호출 횟수 n 을 입력에서 읽습니다. 예: "5" → n=5
count = 0
n = int(input())

# 반복문으로 n번 호출
for _ in range(n):
    increase()

# 최종 count 출력
print(count)