from typing import get_type_hints


# 클래스 설계도
class Inventory:
    """재고 관리 클래스"""

    # 생성자
    def __init__(self) -> None:
        self.stock: dict[str, int] = {}

    # 타입 힌트를 통해 유지보수 용이성
    def add(self, name: str, qty: int) -> None:
        """입고합니다."""
        self.stock[name] = self.stock.get(name, 0) + qty
        
    # 입고된 재고 목록
    def names(self) -> list[str]:
        """입고된 재고 목록 반환"""
        return list(self.stock.keys())

    # 재고 수량 확인
    def find(self, name: str) -> int | None:
        """찾고자 하는 재고 수량 확인"""
        return self.stock.get(name)
        
    # 현재 객체를 건드리지 않도록 다른 객체로 반환
    def snapshot(self) -> dict[str, int]:
        """현재 재고 관리 딕셔너리 반환"""
        return self.stock.copy()


# 첫 줄: 입고 건수 n. 이어지는 n 줄: "이름 수량" (예: "apple 3" -> ("apple", 3)). 마지막 줄: 조회 이름들
n = int(input())
rows = []
for _ in range(n):
    name, qty = input().split()
    rows.append((name, int(qty)))
queries = input().split()



# ---- 호출부 (수정 금지) ----
inv = Inventory()
for name, qty in rows:
    inv.add(name, qty)
print(inv.names())
snap = inv.snapshot()
print(snap)
print(snap == inv.stock, snap is inv.stock)
for q in queries:
    print(q, inv.find(q))
h = get_type_hints(Inventory.add)
print(h.get("name") is str, h.get("qty") is int, h.get("return") is type(None))
h = get_type_hints(Inventory.names)
print(h.get("return") == list[str])
h = get_type_hints(Inventory.find)
print(h.get("name") is str, h.get("return") == (int | None))
h = get_type_hints(Inventory.snapshot)
print(h.get("return") == dict[str, int])