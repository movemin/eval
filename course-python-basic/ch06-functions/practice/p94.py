# 함수 정의
# 위치인자 -> 키워드 인자 -> 가변 위치 인자 -> 가변 키워드 인자
def greet(name: str, greeting: str = "안녕하세요") -> str:
    """이름과 인사말을 입력하시면
    f'{greeting}, {name}님!' 이라는 문구가 반환됩니다.
    인사말의 기본값은 '안녕하세요' 입니다.

    Args:
        name (str): 이름
        greeting (str): 인사말
    Returns:
        str: 이름을 포함한 인사말
    Examples:
        >>> greet('철수')
        '안녕하세요, 철수님!'
        >>> greet('철수', '반가워')
        '반가워, 철수님!'
        >>> greet('민수', '좋은아침')
        '좋은아침, 민수님!'
    """
    return f"{greeting}, {name}님!"


# 한 줄을 공백으로 나눕니다.
parts = input().split()

# 토큰이 3개 이상인 경우를 방어적으로 처리: 앞 2개만 사용
# 각 파라미터에 해당 리스트 요소가 들어갈 수 있도록 언패킹하여 호출 뒤 결과값 출력
print(greet(*parts[:2]))