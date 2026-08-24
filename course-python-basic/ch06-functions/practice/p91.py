# 함수 정의
def abs_sign(n: int) -> tuple[int, int] | tuple[int, str]:
    """정수를 입력하시면 절댓값과 부호를 튜플로 반환합니다.

    Args:
        n (int): 절댓값과 부호를 알아낼 정수
    Returns:
        tuple[int, int | str]:
            절댓값(int)과 부호 문자열('양수' | '음수' | 0)의 튜플.
            예: (5, '음수'), (7, '양수'), (0, 0)
    Examples:
        >>> abs_sign(-5)
        (5, '음수')
        >>> abs_sign(7)
        (7, '양수')
        >>> abs_sign(0)
        (0, 0)
    """
    # 절댓값과 부호 모두 0처리
    if n == 0:
        return n, n
    # abs() 내장 함수를 사용해 부동소수점 오차 없이 정확한 절댓값 계산
    return abs(n), "양수" if n > 0 else "음수"


# int(input()) 으로 정수 한 개를 읽습니다.
n = int(input())

# 함수 호출 및 언패킹하여 결과값 출력
print(*abs_sign(n))