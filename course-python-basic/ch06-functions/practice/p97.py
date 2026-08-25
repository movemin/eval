# 함수 정의
def repeat_text(text: str, times: int = 2) -> str:
    """문자열과 횟수를 입력받아 해당 문자열을 반복하는 값을 반환합니다.
    
    Args: 
        text (str): 반복하고자 하는 문자열
        times (int): 반복 횟수 (기본값: 2)
    Returns:
        str: 횟수만큼 반복된 문자열
    Examples: 
        >>> repeat_text('ab')
        'abab'
        >>> repeat_text('ab', 3)
        'ababab'
        >>> repeat_text('hi', 1)
        'hi'
        >>> repeat_text('x', 5)
        'xxxxx'
        >>> repeat_text('ab', 0)
        ''
    """
    return text * times


# 한 줄을 공백으로 나눕니다. 토큰이 1개면 기본 2회, 2개면 둘째 값(정수)이 반복 횟수입니다.
parts = input().split()

# 호출부에서 int 변환 처리 -> 함수의 타입 힌트(int)와 실제 전달 타입을 일치시킴
if len(parts) == 1:
    print(repeat_text(parts[0]))
else:
    print(repeat_text(parts[0], int(parts[1])))