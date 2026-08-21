# 함수 정의
def sec_to_str(sec: int) -> str:
    """초 단위의 정수를 입력하시면 분과 초의 문자열로 반환합니다.
    
    Args:
        sec (int): 초
    Returns:
        str: 분 초
    Examples:
        >>> sec_to_str(130)
            '2분 10초'
        >>> sec_to_str(0)
            '0분 0초'
        >>> sec_to_str(59)
            '0분 59초'
    """
    minutes = sec // 60
    sec %= 60
    return f"{minutes}분 {sec}초"

# 초 입력
sec = int(input())

# 함수 호출 및 출력
print(sec_to_str(sec))