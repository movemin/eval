# 함수 정의
def welcome(name: str) -> None:
    """호출하면 인사메시지가 출력됩니다.
    
    Args:
        name (str): 이름
    Returns:
        None
    Examples:
        >>> welcome("철수")
        철수님 환영합니다
        >>> welcome("영희")
        영희님 환영합니다
    """
    print(f"{name}님 환영합니다")
    

if __name__ == "__main__":
    # input() 으로 이름 한 줄을 읽습니다.
    name = input()

    # 함수 호출: 읽기 -> 반환
    print(welcome(name))