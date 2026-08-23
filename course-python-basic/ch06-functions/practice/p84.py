# 함수 정의
def name_order(last: str, first: str) -> tuple[str, str]:
    """성과 이름을 차례대로 인자로 받으면 두 개가 뒤집힌 튜플을 반환합니다.
    
    Args:
        last (str): 성
        first (str): 이름
    Returns:
        tuple[str, str]: 이름, 성
    Examples:
        >>> name_order('김', '철수')
        ('철수', '김')
        >>> name_order('Kim', 'John')
        ('John', 'Kim')
    """
    return first, last


# input().split() 으로 두 칸을 나누고, 함수 호출 뒤 최종 결과값 출력
last, first = input().split()
print(*name_order(last, first))