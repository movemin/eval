# 함수 정의
def check_pass(score: int, pass_line: int = 60) -> str:
    """점수와 합격 커트라인을 입력받아
    합격 판정의 결과를 반환합니다.
    
    Args:
        score (int): 점수
        pass_line (int): 합격 커트라인
    Returns:
        str: 합격 여부 결과
    Examples:
        >>> check_pass(70)
        '합격'
        >>> check_pass(50)
        '불합격'
        >>> check_pass(70, 80)
        '불합격'
        >>> check_pass(80, 80)
        '합격'
        >>> check_pass(59)
        '불합격'
    """

    # 삼항 연산자를 활용하여 간결하게 작성하여 가독성 향상
    return "합격" if score >= pass_line else "불합격"


# 한 줄을 공백으로 나눕니다. 토큰이 1개면 기본 커트라인(60), 2개면 둘째 값이 커트라인입니다. (정수)
parts = input().split()

# 함수 호출시 리스트를 컴프리헨션으로 각 요소 정수로 바꾼 뒤 언패킹하여 각 인자값에 선언
# 함수의 반환값 출력
print(check_pass(*[int(part) for part in parts]))