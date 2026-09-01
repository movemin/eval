# 함수 정의
def menu(name: str, *sides: str) -> str:
    """메인 메뉴와 사이드 메뉴를 입력하시면
    메인 메뉴와 괄호로 싸인 사이드 메뉴가 문자열로 반환됩니다.
    
    Args: 
        name (str): 메인 메뉴
        sides (str): 사이드 메뉴
    Returns:
        str: '메뉴 (사이드 메뉴1,사이드 메뉴2,...사이드 메뉴n)'
    Examples:
        >>> menu('비빔밥', '김치', '단무지')
        '비빔밥 (김치,단무지)'
        >>> menu('물')
        '물'
        >>> menu('피자', '콜라', '피클', '치즈')
        '피자 (콜라,피클,치즈)'
    """

    # 반환은 함수를 생명주기를 끝내는 것을 활용하여
    # 조건문 바깥에 반환을 하나 더 작성하여 코드 간결성 향상
    if sides:
        return f"{name} ({','.join(sides)})"
    return name


# 첫 토큰=대표 메뉴, 나머지=사이드. 예: "비빔밥 김치 단무지" → name="비빔밥", sides=["김치","단무지"]
raw = input().split()
name = raw[0]
sides = raw[1:]

# ↓ 호출부 (수정하지 마세요)
print(menu(name, *sides))