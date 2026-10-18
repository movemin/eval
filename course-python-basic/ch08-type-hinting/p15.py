from collections.abc import Mapping
from typing import get_type_hints

_STOCK_MAP = Mapping[str, int]           # 호출부가 사용하는 검사 기준입니다. 수정하지 마세요.


# 재고 합계 메서드
def total_stock(stock: Mapping[str, int]) -> int:
    """총 재고 량을 반환합니다."""
    return sum(stock.values())

# 한도 미만의 개수를 가진 아이템 리스트
def low_items(stock: Mapping[str, int], limit: int) -> list[str]:
    """딕셔너리 형태의 품목과 한도를 적으면 한도 미만의 품목을 반환합니다."""
    # 리스트 컴프리헨션 사용 — Python 관용 표현으로 가독성 향상
    return [item for item in stock if stock[item] < limit]


# 첫 줄: 품목 수 n, 이어지는 n 줄: "이름 수량", 마지막 줄: 부족 기준
n = int(input())
stock = {}
for _ in range(n):
    name, qty = input().split()
    stock[name] = int(qty)
limit = int(input())


# ---- 호출부 (수정 금지) ----
print("전체 재고 수량:", total_stock(stock))
print("부족 품목(기준 미만):", low_items(stock, limit))
h = get_type_hints(total_stock)
print("total_stock의 stock 힌트가 Mapping[str, int]인가:", h.get("stock") == _STOCK_MAP)
print("total_stock의 반환 힌트가 int인가:", h.get("return") is int)
h = get_type_hints(low_items)
print("low_items의 stock 힌트가 Mapping[str, int]인가:", h.get("stock") == _STOCK_MAP)
print("low_items의 반환 힌트가 list[str]인가:", h.get("return") == list[str])