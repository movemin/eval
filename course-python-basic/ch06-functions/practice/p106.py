# 함수 정의
def build_tag(name: str, level: int = 1) -> str:
    """이름과 마크다운 태그 레벨을 입력하시면
    마크다운의 레벨만큼 #, 그 뒤에는 이름이 반환됩니다.
    
    Args:
        name (str): 제목
        level (int): 태그 개수
    Returns:
        str: 제목 태그
    Examples:
        >>> build_tag('title')
        '#title'
        >>> build_tag('title', 3)
        '###title'
        >>> build_tag('note', 0)
        'note'
        >>> build_tag('x', 5)
        '#####x'
    """
    # level 이 음수면 0으로 보정 (방어 코드 추가)
    level = max(0, level)
    return "#" * level + name


# 한 줄을 공백으로 나눕니다. 토큰이 1개면 기본 레벨(1), 2개면 둘째 값(정수)이 레벨입니다.
parts = input().split()

# 인자값의 개수에 따라 호출 후 출력
if len(parts) == 1:
    print(build_tag(parts[0]))
else:
    print(build_tag(parts[0], int(parts[1])))