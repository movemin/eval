# 함수 정의
def average_args(*nums):
    """가변인자를 넣으면 평균값을 반환합니다.
    
    Args:
        *nums: 평균값들을 구할 정수(들)
    Returns:
        int: 평균값
    Examples:
        >>> average_args(1, 2, 3, 4)
        2
        >>> average_args(10)
        10
        >>> average_args(5, 5, 5)
        5
    """
    return sum(nums) // len(nums)  # 메서드를 사용하여 간결하게 반환문 작성