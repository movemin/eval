# 함수 정의
def max_value_key(**kwargs: int) -> str:
    """키워드 인자들 중 가장 큰 인자를 가진 정수의 키워드를 반환합니다.
    
    Args:
        kwargs (dict[str, int]): 키워드와 인자
    Returns:
        str: 해당 최대값의 키워드
    Examples:
        >>> max_value_key(a=3, b=7, c=5)
        'b'
        >>> max_value_key(x=10, y=2)
        'x'
        >>> max_value_key(first=1, second=2, third=3)
        'third'
        >>> max_value_key(a=-5, b=-1, c=-9)
        'b'
        >>> max_value_key(only=42)
        'only'
    """

    # 인덱스 슬라이싱으로 불러와서 반환
    return max(kwargs, key=kwargs.get)

# key=value 토큰을 dict 로 파싱합니다(값은 정수). 예: "a=3 b=7" → opts={"a":3,"b":7}
opts = {}
for token in input().split():
    k, v = token.split("=")
    opts[k] = int(v)



# ↓ 호출부 (수정하지 마세요) — opts 를 ** 로 풀어 키워드 인자로 전달
print(max_value_key(**opts))