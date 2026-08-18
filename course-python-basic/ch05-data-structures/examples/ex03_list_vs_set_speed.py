# 리스트 vs 집합(set) — hash의 효과를 시간으로 확인하기
#
# 같은 데이터를 list와 set에 똑같이 담고,
# 특정 값이 들어 있는지 확인하는 데 걸리는 시간을 비교한다.
#
#   list : 앞에서부터 하나씩 확인한다.  → 데이터가 많을수록 오래 걸린다.
#   set  : hash로 확인 위치를 계산한다. → 데이터가 많아져도 대체로 빠르다.

import time

# --- 데이터 크기 ---
# 참고: 10억(1_000_000_000)개는 메모리를 수십 GB까지 사용할 수 있어
#       보통 PC에서는 실행하기 어렵다. 1천만 개만으로도 차이를 충분히 확인할 수 있다.
N = 10_000_000          # 데이터 개수: 1천만
SEARCH_COUNT = 100      # 검색을 여러 번 반복해 시간 차이를 더 잘 보이게 한다.

print(f"데이터 {N:,}개를 list와 set에 담는 중...")
data_list = list(range(N))
data_set = set(data_list)
print("준비 완료!\n")

# 일부러 "없는 값"(-1)을 찾는다.
# list는 끝까지 확인해야 하므로 시간이 가장 오래 걸리는 경우가 된다.
target = -1

# --- 1. list에서 검색: 처음부터 끝까지 확인 ---
start = time.perf_counter()
for _ in range(SEARCH_COUNT):
    found = target in data_list
list_time = time.perf_counter() - start

# --- 2. set에서 검색: hash로 확인 위치 계산 ---
start = time.perf_counter()
for _ in range(SEARCH_COUNT):
    found = target in data_set
set_time = time.perf_counter() - start

# --- 3. 결과 비교 ---
print(f"데이터 {N:,}개에서 검색을 {SEARCH_COUNT}번 반복한 시간")
print(f"  list : {list_time:8.4f}초")
print(f"  set  : {set_time:8.4f}초")
print(f"\n→ set이 약 {list_time / max(set_time, 1e-9):,.0f}배 빠르다!")


# --- 4. 데이터가 커질수록 차이가 벌어진다 ---
# 핵심: 데이터가 늘어날수록 list는 확인해야 할 항목도 함께 늘어난다.
# 반면 set은 hash를 이용하므로 검색 시간이 크게 늘어나지 않는다.
print("\n" + "=" * 58)
print("데이터를 키워가며 비교 (없는 값을 20번씩 검색)")
print("=" * 58)
print(f"{'데이터 개수':>12} | {'list':>11} | {'set':>11} | {'배수':>10}")
print("-" * 58)

for n in [10_000, 100_000, 1_000_000, 10_000_000]:
    lst = list(range(n))
    st = set(lst)
    reps = 20

    start = time.perf_counter()
    for _ in range(reps):
        -1 in lst
    lt = time.perf_counter() - start

    start = time.perf_counter()
    for _ in range(reps):
        -1 in st
    stime = time.perf_counter() - start

    print(f"{n:>12,} | {lt:>9.5f}초 | {stime:>9.6f}초 | {lt / max(stime, 1e-9):>8,.0f}배")

print("-" * 58)
print("list: 데이터가 많아질수록 시간도 함께 늘어난다")
print("set : hash를 이용해 검색 시간이 크게 늘지 않는다")
