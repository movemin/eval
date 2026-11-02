from typing import get_type_hints


# 일당 계산
def day_pay(wage: float, hours: float, bonus: int) -> float:
    """시급을 입력받고 시간과 보너스를 입력받아 일당 반환"""
    return wage * hours + bonus


# 첫 줄: 시급(실수), 둘째 줄: 일한 시간(정수), 셋째 줄: 보너스(정수)
raw_wage: str = input().strip()
hours = int(input())
bonus = int(input())
wage: float = float(raw_wage)  # 입력받은 시급을 소수 자료형으로 변환


# ---- 호출부 (수정 금지) ----
print("시급:", wage)
print("오늘 급여:", day_pay(wage, hours, bonus))
print("wage 변수 힌트가 float인가:", __annotations__.get("wage") is float)
h = get_type_hints(day_pay)
print("wage, hours 힌트가 float인가:", h.get("wage") is float, h.get("hours") is float)
print("bonus 힌트가 int인가:", h.get("bonus") is int)
print("반환 힌트가 float인가:", h.get("return") is float)