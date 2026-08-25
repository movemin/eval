# 함수 정의
def final_price(price: int, discount: int=0) -> int:
    """가격(price)과 (선택적으로) 할인액(discount)을 입력받아 
    최종 금액을 반환합니다.
    
    Args:
        price (int): 가격
        discount (int): 할인액
    Returns:
        int: 최종 결제 금액(가격 - 할인액)
    Examples:
        >>> final_price(1000)
        1000
        >>> final_price(500)
        500
        >>> final_price(1000, 200)
        800
        >>> final_price(2000, 2000)
        0
    """
    return price - discount


# 가격, 할인액 리스트 입력받기
parts = input().split()

# 함수 호출 및 최종 결과값 출력
# 각 요소 언패킹하여 가격과 할인액에 인자값으로 넣는다.
# 만약 요소가 하나일 경우 할인액 기본값은 0으로 한다.
print(final_price(*map(int, parts[:2])))