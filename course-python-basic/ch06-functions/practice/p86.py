# 함수 정의
def to_hms(sec: int) -> tuple[int, int, int]:
    """초를 입력받으면 시, 분, 초로 튜플형식으로 반환됩니다.
    
    Args:
        sec (int): 초
    Returns:
        tuple[int, int, int]: 시, 분, 초
    Examples:
        >>> to_hms(3661)
        (1, 1, 1)
        >>> to_hms(0)
        (0, 0, 0)
        >>> to_hms(7325)
        (2, 2, 2)
    """

    # divmod를 활용해 몫과 나머지를 한 번에 구하는 Pythonic한 방식
    hours, remaining = divmod(sec, 3600)  # sec // 3600, sec % 3600 을 한 번에
    minutes, seconds = divmod(remaining, 60)  # remaining // 60, remaining % 60 을 한 번에

    # Python 관례에 따라 쉼표로 구분하여 가독성 향상
    return hours, minutes, seconds


# import시 무분별 실행 방지
if __name__ == '__main__':
    # 초를 정수 형태로 입력받고 함수를 호출하여 최종 결과값 출력
    sec = int(input())
    print(*to_hms(sec))  # Python의 특징을 살려서 언패킹함으로써 코드 줄이기