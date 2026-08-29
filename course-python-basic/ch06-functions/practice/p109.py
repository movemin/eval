# 함수 정의
def count_args(*args: int) -> int:
    """인자 개수를 세는 함수입니다.
    
    Args:
        *args: 인자(들)
    Returns:
        int: 인자 개수
    Examples:
        >>> count_args(1, 2, 3)
        3
        >>> count_args(5)
        1
        >>> count_args(1, 2, 3, 4, 5, 6)
        6
    """
    return len(args)


# 입력을 정수 리스트로 만듭니다. 예: "1 2 3" → nums=[1, 2, 3]
nums = [int(x) for x in input().split()]

# ↓ 호출부 (수정하지 마세요)
print(count_args(*nums))