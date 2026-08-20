# 함수 정의
def repeat(char: str, count: int) -> str:
    """문자열을 입력 횟수만큼 반복한 문자열을 반환합니다

    Args:
        char (str): 반복할 문자열
        count (int): 반복 횟수 (0 이상 정수)
    Returns:
        str: 문자열 반복 결과값
    Examples:
        >>> repeat('ab', 3)
        'ababab'
        >>> repeat('ab', 0)
        ''
    """
    return char * count

# 문자와 횟수 입력 및 함수 호출 출력
char = input()
count = int(input())
print(repeat(char, count))