# 전역 status 시작값 "대기". 설정할 상태들을 순서대로 읽습니다. 예: "진행 완료" → commands=["진행","완료"]
# 전역변수를 맨 위에 두어 힌트 제공
status = "대기"

# 함수 정의
def set_status(new: str) -> None:
    """
    설정할 상태를 넣으시면 전역변수인 현재 상태가 업데이트 됩니다

    Args:
        new (str): 설정할 상태
    Returns:
        None: 반환값 없음
    """
    global status
    status = new

# 현재 상태 입력받기
commands = input().split()

# 함수 호출: 모든 상태를 순서대로 호출해 전역변수를 단계적으로 업데이트한다
for cmd in commands:
    set_status(cmd)

# 함수를 호출한 전역변수의 결과 출력
print(status)