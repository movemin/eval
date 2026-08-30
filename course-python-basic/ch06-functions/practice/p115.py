# 함수 정의
def sum_positive(*nums: int) -> int:
    """가변 인자 중 양수만을 대상으로 합계를 반환합니다.
    
    Args:
        nums (int): 양수만을 선별할 대상인 정수(들)
    Returns:
        int: 양수들의 합
    Examples:
        >>> sum_positive(1, -2, 3, -4, 5)
        9
        >>> sum_positive(-1, -2, -3)
        0
        >>> sum_positive(0, 0, 5)
        5
    """
    return sum(num for num in nums if num > 0)  # 제너레이터 형식으로 간결하게 작성


# 입력을 정수 리스트로 만듭니다. 예: "1 -2 3" → nums=[1, -2, 3]
nums = [int(x) for x in input().split()]

# ↓ 호출부 (수정하지 마세요)
print(sum_positive(*nums))