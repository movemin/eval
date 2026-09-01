# 함수 정의
def sum_positive_values(**kwargs: int) -> int:
    """키워드 인자를 받으면 양수만을 선별하여 합계를 반환합니다.
    
    Args:
        kwargs (dict[str, int]): 키워드와 정수 인자
    Returns:
        int: 정수 인자 중 양수만의 합계
    Examples:
        >>> sum_positive_values(a=5, b=-3, c=2)
        7
        >>> sum_positive_values(x=-1, y=-2)
        0
        >>> sum_positive_values(p=10, q=20)
        30
        >>> sum_positive_values(a=0, b=5, c=-5)
        5
    """
    return sum(value for value in kwargs.values() if value > 0)


# key=value 토큰을 dict 로 파싱합니다(값은 정수). 예: "a=5 b=-3" → opts={"a":5,"b":-3}
opts = {}
for token in input().split():
    k, v = token.split("=")
    opts[k] = int(v)

# ↓ 호출부 (수정하지 마세요) — opts 를 ** 로 풀어 키워드 인자로 전달
print(sum_positive_values(**opts))