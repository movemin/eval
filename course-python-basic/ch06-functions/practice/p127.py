# 함수 정의
def greet_kw(greeting: str, name: str) -> str:
    """키워드 인자로 인사말과 이름을 받아 인사 문자열을 반환합니다.

    Args:
        greeting (str): 인사말
        name (str): 이름
    Returns:
        str: '{greeting}, {name}!'
    Examples:
        >>> greet_kw('안녕', '철수')
        '안녕, 철수!'
        >>> greet_kw('반가워', '영희')
        '반가워, 영희!'
        >>> greet_kw('Hello', 'Tom')
        'Hello, Tom!'
    """
    return f"{greeting}, {name}!"


# key=value 토큰을 dict 로 파싱합니다. 예: "greeting=안녕 name=철수" → opts={"greeting":"안녕","name":"철수"}
opts = {}
for token in input().split():
    k, v = token.split("=", 1)  # 값에 '='이 포함될 경우를 대비해 maxsplit=1 지정
    opts[k] = v

# ↓ 호출부 (수정하지 마세요) — opts 를 ** 로 풀어 키워드 인자로 전달
print(greet_kw(**opts))