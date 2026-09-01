# 함수 정의
def sum_values(**kwargs: int) -> int:
    """임의의 키워드 인자를 받아 그 해당 인자들의 합을 구합니다.
    
    Args:
        kwargs (dict[str, int]): 키워드와 정수 인자(들)
    Returns:
        int: 정수 인자 합계
    Examples:
        >>> sum_values(a=1, b=2, c=3)
        6
        >>> sum_values(x=10)
        10
        >>> sum_values(p=5, q=5)
        10
        >>> sum_values(a=100, b=-50)
        50
        >>> sum_values(m=0, n=0)
        0
        >>> sum_values()
        0
    """
    return sum(kwargs.values())  # 딕셔너리 value만 가져와 내장 메서드로 간결하게 작성


# key=value 토큰을 dict 로 파싱합니다(값은 정수). 예: "a=1 b=2" → opts={"a":1,"b":2}
opts = {}
for token in input().split():
    k, v = token.split("=")
    opts[k] = int(v)

# ↓ 호출부 (수정하지 마세요) — opts 를 ** 로 풀어 키워드 인자로 전달
print(sum_values(**opts))