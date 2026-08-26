# 함수 정의
def join_two(a: str, b: str, sep: str = "-") -> str:
    """두 인자에 각 단어를 넣으시면 두 단어 사이에 설정한 구분자가 포함된
    문자열을 반환합니다.
    
    Args:
        a (str): 구분자 앞에 오는 단어
        b (str): 구분자 뒤에 오는 단어
        sep (str): 구분자 (기본값: '-')
    Returns:
        str: a + sep + b 형태의 문자열
    Examples:
        >>> join_two('hello', 'world')
        'hello-world'
        >>> join_two('hello', 'world', '_')
        'hello_world'
        >>> join_two('a', 'b')
        'a-b'
        >>> join_two('x', 'y', '+')
        'x+y'
    """
    return a + sep + b


# 한 줄을 공백으로 나눕니다. 토큰이 2개면 기본 구분자("-"), 3개면 셋째 값이 구분자입니다.
parts = input().split()

# 함수 호출 및 결과값 출력 -> 언패킹을 활용하여 코드 길이 축소
print(join_two(*parts))