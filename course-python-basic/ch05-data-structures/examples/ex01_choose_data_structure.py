# 자료구조 선택이 왜 중요한가?
#
# 같은 데이터라도 어떤 자료구조에 담느냐에 따라
# 코드의 구조와 처리 속도가 달라진다.
# 예를 들어, 학생 100명의 이름 중 "김민수"가 있는지 확인해 보자.

# --- 리스트(List)로 담을 때 ---
# 입력한 순서가 유지된다. 대신 포함 여부를 앞에서부터 차례로 확인한다.
students_list = ["이준호", "박서연", "김민수", "최지우"]

if "김민수" in students_list:
    print("학생이 있습니다. (list)")

# --- 집합(Set)으로 담을 때 ---
# 중복을 허용하지 않고, 포함 여부 검사가 매우 빠르다.
students_set = {"이준호", "박서연", "김민수", "최지우"}

if "김민수" in students_set:
    print("학생이 있습니다. (set)")


# --- 데이터가 많아지면? 속도 차이 실험 ---
import time

N = 1_000_000          # 데이터 100만 개
target = N - 1         # 리스트에서는 맨 끝 값을 찾게 되어 오래 걸린다.

big_list = list(range(N))
big_set = set(range(N))

# list 검색: 앞에서부터 하나씩 비교한다.
t = time.perf_counter()
target in big_list
list_time = time.perf_counter() - t

# set 검색: hash를 이용해 확인할 위치를 빠르게 찾는다.
t = time.perf_counter()
target in big_set
set_time = time.perf_counter() - t

print()
print(f"list 검색: {list_time*1000:.2f} ms")
print(f"set  검색: {set_time*1000:.4f} ms")
print(f"set이 약 {list_time/set_time:.0f}배 빠르다")
