# 함수 정의
def average_values(**kwargs: int) -> int:
    """키워드 인자를 받아 인자들의 평균을 반환합니다.
    
    Args:
        kwargs (dict[str, int]): 키워드와 평균을 구할 정수 인자(들)
    Returns:
        int: 인자들의 평균값
    Examples:
        >>> average_values(a=2, b=4, c=6)
        4
        >>> average_values(x=10)
        10
        >>> average_values(p=1, q=2)
        1
        >>> average_values(a=5, b=5, c=5, d=5)
        5
    """

    # 딕셔너리 value값 두번 호출 방지
    values = kwargs.values()
    return sum(values) // len(values)


# key=value 토큰을 dict 로 파싱합니다(값은 정수). 예: "a=2 b=4 c=6" → opts={"a":2,"b":4,"c":6}
opts = {}
for token in input().split():
    k, v = token.split("=")
    opts[k] = int(v)

# ↓ 호출부 (수정하지 마세요) — opts 를 ** 로 풀어 키워드 인자로 전달
print(average_values(**opts))