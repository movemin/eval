# 함수 정의
def sum_avg(nums: list[int]) -> tuple[int, int]:
    """정수 리스트를 입력하면 그 리스트의 합과 평균이 튜플 형식으로 반환됩니다.
    
    Args:
        nums(list[int]): 정수 리스트
    Returns:
        tuple[int, int]: 합, 평균
    Examples:
        >>> sum_avg([1, 2, 3, 4])
        (10, 2)
        >>> sum_avg([10])
        (10, 10)
    """
    total = sum(nums)  # 두 번 cpu 낭비 방지
    return total, total // len(nums)  # python 관례에 따라 쉼표로 작성


# 합과 평균을 구할 정수 리스트를 입력받고 함수를 호출하여 결과값 출력
if __name__ == '__main__':
    nums = [int(x) for x in input().split()]
    print(*sum_avg(nums))  # python 관례에 따라 언패킹하여 가독성 상승