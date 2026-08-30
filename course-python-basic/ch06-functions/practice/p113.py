# 반환문을 파이썬 답게 짧게 하기 위해 내장 모듈 불러오기
import math

# 함수 정의
def product_all(*nums: int) -> int:
    """가변인자를 모두 곱한 결과값을 반환합니다.
    
    Args:
        nums (int): 곱할 정수(들)
    Returns:
        int: 가변 인자들을 모두 곱한 값
    Examples:
        >>> product_all(1, 2, 3, 4)
        24
        >>> product_all(5)
        5
        >>> product_all(3, 0, 5)
        0
    """
    return math.prod(nums)


# 입력을 정수 리스트로 만듭니다. 예: "1 2 3 4" → nums=[1, 2, 3, 4]
nums = [int(x) for x in input().split()]

# ↓ 호출부 (수정하지 마세요)
print(product_all(*nums))