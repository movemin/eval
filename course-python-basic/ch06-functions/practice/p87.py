# 함수 정의
def evaluate(score: int) -> str:
    """점수를 입력받아 점수 검증 결과를 반환합니다.

    Args:
        score (int): 점수
    Returns:
        str: 점수 검증 결과
    Examples:
        >>> evaluate(85)
        '합격'
        >>> evaluate(50)
        '불합격'
        >>> evaluate(-5)
        '유효하지 않음'
        >>> evaluate(105)
        '유효하지 않음'
    """

    # return의 특징: 생명 주기를 끝낸다
    # 삼항 연산자와 조기 반환을 사용하여 잘못된 입력을 먼저 거른다.
    if not 0 <= score <= 100:
        return "유효하지 않음"
    return "합격" if score >= 60 else "불합격"


# 점수를 입력받고 함수를 호출하여 반환값 출력
score = int(input())
print(evaluate(score))