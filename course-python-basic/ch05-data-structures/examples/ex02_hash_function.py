# hash() — dict와 set이 빠른 이유
#
# hash(x)는 어떤 값을 정수로 바꿔 주는 함수다.
# dict와 set은 이 정수를 이용해 데이터를 저장할 위치와 찾을 위치를 빠르게 계산한다.

import os
import sys
import subprocess

if os.environ.get("PYTHONHASHSEED") != "42":
    os.environ["PYTHONHASHSEED"] = "42"
    sys.exit(subprocess.run([sys.executable] + sys.argv).returncode)

# --- 1. hash의 기본 특징 ---

# 같은 값은 같은 hash 값을 가진다.
print(hash("김민수") == hash("김민수"))   # True

# 서로 다른 값은 보통 서로 다른 hash 값을 가진다.
print(hash("김민수"))
print(hash("박서연"))

# 숫자, 문자열, 튜플처럼 내용이 바뀌지 않는 값은 hash할 수 있다.
print(hash(42))
print(hash((1, 2, 3)))

# list/dict/set은 내용이 바뀔 수 있으므로 hash할 수 없다.
# hash([1, 2])   # TypeError: unhashable type: 'list'


print()
# --- 2. 사물함 비유: hash로 저장 위치를 정한다 ---
# 여러 칸짜리 사물함이 있다고 생각해 보자.
# hash(이름) % 100 → 들어갈 칸 번호

BUCKETS = 10000
lockers = [None] * BUCKETS

names = ["김민수", "박서연", "이준호", "최지우"]
for name in names:
    pos = hash(name) % BUCKETS
    lockers[pos] = name
    print(f"{name} → {pos}번 칸에 보관")


print()
# --- 3. 검색: 같은 계산으로 한 번에 찾는다 ---
target = "김민수"
pos = hash(target) % BUCKETS

print(f"'{target}' 찾기 → {pos}번 칸만 열어 보면 됨")
print(f"결과: {lockers[pos]}")

# list라면 처음부터 끝까지 하나씩 확인해야 한다.
# set/dict는 hash 덕분에 데이터가 아무리 많아져도
# 어디를 확인하면 되는지 빠르게 계산할 수 있어 검색이 빠르다.
