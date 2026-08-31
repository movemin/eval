# 함수 정의
def make_profile(name: str, age: str) -> str:
    """이름과 괄호로 둘러싸인 나이가 문자열로 반환됩니다.
    
    Args:
        name (str): 이름
        age (str): 나이
    Returns:
        str: '이름(나이)'
    Examples:
        >>> make_profile('철수', '20')
        '철수(20)'
        >>> make_profile('영희', '25')
        '영희(25)'
        >>> make_profile('Tom', '30')
        'Tom(30)'
    """
    return f"{name}({age})"


# key=value 토큰을 dict 로 파싱합니다. 예: "name=철수 age=20" → opts={"name":"철수","age":"20"}
opts = {}
for token in input().split():
    k, v = token.split("=")
    opts[k] = v

# ↓ 호출부 (수정하지 마세요) — opts 를 ** 로 풀어 키워드 인자로 전달
print(make_profile(**opts))