# 함수 정의
def count_kwargs(**kwargs: str) -> int:
    """인자의 개수를 반환합니다.
    
    Args:
        kwargs (dict[str, str]): 키워드와 인자(들)
    Returns:
        int: 인자의 개수
    Examples:
        >>> count_kwargs(a='1', b='2', c='3')
        3
        >>> count_kwargs(x='5')
        1
        >>> count_kwargs(p='1', q='2', r='3', s='4')
        4
    """
    return len(kwargs)  # 내장 메서드를 활용하여 간결하게 작성


# key=value 토큰을 dict 로 파싱합니다. 예: "a=1 b=2" → opts={"a":"1","b":"2"}
opts = {}
for token in input().split():
    k, v = token.split("=")
    opts[k] = v

# ↓ 호출부 (수정하지 마세요) — opts 를 ** 로 풀어 키워드 인자로 전달
print(count_kwargs(**opts))