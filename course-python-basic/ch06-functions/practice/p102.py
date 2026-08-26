# 함수 정의
def introduce(name: str, age: int = 20, city: str = "서울") -> str:
    """이름과 나이, 도시를 입력받으면
    슬래시('/')로 구분된 문자열을 반환합니다.
    
    Args:
        name (str): 이름
        age (int): 나이 (기본값: 20)
        city (str): 도시 (기본값: '서울')
    Returns:
        str: 이름/나이/도시
    Examples:
        >>> introduce('철수')
        '철수/20/서울'
        >>> introduce('철수', 30)
        '철수/30/서울'
        >>> introduce('철수', 30, '부산')
        '철수/30/부산'
        >>> introduce('영희', 25, '대구')
        '영희/25/대구'
    """
    return f"{name}/{age}/{city}"


# 한 줄을 공백으로 나눕니다. 토큰 1/2/3 개에 따라 age, city 가 기본값으로 채워집니다. (age 는 정수)
parts = input().split()

# 토큰 개수에 따라 명시적으로 int 변환 후 호출 → 타입 힌트(age: int)와 실제 동작 일치
if len(parts) == 1:
    print(introduce(parts[0]))
elif len(parts) == 2:
    print(introduce(parts[0], int(parts[1])))  # age를 정수로 변환
else:
    print(introduce(parts[0], int(parts[1]), parts[2]))  # age를 정수로 변환