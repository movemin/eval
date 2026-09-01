# 함수 정의
def longest_value(**kwargs: str) -> str:
    """키워드 인자 중 가장 긴 값을 가진 인자를 반환합니다.
    
    Args:
        kwargs (dict[str, str]): 가장 긴 인자를 찾을 키워드와 문자열 인자
    Returns:
        str: 가장 긴 인자
    Examples:
        >>> longest_value(a='hi', b='hello', c='hey')
        'hello'
        >>> longest_value(x='cat', y='elephant')
        'elephant'
        >>> longest_value(one='a')
        'a'
        >>> longest_value(p='abc', q='de', r='fghi')
        'fghi'
        >>> longest_value(a='zoo', b='apple')
        'apple'
    """

    # key=len 을 사용하면 튜플 생성 없이 간결하게 최댓값을 구할 수 있음
    return max(kwargs.values(), key=len)


# key=value 토큰을 dict 로 파싱합니다(값은 문자열). 예: "a=hi b=hello" → opts={"a":"hi","b":"hello"}
opts = {}
for token in input().split():
    k, v = token.split("=")
    opts[k] = v

# ↓ 호출부 (수정하지 마세요) — opts 를 ** 로 풀어 키워드 인자로 전달
print(longest_value(**opts))