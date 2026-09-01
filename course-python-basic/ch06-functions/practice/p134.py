# 함수 정의
def merge_to_string(**kwargs: str) -> str:
    """키워드 인자를 받아 ','를 구분자로 하여
    '키워드=인자값' 형식으로 반환합니다.
    
    Args:
        kwargs (str): 키워드와 인자
    Returns:
        str: '키워드1=인자값1,키워드2=인자값2,...,키워드n=인자값n' 형태의 문자열
    Examples:
        >>> merge_to_string(b='2', a='1')
        'a=1,b=2'
        >>> merge_to_string(name='tom', age='20')
        'age=20,name=tom'
        >>> merge_to_string(z='9')
        'z=9'
        >>> merge_to_string(c='3', a='1', b='2')
        'a=1,b=2,c=3'
    """
    # str(value)로 명시 변환 — 값이 정수/None 등이어도 안전하게 처리
    return ",".join(f'{key}={str(value)}' for key, value in sorted(kwargs.items()))


# key=value 토큰을 dict 로 파싱합니다(값은 문자열). 예: "b=2 a=1" → opts={"b":"2","a":"1"}
opts = {}
for token in input().split():
    k, v = token.split("=")
    opts[k] = v

# ↓ 호출부 (수정하지 마세요) — opts 를 ** 로 풀어 키워드 인자로 전달
print(merge_to_string(**opts))