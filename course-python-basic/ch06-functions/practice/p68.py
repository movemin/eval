# int(input()) 으로 정수 한 개를 읽습니다. 예: 입력이 "95" 이면 score == 95


# [알고리즘]
# 함수 안에서 점수에 따라 조건문으로 등급 분류 후 등급 반환
# 함수를 호출하여 반환값 출력

# 함수 정의
def grade(score: int) -> str:
    """점수를 넣으면 등급이 나옵니다.

    Args:
        score (int): 점수
    Returns:
        str: 등급
    Example:
        >>> grade(90)
        'A'
    """
    if score >= 90:
        return "A"
    elif score >= 80:
        return "B"
    elif score >= 70:
        return "C"
    else:
        return "F"

# 입력 읽기 및 함수 호출 출력
score = int(input())
print(grade(score))