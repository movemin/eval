# 첫 줄: 요청 수 n. 이어지는 n 줄: "k v1 ... vk" (예: "3 1 2 3" -> nums = [1, 2, 3], "0" -> nums = [])
n = int(input())
groups = []
for _ in range(n):
    parts = list(map(int, input().split()))
    groups.append(parts[1:1 + parts[0]])


# 오버로딩을 가변인자로 구현하여 매개변수의 개수에 의존되지 않도록 설계
class Calc:
    """합계 계산기"""

    # 클래스 메모리에 올려서 객체를 받지 않고 바로 함수를 참조할 수 있도록 설계
    @staticmethod
    def add(*nums: int) -> int:
        """정수들의 합계를 반환합니다"""
        return sum(nums)


# ---- 호출부 (수정 금지) ----
calc = Calc()
total = []
for nums in groups:
    print(f"add({', '.join(map(str, nums))}) = {Calc.add(*nums)}")   # 클래스 이름으로 호출, 인자 개수 가변
    total.extend(nums)
print("전체 합:", calc.add(*total))