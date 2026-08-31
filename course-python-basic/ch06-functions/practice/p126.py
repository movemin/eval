# 함수 정의
def list_keys(**kwargs: str) -> str:
    """키워드를 오름차순으로 정렬하여 ','를 간격으로 반환합니다.
    
    Args:
        kwargs (dict[str, str]): 키워드와 인자
    Returns:
        str: ','를 간격으로 키워드 오름차순 정렬
    Examples:
        >>> list_keys(b='2', a='1', c='3')
        'a,b,c'
        >>> list_keys(z='1', m='2')
        'm,z'
        >>> list_keys(single='1')
        'single'
    """
    return ','.join(sorted(kwargs))  # kwargs를 바로 sorted()에 전달


# key=value 토큰을 dict 로 파싱합니다. 예: "b=2 a=1" → opts={"b":"2","a":"1"}
opts = {}
for token in input().split():
    k, v = token.split("=")
    opts[k] = v

# ↓ 호출부 (수정하지 마세요) — opts 를 ** 로 풀어 키워드 인자로 전달
print(list_keys(**opts))