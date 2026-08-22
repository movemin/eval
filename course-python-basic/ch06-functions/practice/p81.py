# 함수 정의
def rect(w: int, h: int) -> tuple[int, int]:
    """가로, 세로 길이를 인자값으로 받아 둘레와 넓이를 반환합니다.

    Args:
        w (int): 가로
        h (int): 세로
    Returns:
        tuple[int, int]: 둘레, 넓이
    Examples:
        >>> rect(4, 5)
        (18, 20)
        >>> rect(1, 1)
        (4, 1)
        >>> rect(7, 7)
        (28, 49)
    """
    return 2 * (w + h), w * h


# import시 방어코드
if __name__ == '__main__':
    w, h = [int(x) for x in input().split()]

    # 함수 호출 후 결과값 출력
    print(*rect(w, h))