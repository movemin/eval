# 함수 정의
def rectangle_kw(width: int, height: int) -> int:
    """가로와 세로를 곱하여 넓이를 반환합니다.
    
    Args: 
        width (int): 가로
        height (int): 세로
    Returns:
        int: 넓이
    Examples:
        >>> rectangle_kw(4, 5)
        20
        >>> rectangle_kw(3, 7)
        21
        >>> rectangle_kw(1, 1)
        1
        >>> rectangle_kw(10, 0)
        0
    """
    return width * height


# key=value 토큰을 dict 로 파싱합니다(값은 정수). 예: "width=4 height=5" → opts={"width":4,"height":5}
opts = {}
for token in input().split():
    k, v = token.split("=")
    opts[k] = int(v)

# ↓ 호출부 (수정하지 마세요) — opts 를 ** 로 풀어 키워드 인자로 전달
print(rectangle_kw(**opts))