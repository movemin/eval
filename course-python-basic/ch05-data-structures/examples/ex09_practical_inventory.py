# [실무] 재고 관리 — 중첩 dict 다루기 (dict 안의 dict)
#
# 상품 코드(키)마다 상세 정보(dict)를 연결한 구조다.
# 데이터베이스에서 읽어 온 테이블을 메모리에 올린 모습과 비슷하다.

# 상품 코드 → 상품 정보(dict). 상품 정보 안에는 크기 tuple도 들어 있다.
inventory = {
    "A001": {"name": "텀블러", "stock": 12, "price": 15000, "size": (8, 8, 20)},
    "A002": {"name": "노트",   "stock": 0,  "price": 3000,  "size": (15, 21, 1)},
    "A003": {"name": "볼펜",   "stock": 250, "price": 1200, "size": (1, 1, 14)},
}

# --- 1. 특정 상품 정보 꺼내기 ---
item = inventory["A001"]
print(f"{item['name']} — 재고 {item['stock']}개, {item['price']:,}원")
w, d, h = item["size"]                       # tuple 언패킹 (가로, 세로, 높이)
print(f"크기: {w} x {d} x {h} cm")


print()
# --- 2. 전체 순회: 키와 값(dict)을 함께 사용하기 ---
print("[전체 재고]")
for code, info in inventory.items():
    status = "품절" if info["stock"] == 0 else f"{info['stock']}개"
    print(f"  {code} {info['name']:<5} {status}")


print()
# --- 3. 값 수정 (입고 처리) ---
inventory["A002"]["stock"] += 50             # 노트가 50개 입고됨
print("노트 재고:", inventory["A002"]["stock"])


print()
# --- 4. 조건에 맞는 항목만 골라내기 (품절 상품 코드 모으기) ---
sold_out = [code for code, info in inventory.items() if info["stock"] == 0]
print("품절 상품:", sold_out)                 # 위에서 입고 처리했으므로 이제 없음 → []


print()
# --- 5. 집계 (재고 총액 계산) ---
total_value = sum(info["stock"] * info["price"] for info in inventory.values())
print(f"재고 총액: {total_value:,}원")


print()
# --- 6. 새 상품 등록 ---
inventory["A004"] = {"name": "머그컵", "stock": 30, "price": 9000, "size": (9, 9, 10)}
print("등록된 상품 수:", len(inventory))
