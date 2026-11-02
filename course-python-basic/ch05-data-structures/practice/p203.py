# scores 를 순회하면서 `s <= q` 인 개수를 세고, 비율을 백분율로 변환.
scores = [85, 92, 65, 78, 95, 70, 88, 72, 90, 100]
target_score = int(input())

# [알고리즘]
# 입력값 이하의 정수의 개수를 구할 변수 저장
# 점수 리스트 순회하며 점수가 위 변수 이하일 경우 카운트
# 대상값 이하의 정수의 개수에서 전체 개수를 나누고 100을 곱한다
# 그 결과로 나온 백분위 소수점 한자리까지만 출력

# ---대상값 카운트 변수---
count_below_target_score = 0

# ---카운트 문---
for score in scores:
    if score <= target_score:
        count_below_target_score += 1

# ---가독성 향상을 위한 전체 개수, 백분위 저장---
total_count = len(scores)
result = (count_below_target_score / total_count) * 100

# ---소수점 한자리까지만 출력---
print(f"백분위: {result:.1f}")